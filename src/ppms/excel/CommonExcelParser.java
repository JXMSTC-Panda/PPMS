package ppms.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.util.DTDEntityResolver;
import org.springframework.transaction.annotation.Transactional;

import ppms.action.interfaces.ListForCache;
import ppms.annotation.Mark;
import ppms.annotation.ValueChange;
import ppms.annotation.ValueRegE;
import ppms.daoimpl.BaseDaoImp;
import ppms.exception.ErrorInfo;
import ppms.exception.ExcelParserException;


/**
 * 通用excel解析成对象和对象打包成excel文件的解析器
 * 
 * @author shark
 * @version 1.3
 * 
 */
public class CommonExcelParser {

	// 遍历深度记录

	private Class rootClazz;

	private Object child;

	private boolean excute = false;

	private String tempKey = "";
	private boolean isIngore=false;

	private List<ResObject> restrictions;

	private Map<String, List<Object>> finds;

	private String markclass = "";

	private Session session;

	private String last;

	// excel对应的文本对象
	private HSSFWorkbook wb;

	private BaseDaoImp dao;
	// excel表单对象
	private HSSFSheet sh;
	// pio文件流对象
	private POIFSFileSystem ts;

	private FileInputStream myFile;

	private List<ExcelObjStruct> list;

	private HSSFCell cell;

	public CommonExcelParser(HttpServletRequest request, BaseDaoImp dao) {

		// 实例化实体类成员变量和列下标的配置对象的集合
		list = new ArrayList<ExcelObjStruct>();
		// cache = new ArrayList<Object>();
		this.dao = dao;
	}

	public CommonExcelParser(BaseDaoImp dao) {

		// 实例化实体类成员变量和列下标的配置对象的集合
		list = new ArrayList<ExcelObjStruct>();
		// cache = new ArrayList<Object>();

	}

	public HSSFCellStyle buildStyle(int which) {

		HSSFCellStyle style = wb.createCellStyle();
		// 设置这些样式
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 生成一个字体
		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BROWN.index);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// 把字体应用到当前的样式
		style.setFont(font);
		// 生成并设置另一个样式
		HSSFCellStyle style2 = wb.createCellStyle();
		style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
		style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		// 生成另一个字体
		HSSFFont font2 = wb.createFont();
		font2.setColor(HSSFColor.RED.index);
		font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
		// 把字体应用到当前的样式
		style2.setFont(font2);

		if (which == 1) {
			return style;
		} else {
			return style2;
		}
	}

	/**
	 * 将数据库 查询的数据生成excel文件流
	 * 
	 * @param excelRecords
	 *            数据对象集合
	 * @param templateFilePath
	 *            模板excel文件路径
	 * @return
	 */
	public <T> HSSFWorkbook toExcel2(ListForCache<T> excelRecords,
			String fileName) {

		int t1 = 1;
		ExcelParserException exception = new ExcelParserException();
		FileOutputStream fis1 = null;
		FileInputStream fis = null;
		try {

			String path = CommonExcelParser.class.getClassLoader()
					.getResource("configForObject.xml").getPath()
					.replaceFirst("WEB-INF/classes/configForObject.xml", "");
			path = path + "template/custom/" + fileName;
			// 指向模板文件的文件对象
			File file = new File(path);
			// 判断模板文件是否存在，存在继续操作，不存在抛异常
			if (file.exists()) {

				// 获取模板的文件输出流
				fis = new FileInputStream(file);
				// 设置好excel文本对象
				this.setFile(fis);

				HSSFRow ro = null;
				cell = null;

				// 获取模板excel数据写入的行
				int i = 0;
				while ((sh.getRow(i)) != null) {
					i++;
				}

				ro = sh.getRow(0);
				Class clazz;
				// 判断要生成Excel的对象集合是否有数据
				if (excelRecords.getList().size() > 0) {

					// 获取集合中对象的字节码
					clazz = excelRecords.getList().get(0).getClass();
					// 获取对象成员变量和Excel表列名的映射
					List<ExcelObjStruct> list = getFieldReflectToClomnName(
							clazz.getSimpleName(), ro);

					Class tmpClazz = clazz;
					Class<?> type = null;
					Method method = null;
					Object value = "";
					Field field = null;

					HSSFCellStyle style = buildStyle(1);
					String tmpClazzName = null;
					// 生成Excel的第几列的记录数
					int index = i;
					// 遍历要生成Excel的集合
					for (int j = i; j <= excelRecords.getList().size(); j++) {
						// 创建第j行
						ro = sh.createRow(index);
						// 遍历保存对象和Excel列映射关系的集合
						for (ExcelObjStruct eos : list) {

							// 设置序号
							HSSFCell createCell = ro.createCell(0);
							createCell.setCellStyle(style);
							createCell.setCellValue(j);
							// 创建对象实体的成员变量对应的列的单元格
							if (ro.getCell(eos.getIndexInExcel()) == null) {
								cell = ro.createCell(eos.getIndexInExcel());
								cell.setCellStyle(style);
								// 从配置对象中获取成员变量名
								String fieldName = eos.getFieldName();
								// 判断是否包含:判断成员变量是否实体类对象

								Object instance = tmpClazz.newInstance();
								if (fieldName.contains(":")) {

									String[] fields = fieldName.split(":");

									fieldName = fields[fields.length - 1];
									for (int k = 0; k < fields.length - 1; k++) {
										if (value != null) {
											String substring0 = fields[k]
													.substring(0, 1);
											String substring = fields[k + 1]
													.substring(0, 1);
											if (k == 0) {
												value = clazz
														.getMethod(
																"get"
																		+ fields[k + 1]
																				.replaceFirst(
																						substring,
																						substring
																								.toUpperCase()))
														.invoke(excelRecords
																.getList().get(
																		j - i));
											} else {

												tmpClazzName = "ppms.domain."
														+ fields[k]
																.replaceFirst(
																		substring0,
																		substring0
																				.toUpperCase());
												tmpClazz = Class
														.forName(tmpClazzName);
												value = tmpClazz
														.getMethod(
																"get"
																		+ fields[k + 1]
																				.replaceFirst(
																						substring,
																						substring
																								.toUpperCase()))
														.invoke(value);
											}
										} else {
											System.out.println("break");
											break;
										}
									}
									// tmpClazzName =
									// eos.getFieldName().split(":")[0];
									// tmpClazz = Class.forName(tmpClazzName);
									// value = clazz
									// .getMethod(
									// "get"
									// + tmpClazzName
									// .replace(
									// "com.estate.model.",
									// ""))
									// .invoke(excelRecords.getList().get(
									// j - i));
									//
									// fieldName =
									// eos.getFieldName().split(":")[1];

								} else {
									value = excelRecords.getList().get(j - i);
								}

								if (value != null) {
									field = tmpClazz
											.getDeclaredField(fieldName);
									type = field.getType();
									// // 将成员变量首字母大写
									// fieldName =
									// fieldName.replaceFirst(fieldName
									// .substring(0, 1), fieldName.substring(0,
									// 1)
									// .toUpperCase());
									// // 获取成员变量的类型
									//
									// // 获取成员变量对应的get的方法
									// method = tmpClazz.getMethod("get" +
									// fieldName);

									// 获取成员变量上ValueChange注解
									ValueChange vc = field
											.getAnnotation(ValueChange.class);

									// 根据数据类型设置单元格数据
									cell = setValueByType(type.getName(),
											value, eos, cell);
								} else {
									value = "";
								}
							}
							tmpClazz = clazz;
						}
						index++;
						value = "";
					}

				} else {
					System.out.println("no data");
				}

			} else {
				exception.addErrorInfo(new ErrorInfo(1, fileName + "不存在了"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// 关闭流
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				fis = null;
			}
		}
		return wb;
	}

	/**
	 * 将excel文件打包封装成实现了IExcel接口的对象
	 * 
	 * @param myFile
	 *            文件输入流
	 * @return 实现了IExcel接口的对象集合
	 * @throws ExcelParserException
	 *             excel解析异常
	 * 
	 */

	@SuppressWarnings("deprecation")
	@Transactional
	public Map<String, Object> toObjs2(FileInputStream file,
			String myFileFileName, Object spec) throws Exception {

		// 变量定义
		int t = 2;
		ExcelParserException exception = new ExcelParserException();
		Map<String, Object> reslut = new HashMap<String, Object>();
		List<HSSFRow> rows = new ArrayList<HSSFRow>();
		// 保存封装好Excel对应实体类的集合
		// List<Object> objs = null;
		// 文件输入流
		// Excel文件类对应实体类的成员变量数组
		Field[] fields = null;
		// 变量的类型
		Class<?> type = null;
		// 实体类Hibernate映射文件名
		String fileName = "null";
		// 成员变量名
		String fieldName = "not";
		// 保存Excel实体类类名和成员变量对应列名所在下标的映射
		Map<String, List<ExcelObjStruct>> map = null;

		if (file == null) {
			exception.addErrorInfo(new ErrorInfo("文件对象为空"));
			throw new ExcelParserException("文件对象为空");
		} else {
			try {
				// 设置PIO初始化对象
				setFile(file);
				// 实例化excel对应类的实例集合
				// objs = new ArrayList<Object>();
				System.out.println(myFileFileName);
				HSSFRow ro = null;

				// 通过文件获取Excel文件装配成对象的配置（存有Excel文件对应的实体类类名集合）
				List<String> config = ExcelConfig
						.getObjectFromConfig(myFileFileName);
				// key = ExcelConfig
				// .getObjectFromConfig(myFileFileName+"key").get(0);

				// 得到Excel文件的表头
				ro = sh.getRow(0);
				// 从那一列开始遍历（因为有些Excel第一列是序号，没有必要遍历）
				int titleBegin = 0;
				// 获取第一行第一列表头的值
				String fistCell = changeCellToString(ro.getCell(0));
				// 如果等于“序号”,就不要遍历第一列的数据
				if (fistCell.equals("序号")) {
					// 设遍历位置从第二列开始
					titleBegin = 1;
				}
				HSSFCell cell;
				List<ExcelObjStruct> list = null;
				// 实例化
				map = new HashMap<String, List<ExcelObjStruct>>();
				ExcelObjStruct eos;
				// 遍历配置对象
				for (String clazzName : config) {

					// 根据全类名获取类的字节码
					rootClazz = Class.forName(clazzName);
					// 通过类名Hibernate映射文件名
					fileName = rootClazz.getSimpleName();
					// 获取实体类成员变量和列下标的配置对象的集合
					list = getFieldReflectToClomnName(fileName, ro);
					// 添加
					map.put(clazzName, list);
				}
				Object value = null;
				Object object = null;

				List<ExcelObjStruct> clazzList = null;
				// 遍历配置对象
				for (String clazzName : config) {

					Field field;
					Method method = null;
					clazzList = map.get(clazzName);
					Integer integer;
					HSSFCellStyle style = buildStyle(2);
					String type_name;
					Boolean performanceType;
					// 实例化一个Excel对应的对象

					Class tempClazz = rootClazz;
					// 从数据开始的位置开始遍历Excel文件中的数据
					int roEnd = 0;
					for (int j = ExcelConfig.getDataBegin(myFileFileName); (ro = sh
							.getRow(j)) != null; j++) {
						try {

							session = dao.getSessionFactory().openSession();
							Transaction transaction = session
									.beginTransaction();
							finds = new HashMap<String, List<Object>>();
							restrictions = new ArrayList<ResObject>();
							// 遍历实体类成员变量和列下标的配置对象的集合

							for (int m = clazzList.size() - 1; m >= 0; m--) {
								eos = clazzList.get(m);
								// 当前实例赋对应的值
								// 获取成员变量名
								isIngore=false;
								toDo(eos, ro, spec, clazzList, m);
							}
							transaction.commit();
							sh.removeRow(ro);
						} catch (Exception e) {
							e.printStackTrace();

							if (roEnd == 0) {
								int i;
								for (i = 0; ro.getCell(i) != null; i++) {
								}
								roEnd = i;
								sh.getRow(0).createCell(i).setCellValue("错误信息");
								sh.getRow(0)
										.getCell(i)
										.setCellStyle(
												sh.getRow(0).getCell(i - 1)
														.getCellStyle());
							}
							HSSFCell createCell = ro.createCell(roEnd);
							createCell.setCellValue(e.getMessage());
							createCell.setCellStyle(style);
							session.getTransaction().rollback();
							exception.addErrorInfo(new ErrorInfo(j, e
									.getMessage()));
						} finally {
							if (session != null) {
								session.close();
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(fieldName);
			} finally {

			}
		}
		reslut.put("wb", wb);
		reslut.put("exceptions", exception);
		return reslut;

	}

	public void toDo(ExcelObjStruct eos, HSSFRow ro, Object spec,
			List<ExcelObjStruct> clazzList, int m) throws Exception {
		try {
			String name;
			String next;
			String[] split;
			String[] split2;
			String key;
			List<Object> findInMap = null;
			if (eos.getFieldName().contains(":")) {

				name = eos.getFieldName();
				split = eos.getFieldName().split(":");

				if (last != null) {
					if (split.length < 3) {
						findInMap = finds.get(split[0]);
					} else {
						findInMap = finds.get(split[split.length - 3]);
					}
				}
				if (m - 1 >= 0) {
					String[] slpit2 = clazzList.get(m - 1).getFieldName()
							.split(":");
					next = clazzList.get(m - 1).getFieldName()
							.replace(":" + slpit2[slpit2.length - 1], "");
				} else {
					next = null;
				}
				name = name.replace(":" + split[split.length - 1], "");
				completeObj(rootClazz, eos.getFieldName(),
						eos.getIndexInExcel(), ro, rootClazz.getSimpleName());
				if (!name.equals(next)) {
					excute = true;
					key = split[split.length - 2];
					Class entityClazz = Class.forName("ppms.domain."
							+ key.replaceFirst(key.substring(0, 1), key
									.substring(0, 1).toUpperCase()));

					// 判断缓存中是否存在该类型实例
					List find = null;
					if (excute) {
						excute = false;
						if (restrictions.size() > 0) {
							Criteria criteria = session
									.createCriteria(entityClazz);
							String[] split3;
							for (ResObject rso : restrictions) {
								
									if(!rso.getCloumn().equals("houseArea")){
									criteria.add(Restrictions.eq(rso.getCloumn(),
											rso.getObject()));
									isIngore=isIngore||true;
							}
							find = criteria.list();
							}
							Object instance = null;
							if (findInMap != null) {

								instance = entityClazz.newInstance();

								if (find == null || find.size() < 1) {
									String columnName;
									for (ResObject rso : restrictions) {
										columnName = rso.getCloumn();
										columnName = columnName.replaceFirst(
												columnName.substring(0, 1),
												columnName.substring(0, 1)
														.toUpperCase());
										entityClazz.getDeclaredMethod(
												"set" + columnName,
												rso.getObject().getClass())
												.invoke(instance,
														rso.getObject());

									}

									if (spec != null) {
//										if (instance instanceof DataInfo) {
//											instance = (DataInfo) instance;
//											((DataInfo) instance)
//													.setChargeType((ChargeType) spec);
//										}
									}
									session.save(instance);
									List<Object> saves = new ArrayList<Object>();
									saves.add(instance);
									finds.put(key, saves);
								} else {

									if (find.size() > 1) {
										throw new RuntimeException(
												"数据不唯一，请确认，建议从管理平台页面录入该数据");
									}
									instance = find.get(0);
									finds.put(key, find);
								}

								Object parent = findInMap.get(0);

								// 将子的值设置到父对象
								String methodName = split[split.length - 2];

								System.out.println(methodName);
								methodName = methodName.replaceFirst(methodName
										.substring(0, 1),
										methodName.substring(0, 1)
												.toUpperCase());
								if (parent.getClass()
										.getDeclaredMethod("get" + methodName)
										.invoke(parent) == null) {

									parent.getClass()
											.getDeclaredMethod(
													"set" + methodName,
													entityClazz)
											.invoke(parent, instance);

									Field rootID = parent.getClass()
											.getDeclaredFields()[0];
									String IdName = rootID.getName();
									IdName = IdName.replaceFirst(IdName
											.substring(0, 1),
											IdName.substring(0, 1)
													.toUpperCase());
									if (parent.getClass()
											.getMethod("get" + IdName)
											.invoke(parent) != null) {
//										if(parent instanceof House){
//											((House)parent).setHouseState(true);
//										}
										session.update(parent);
									} else {

//										if (spec != null) {
//											if (instance instanceof DataInfo) {
//												instance = (DataInfo) instance;
//												((DataInfo) instance)
//														.setChargeType((ChargeType) spec);
//
//											}
//										}
										session.save(parent);
									}
								} else {
									// 校验对应列存在数据，和Excel中的新数据校验

								}
							} else {
								if (find.size() < 1||isIngore) {
									Object save ;
									if(find.size()==1){
										save=find.get(0);
									}else{
										save= entityClazz.newInstance();
									}
									String columnName = "";
									for (ResObject rso : restrictions) {
										columnName = rso.getCloumn();
										columnName = columnName.replaceFirst(
												columnName.substring(0, 1),
												columnName.substring(0, 1)
														.toUpperCase());
										entityClazz.getDeclaredMethod(
												"set" + columnName,
												rso.getObject().getClass())
												.invoke(save, rso.getObject());

									}
									if (spec != null) {
//										if (save instanceof DataInfo) {
//											((DataInfo) save)
//													.setChargeType((ChargeType) spec);
//
//											if (((DataInfo) save)
//													.getLastMouthEread() > ((DataInfo) save)
//													.getThisMouthEread()) {
//
//												throw new RuntimeException(
//														"上月读数大于本月读数");
//											} else {
//												((DataInfo) save)
//														.setUseCount(((DataInfo) save)
//																.getThisMouthEread()
//																- ((DataInfo) save)
//																		.getLastMouthEread());
//											}
//										}
									}
									session.saveOrUpdate(save);
									find.add(save);
								}
								finds.put(key, find);
							}
						}

						restrictions = new ArrayList<ResObject>();
					}

				}
				last = name;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}

	}

	/**
	 * 设置模板excel文件,给HSSFWorkbook赋值
	 * 
	 * @param templateFilePath
	 */
	private void setFile(FileInputStream file) {

		// 获取指向该excel的POIFSFileSystem实例
		try {
			ts = new POIFSFileSystem(file);
			wb = new HSSFWorkbook(ts);
			sh = wb.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 将配置文件中对于对象属性对应列的配置信息转为Integer数组
	 * 
	 * @param fieldIndex
	 *            配置文件中的配置字符串
	 * @return 转换后的Integer数组
	 */
	private List<Integer[]> getIndexs(String fieldIndex) {

		Integer[] indexs;
		List<Integer[]> objIndex = new ArrayList<Integer[]>();
		int item;

		// 根据':'切割字符串
		String[] split = fieldIndex.split(":");
		for (String string : split) {

			// 根据','切割字符串
			String[] split2 = string.split(",");
			indexs = new Integer[split2.length];
			for (int i = 0; i < split2.length; i++) {
				indexs[i] = item = Integer.parseInt(split2[i]);
			}
			objIndex.add(indexs);
		}
		return objIndex;
	}

	/**
	 * 根据单元格中的数据类型获取数据
	 * 
	 * @param cell
	 *            单元格对象
	 * @return
	 */
	private String changeCellToString(HSSFCell cell) {

		String returnValue = "";
		if (null != cell) {
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC: // 数字
				Double doubleValue = cell.getNumericCellValue();
				String str = doubleValue.toString();
				if (str.contains(".0")) {
					str = str.replace(".0", "");
					Integer intValue = Integer.parseInt(str);
					returnValue = intValue.toString();
				} else {
					return doubleValue.toString();
				}

				break;
			case HSSFCell.CELL_TYPE_STRING: // 字符串

				returnValue = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN: // 布尔
				Boolean booleanValue = cell.getBooleanCellValue();
				returnValue = booleanValue.toString();
				break;
			case HSSFCell.CELL_TYPE_BLANK: // 空值
				returnValue = "";
				break;
			case HSSFCell.CELL_TYPE_FORMULA: // 公式

				returnValue = cell.getCellFormula();
				break;
			case HSSFCell.CELL_TYPE_ERROR: // 故障
				returnValue = "";
				break;
			default:
				System.out.println("未知类型");
				break;
			}
		}
		return returnValue;
	}

	/**
	 * 根据数据类型设置单元格的值
	 * 
	 * @param type_name
	 * @param obj
	 * @param method
	 * @param eos
	 * @param cell
	 * @return
	 * @throws Exception
	 */
	public HSSFCell setValueByType(String type_name, Object value,
			ExcelObjStruct eos, HSSFCell cell) throws Exception {

		try {

			System.out.println(eos.getFieldName());
			if (value != null) {
				// 根据成员变量的类型获取单元格数据
				switch (type_name) {
				// 成员变量为String时
				case "java.lang.String":
					// 调用方法获取，并强转
					cell.setCellValue((String) value);
					break;
				// 成员变量类型为int时
				case "java.lang.Integer":
					// 获取单元格中的数据，转为String
					// 转为Integer
					value = (Integer) value;
					if (eos.getValue((Integer) value) != null) {
						cell.setCellValue(eos.getValue((Integer) value));
					} else {
						cell.setCellValue((Integer) value);
					}
					break;
				case "java.util.Date":
					value = (Date) value;

					// 时间格式转换
					String result = (((Date) value).getYear() + 1900) + "年"
							+ (((Date) value).getMonth() + 1) + "月"
							+ ((Date) value).getDate() + "日";
					System.out.println(result);
					cell.setCellValue(result);
					break;
				case "java.lang.Boolean":
					if ((Boolean) value) {
						value = eos.getValue(1);
					} else {
						value = eos.getValue(0);
					}

					cell.setCellValue((String) value);

					break;
				case "java.lang.Short":
					cell.setCellValue((Short) value);
					break;
				case "java.lang.Double":
					cell.setCellValue((Double) value);
					break;
				default:
					cell.setCellValue((String) value);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cell;
	}

	/**
	 * 匹配成员变量和Excel列得映射关系
	 * 
	 * @param fileName
	 *            文件名，类名
	 * @param ro
	 *            Excel文件的第一行，即表头
	 * @return
	 */
	public List<ExcelObjStruct> getFieldReflectToClomnName(String fileName,
			HSSFRow ro) {
		String tempClassName = null;
		if (markclass == null || "".equals(markclass)) {
			tempClassName = fileName.replaceFirst(fileName.substring(0, 1),
					fileName.substring(0, 1).toLowerCase()) + ":";
			markclass += tempClassName;
		}

		int t = 1;
		// 获取Hibernate映射文件的位置
		String path = CommonExcelParser.class
				.getClassLoader()
				.getResource("configForObject.xml")
				.getPath()
				.replace("configForObject.xml",
						"ppms/domain/" + fileName + ".hbm.xml");
		try {

			// 获取指向Hibernate映射文件的文件对象
			File file = new File(path);
			// 获取文件输入流
			FileInputStream fis = new FileInputStream(file);

			// 实例化xml解析对象
			SAXReader reader = new SAXReader();
			reader.setEntityResolver(new DTDEntityResolver());
			// 获取文档对象
			Document dom = reader.read(fis);

			System.out.println(System.currentTimeMillis());

			// 获取根节点
			Element root = dom.getRootElement();
			// 获取class节点
			Element element = root.element("class");

			// 获取class节点下的所有节点
			List<Element> elements = element.elements();

			ExcelObjStruct eos = null;
			String fieldName = null;

			// 遍历class节点下的所有节点
			for (Element element2 : elements) {

				// 节点为“many-to-one”时
				if (element2.getName().equals("many-to-one")) {
					String className = element2.attribute("class").getText()
							.trim();
					String[] split = className.split("[.]");
					tempClassName = split[split.length - 1];
					if (!markclass.contains(tempClassName))
						markclass += tempClassName.replaceFirst(tempClassName
								.substring(0, 1), tempClassName.substring(0, 1)
								.toLowerCase())
								+ ":";
					getFieldReflectToClomnName(tempClassName, ro);
					if (tempClassName != null) {
						markclass = markclass.replaceAll(
								":"
										+ tempClassName.replaceFirst(
												tempClassName.substring(0, 1),
												tempClassName.substring(0, 1)
														.toLowerCase()), "");
					}
					// eos = new ExcelObjStruct();
					// // 获取成员变量名
					// fieldName =
					// element2.attribute("name").getText().trim();
					// // 因为是many-to-one节点配置的是 成员变量类型是实体类，所以加“:”做标记，并存储他的全类名
					// fieldName = fieldName + ":"
					// + element2.attribute("class").getText().trim();
					// eos.setFieldName(fieldName);
					// 如果节点为“property”
				} else if (element2.getName().equals("property")
						|| element2.getName().equals("id")) {

					eos = new ExcelObjStruct();
					// 获取成员变量名
					fieldName = markclass
							+ element2.attribute("name").getText();
					eos.setFieldName(fieldName);

				}
				if (element2.getName().equals("property")
						|| element2.getName().equals("id")) {

					// 获取comment节点的值，即该成员变量对应Excel文件的表头的值
					Element comment = element2.element("column").element(
							"comment");
					if (comment != null) {

						String commentText = comment.getText();
						// 如果comm的值包含“:”,说明对该列数据有特殊说明，一定的约束
						if (commentText.contains(":")) {

							// 赋值一个和comment同值得对象
							String temp = String.copyValueOf(commentText
									.toCharArray());
							// 替换
							temp = temp.replace("(月)", "").replace("(年月日)", "");
							// 切割
							commentText = commentText.split("[(]")[0].trim();
							// 切割
							String[] split = temp.split("[(]");

							String descs = split[1].substring(0,
									split[1].length() - 1);
							String[] split2 = descs.split(" ");
							for (String string : split2) {

								// 获取对所在列值得约束，并存储
								int key = Integer.valueOf(string.split(":")[0]);
								String value = string.split(":")[1];
								eos.setDesc(key, value);
							}
						}
						// 标记是否有找到该成员变量对应的列

						// if (commentText.equals("备注") && parserCount > 0) {
						// System.out.println("不是一级备注");
						// } else {

						boolean isNot = false;
						// 遍历第一列表头
						for (int i = 0; ro.getCell(i) != null; i++) {

							// 获取单元格的值
							String value = changeCellToString(ro.getCell(i));

							if (commentText.equals("月份/年份")
									&& value.equals("年份")) {

								value = commentText;
								eos.setFieldName(eos.getFieldName() + "?1");
							}
							if (commentText.equals("月份/年份")
									&& value.equals("月份")) {

								value = commentText;
								eos.setFieldName(eos.getFieldName() + "?0");
							}
							// 如果实体类的注释和表头相等，即找到了实体类成员变量对应Excel的列
							if (value.startsWith(commentText)) {

								// 存储列号
								eos.setIndexInExcel(i);
								// 找到了,设为true
								isNot = true;
								break;
								// 中断遍历
								// eos = new ExcelObjStruct();
								// eos.setFieldName(fieldName);
							}
						}
						if (isNot) {
							list.add(eos);
						}
					}
				}
				// }
				System.out.println(System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 检验是否要用该值去查数据库
	 * 
	 * @param clazz
	 * @return
	 */
	// private Object isInCache(Class clazz) {
	//
	// for (Object obj : cache) {
	// if (obj.getClass().getName().equals(clazz.getName())) {
	// return obj;
	// }
	// }
	// return null;
	// }

	@SuppressWarnings("deprecation")
	private void completeObj(Class preClazz, String fieldName, int index,
			HSSFRow ro, String tempKey) throws Exception {

		Class tempClazz = null;
		String str = null;
		Object instance = null;
		List<Object> findInMap = null;
		String sql = null;

		String[] split = fieldName.split(":");
		str = split[1];
		if (split.length == 2) {
			fieldName = fieldName.replaceFirst(":" + str, "");
		} else {
			fieldName = fieldName.replaceFirst(":" + str + ":", ":");
		}

		String str2 = str.replaceFirst(str.substring(0, 1), str.substring(0, 1)
				.toUpperCase());
		if (!fieldName.equalsIgnoreCase(rootClazz.getSimpleName())) {
			tempClazz = Class.forName("ppms.domain." + str2);
			completeObj(tempClazz, fieldName, index, ro, str2);

			// 获取关联对象的集合
			List<Object> list2 = finds.get(str2);
			if (list2 != null) {
				// // 遍历清除多余的项，或者完整数据项
				//
				// String child = split[1];
				// child = child.replaceFirst(child.substring(0, 1), child
				// .substring(0, 1).toUpperCase());
				//
				// // if (list2.size() < 1) {
				// // new RuntimeException("数据异常");
				// // }
				// Class childClazz = Class.forName("com.estate.model."
				// + child);
				// Field id = childClazz.getDeclaredFields()[0];
				// String name = id.getName();
				// name = name.replaceFirst(name.substring(0, 1), name
				// .substring(0, 1).toUpperCase());

				// 获取父对象在缓存中的集合
				findInMap = finds.get(tempKey);
				// 判断缓存中是否存在该类型实例
				if (findInMap == null) {
					restrictions.add(new ResObject(str, list.get(0)));
				}
				// else {
				// // 存在
				// Method getOrset = preClazz.getDeclaredMethod("get"
				// + str2);
				// for (Object object : findInMap) {
				// // 遍历缓存中的对象获取他们的属性值
				// Object obj = getOrset.invoke(object);
				// if (obj == null) {
				// // 获得当前父类中包含的该类型实例为空
				// getOrset = preClazz.getDeclaredMethod("set"
				// + str2, tempClazz);
				// // 设置值
				// getOrset.invoke(object, list2.get(i));
				// } else {
				// // 如果不为空，校验两者数据是否一致
				// Class check = list2.get(0).getClass();
				// Field field = check.getDeclaredFields()[0];
				// String name2 = field.getName();
				// name2 = name2.replaceFirst(
				// name2.substring(0, 1),
				// name2.substring(0, 1).toUpperCase());
				// Method checkMethod = check
				// .getDeclaredMethod("get" + name2);
				// Object checkValue = checkMethod.invoke(list2
				// .get(i));
				// Object inMap = checkMethod.invoke(obj);
				// if (inMap != checkValue) {
				// // 不一致，移除该子对象
				// list2.remove(list2.get(i));
				// } else {
				//
				// }
				// }
				// }
				// // 当父缓存只有一个对象
				// if (findInMap.size() == 1) {
				// // 当子缓存一个对象
				// if (list2.size() == 1) {
				// Object parent = findInMap.get(0);
				// // 将子的值设置到父对象
				// if (parent.getClass()
				// .getDeclaredMethod("get" + str2)
				// .invoke(parent) == null) {
				// parent.getClass()
				// .getDeclaredMethod("set" + str2,
				// tempClazz)
				// .invoke(parent, list2.get(0));
				// session.update(parent);
				// }
				// List<Object> listchild = new ArrayList<Object>();
				// listchild.add(parent);
				// finds.put(tempKey, listchild);
				// }
				// }
				// }
			}

			// String sqlKey =fieldName;
			// String[] split2 = sqlKey.split(":");
			// sqlKey=sqlKey.replace(split2[split2.length-1],"");
			// sql = sqls.get(sqlKey);

		} else {
			Object value;
			String type_name;
			Field field = preClazz.getDeclaredField(str);

			Method method = preClazz.getDeclaredMethod("set" + str2,
					field.getType());
			// 获取成员变量所对应的set方法

			type_name = field.getType().getName();

			Mark annotation = field.getAnnotation(Mark.class);
			if (annotation == null) {
				cell = ro.getCell(index);
			} else {
				cell = sh.getRow(annotation.row()).getCell(annotation.clomn());
			}
			ValueRegE valueRegE = null;
			Field field3 = null;
			Pattern pattern = null;
			Matcher matcher = null;
			// 根据成员变量的类型获取单元格数据
			switch (type_name) {
			// 成员变量为String时
			case "java.lang.String":
				// 调用方法获取，并强转
				value = (String) changeCellToString(cell);
				// if(isSame){
				// sql+=" and "+str+"='"+value+"'";
				// }else{
				// sql = "from " + preClazz.getSimpleName() + " where " + str
				// + "='" + value + "'";
				// // }

				field3 = preClazz.getDeclaredField(str);
				valueRegE = field3.getAnnotation(ValueRegE.class);
				if (valueRegE != null) {

					String[] reg = valueRegE.reg();

					boolean isRight = false;
					for (String string : reg) {
						pattern = Pattern.compile(string);
						matcher = pattern.matcher(value.toString().trim());
						isRight = matcher.matches() || isRight;
					}
					if (!isRight) {
						throw new RuntimeException(value + "不符合该列对应值的格式，请检查");
					}
				}
				findInMap = finds.get(tempKey);
				if (findInMap == null) {
					restrictions.add(new ResObject(str, value));
				}
				// else {
				//
				// if (findInMap.size() == 1) {
				// //
				// Object lastValue = preClazz.getDeclaredMethod(
				// "get" + str2).invoke(findInMap.get(0));
				// if (lastValue.equals(value)) {
				//
				// } else if (lastValue.equals("未填写")) {
				// preClazz.getDeclaredMethod("set" + str2,
				// java.lang.String.class).invoke(
				// findInMap.get(0), value);
				// Field field2 = preClazz.getDeclaredFields()[0];
				// String name = field2.getName();
				// name = name.replaceFirst(name.substring(0, 1), name
				// .substring(0, 1).toUpperCase());
				// Method method2 = preClazz.getMethod("get" + name);
				// if (method2.invoke(findInMap.get(0)) != null) {
				// session.update(findInMap.get(0));
				// }
				// } else {
				// throw new RuntimeException(value + "  有误请检查可能值为"
				// + lastValue);
				// }
				// } else {
				// Field field2 = preClazz.getDeclaredFields()[0];
				// String name = field2.getName();
				// name = name.replaceFirst(name.substring(0, 1), name
				// .substring(0, 1).toUpperCase());
				// Method method2 = preClazz.getMethod("get" + name);
				// Method getOrSet = preClazz.getDeclaredMethod("get"
				// + str2);
				// for (Object object : findInMap) {
				// Object obj = getOrSet.invoke(object);
				//
				// if (obj == null || "未填写".equals(obj)) {
				// getOrSet = preClazz.getDeclaredMethod("set"
				// + str2, java.lang.Integer.class);
				// getOrSet.invoke(object, value);
				//
				// if (method2.invoke(object) != null) {
				// session.update(object);
				// }
				// } else {
				// if (!obj.equals(value)) {
				//
				// findInMap.remove(obj);
				// }
				// }
				// }
				// }
				// }
				break;
			// 成员变量类型为int时
			case "int":
				// 获取单元格中的数据，转为String
				value = (String) changeCellToString(cell);

				pattern = Pattern.compile("[0-9]+.*[0-9]*");
				matcher = pattern.matcher(value.toString().trim());

				if (!matcher.matches()) {

					throw new RuntimeException(value + "不是数字");
				}

				// 转为Integer
				value = (Integer) Integer.valueOf(value.toString());
				//
				// if(isSame){
				// sql=" and "+str+"="+value;
				// }else{
				findInMap = finds.get(tempKey);
				if (findInMap == null) {
					restrictions.add(new ResObject(str, value));
				}
				break;
			case "java.util.Date":
				value = (Date) cell.getDateCellValue();
				// 时间格式转换
				String result = (((Date) value).getYear() + 1900) + "年"
						+ (((Date) value).getMonth() + 1) + "月"
						+ ((Date) value).getDate() + "日";
				System.out.println(result);
				break;
			case "java.lang.Boolean":
				value = changeCellToString(cell);
				// int key = eos.getKey(value);
				// if (key == 1) {
				// value = true;
				// }
				// if (key == 0) {
				// value = false;
				// }
				break;
			case "java.lang.Integer":
				value = changeCellToString(cell);

				pattern = Pattern.compile("[0-9]+.*[0-9]*");
				matcher = pattern.matcher(value.toString().trim());

				if (!matcher.matches()) {

					throw new RuntimeException(value + "不是数字");
				}
				// if (eos.getKey(value) != Integer.MAX_VALUE)
				// value = eos.getKey(value);
				value = Integer.valueOf((String) value);
				findInMap = finds.get(tempKey);
				if (findInMap == null) {
					restrictions.add(new ResObject(str, value));
				}
				break;
			case "java.lang.Short":
				value = Short.valueOf(changeCellToString(cell));
				break;
			case "java.lang.Double":
				value = (String) changeCellToString(cell);

				if(((String)value).contains("d")){
					throw new RuntimeException(value + "不是数字");
				}
				if(((String)value).contains("f")){
					throw new RuntimeException(value + "不是数字");
				}
				pattern = Pattern.compile("[0-9]+.*[0-9]*");
				matcher = pattern.matcher(value.toString().trim());

				if (!matcher.matches()) {

					throw new RuntimeException(value + "不是数字");
				}

				// 转为Integer
				value = Double.valueOf(value.toString());
				//
				// if(isSame){
				// sql=" and "+str+"="+value;
				// }else{
				findInMap = finds.get(tempKey);
				if (findInMap == null) {
					restrictions.add(new ResObject(str, value));
				}
				break;
			default:
				value = changeCellToString(cell);
				break;
			}
		}
	}
	
}
