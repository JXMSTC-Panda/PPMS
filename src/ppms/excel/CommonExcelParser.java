package ppms.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.format.CellTextFormatter;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.util.DTDEntityResolver;

import ppms.action.interfaces.ListForCache;
import ppms.annotation.Mark;
import ppms.annotation.ValueChange;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbInnovation;
import ppms.domain.TbMaster;
import ppms.domain.TbMonitorcheck;
import ppms.domain.TbPerformance;
import ppms.domain.TbPoint;
import ppms.domain.TbPointdetail;
import ppms.domain.TbVisitcheck;
import ppms.excel.template.BaseExcelObject;
import ppms.excel.template.IExcelTemp;
import ppms.exception.ErrorInfo;
import ppms.exception.ExcelParserException;
import ppms.util.TimeStringUtils;

/**
 * 通用excel解析成对象和对象打包成excel文件的解析器
 * 
 * @author shark
 * @version 1.1(excel解析成对象完成)
 * 
 */
public class CommonExcelParser {

	// 遍历深度记录
	private int parserCount;
	// excel对应的文本对象
	private HSSFWorkbook wb;
	// excel表单对象
	private HSSFSheet sh;
	// pio文件流对象
	private POIFSFileSystem ts;

	private FileInputStream myFile;

	private List<ExcelObjStruct> list;

	private BaseDaoImp dao;

	private List<Object> cache;

	private boolean remarkFlag;

	private ExcelParserException exception;
	private HSSFCell cell;
	private Transaction transaction;
	private Session session;

	public CommonExcelParser(BaseDaoImp dao, ExcelParserException exception) {

		// 实例化实体类成员变量和列下标的配置对象的集合
		list = new ArrayList<ExcelObjStruct>();
		cache = new ArrayList<Object>();
		this.dao = dao;
		this.exception = exception;
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
	public HSSFWorkbook toExcel2(ListForCache<Object> excelRecords,
			String fileName) {

		int t1 = 0;
		FileOutputStream fis1 = null;
		FileInputStream fis = null;
		try {

			String path = CommonExcelParser.class.getClassLoader()
					.getResource("configForObject.xml").getPath()
					.replaceFirst("WEB-INF/classes/configForObject.xml", "");
			path = path + "template/out/" + fileName;
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
							clazz.getName(), ro);

					Class tmpClazz = clazz;
					Class<?> type = null;
					Method method = null;
					Object value = null;
					Field field = null;

					// 设置单元格格式
					HSSFCellStyle style = wb.createCellStyle();
					style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
					HSSFFont font = wb.createFont();
					style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
					style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
					font.setFontName("宋体");
					font.setFontHeightInPoints((short) 10);

					String tmpClazzName = null;

					// 判断表头是月份还是年份的标记
					boolean isMonth = false;
					if (fileName.equals("年度绩效批量导出.xls")) {

						isMonth = true;
						HSSFCell cell2 = sh.getRow(0).getCell(6);
						cell2.setCellStyle(style);
						cell2.setCellValue("年份");
					}
					if (fileName.equals("月度绩效批量导出.xls")) {
						isMonth = false;
						HSSFCell cell2 = sh.getRow(0).getCell(6);
						cell2.setCellStyle(style);
						cell2.setCellValue("月份");
					}
					// 生成Excel的第几列的记录数
					int index = i;
					// 遍历要生成Excel的集合
					for (int j = i; j <= excelRecords.getList().size(); j++) {
						// 创建第j行
						ro = sh.createRow(index);
						// 偏大是否是创新提案
						if (clazz.getName().equals("ppms.domain.TbInnovation")) {

							TbInnovation innovation = (TbInnovation) excelRecords
									.getList().get(j - i);
							cell = ro.createCell(7);
							cell.setCellStyle(style);
							// 根据数据判断是什么类型的创新
							if (innovation.getTbEmployee() != null) {
								cell.setCellValue("个人创新");
							} else {
								cell.setCellValue("团队创新");
							}
						}
						// 遍历保存对象和Excel列映射关系的集合
						for (ExcelObjStruct eos : list) {

							// 设置序号
							ro.createCell(0).setCellValue(j);
							// 创建对象实体的成员变量对应的列的单元格
							cell = ro.createCell(eos.getIndexInExcel());
							cell.setCellStyle(style);
							// 从配置对象中获取成员变量名
							String fieldName = eos.getFieldName();

							// 通过判断“?”好区分 月份 和年份表头
							if (fieldName.contains("?")) {
								// 切割
								String[] split = fieldName.split("[?]");
								// 重设成员变量名
								fieldName = split[0];
								TbPerformance performance = (TbPerformance) excelRecords
										.getList().get(j - i);
								Boolean performancetype = performance
										.getPerformancetype();
								if (performancetype != null
										&& !performancetype.equals(isMonth)) {
									break;
								}
							}
							// 判断是否包含:判断成员变量是否实体类对象
							if (fieldName.contains(":")) {
								tmpClazzName = eos.getFieldName().split(":")[0];
								tmpClazz = Class.forName(tmpClazzName);
								value = clazz.getMethod(
										"get"
												+ tmpClazzName.replace(
														"ppms.domain.", ""))
										.invoke(excelRecords.getList().get(
												j - i));

								fieldName = eos.getFieldName().split(":")[1];

							} else {
								value = excelRecords.getList().get(j - i);
							}
							field = tmpClazz.getDeclaredField(fieldName);
							type = field.getType();
							// 将成员变量首字母大写
							fieldName = fieldName.replaceFirst(fieldName
									.substring(0, 1), fieldName.substring(0, 1)
									.toUpperCase());
							// 获取成员变量的类型

							// 获取成员变量对应的get的方法
							method = tmpClazz.getMethod("get" + fieldName);

							// 获取成员变量上ValueChange注解
							ValueChange vc = field
									.getAnnotation(ValueChange.class);
							// 如果该注解不为空，说明该成员变量的值需要通过字典表转换
							if (vc != null) {

								// 查询字典表
								String hsql = "from "
										+ vc.tb_name()
										+ " where Type='"
										+ vc.key_type()
										+ "' and "
										+ " key="
										+ method.invoke(excelRecords.getList()
												.get(j - i));
								System.out.println(hsql);
								List<TbMaster> find = dao
										.getHibernateTemplate().find(hsql);
								if (find.size() >= 1) {
									cell.setCellValue(find.get(0).getValue());
								}
							} else {

								// 根据数据类型设置单元格数据
								cell = setValueByType(type.getName(), value,
										method, eos, cell);
							}
							tmpClazz = clazz;
						}
						index++;
					}

					if (fileName.equals("积分批量导出(主厅).xls")) {
						complexExcel(15, excelRecords);
					}

					if (fileName.equals("积分批量导出(合作厅).xls")) {
						complexExcel(13, excelRecords);
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

	@SuppressWarnings("deprecation")
	private void complexExcel(int colNum, ListForCache<Object> excelRecords) {

		int t=0;
		int i = 0;
		HSSFRow ro;
		TbPoint point;
		int mark = colNum;
		Session openSession = dao.getSessionFactory().openSession();
		try {
			for (Object obj : excelRecords.getList()) {
				point = (TbPoint) obj;

				openSession.beginTransaction();

				List<TbPointdetail> pointdetails = openSession.createCriteria(TbPointdetail.class).add(Restrictions.eq("pointid", point.getPointid())).list();

				
				if (i == 0) {
					ro = sh.getRow(i);
					for (TbPointdetail tbPointdetail : pointdetails) {
						ro.createCell(colNum).setCellValue(
								tbPointdetail.getOperationname());
						colNum++;
					}
					colNum = mark;
					i++;
				}
				for (TbPointdetail tbPointdetail : pointdetails) {
					ro=sh.createRow(i);
					ro.createCell(colNum).setCellValue(
							tbPointdetail.getOperationscore());
				}
				colNum = mark;
			}
			openSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
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
	public <T extends BaseExcelObject> OutputStream toExcel(
			List<T> excelRecords, String templateFilePath) {

		FileOutputStream fis1 = null;
		FileInputStream fis = null;
		try {

			// 指向模板文件的文件对象
			File file = new File(templateFilePath);
			// 判断模板文件是否存在，存在继续操作，不存在抛异常
			if (file.exists()) {

				// 获取模板的文件输出流
				fis = new FileInputStream(templateFilePath);
				// 设置好excel文本对象
				// this.setFile(fis);

				HSSFRow ro = null;
				HSSFCell cell = null;

				// 获取模板excel数据写入的行
				int i = 0;
				while ((sh.getRow(i)) != null) {
					i++;
				}

				// 获取封装数据对象的字节码
				Class<IExcelTemp> clazz = (Class<IExcelTemp>) excelRecords.get(
						0).getClass();

				// 获取成员变量
				Field[] fields = fields = clazz.getDeclaredFields();
				Method method = null;
				// 遍历封装对象集合
				for (int j = i; j < excelRecords.size() + i; j++) {

					// 创建第j行
					ro = sh.createRow(j);
					// 获取封装对象集合里的第一个对象实例
					IExcelTemp it = excelRecords.get(j - i);
					int cursor = 0;

					// d迭代封装数据类的成员变量，成员变量值和单元格一一对应
					for (Field field : fields) {

						// 获取成员变量名
						String fieldName = field.getName();
						// 将首字母转大写
						fieldName = fieldName.replaceFirst(
								fieldName.substring(0, 1),
								fieldName.substring(0, 1).toUpperCase());
						// 获取成员变量对应的get方法
						method = clazz.getMethod("get" + fieldName);
						// 动态调用封装对象的方法
						Object value = method.invoke(it);
						// 获取成员变量的类型名称
						String type_name = field.getType().getName();
						// 如果当前为j行的第0个单元格
						if (cursor == 0) {
							// 创建单元格
							cell = ro.createCell(cursor);
							// 设置单元格的值，这个值为数据行的第几行
							cell.setCellType(cursor + i);
							cursor++;
						}
						// 创建单元格
						cell = ro.createCell(cursor);
						// 根据成员变量的类型进行类型转换，并调用对应的cell的重载方法
						switch (type_name) {
						case "int":
							cell.setCellValue((int) value);
							break;
						case "java.lang.String":
							cell.setCellValue((String) value);
							break;
						case "duoble":

							break;
						case "Java.util.Date":

							// 将java.sql的日期转为Java.util的日期
							cell.setCellValue((Date) value);
							break;
						default:
							System.out.println("无效类型");
							break;
						}
						cursor++;
					}
				}

				// 写入文件
				File file2 = new File("D:/test.xls");
				fis1 = new FileOutputStream(file);
				wb.write(fis1);
			} else {
				new ExcelParserException("下载的模板已不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// 关闭流
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				fis = null;
			}
			try {
				fis1.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				fis1 = null;
			}
		}
		return null;
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

	public List<Object> toObjs2(File file, String myFileFileName)
			throws Exception {

		// 变量定义
		int t = 2;
		// 保存封装好Excel对应实体类的集合
		List<Object> objs = null;
		// 文件输入流
		// Excel文件对应的实体类字节码对象
		Class clazz = null;
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
				setFile(new FileInputStream(file));
				// 实例化excel对应类的实例集合
				objs = new ArrayList<Object>();
				System.out.println(myFileFileName);
				HSSFRow ro = null;

				// 通过文件获取Excel文件装配成对象的配置（存有Excel文件对应的实体类类名集合）
				List<String> config = ExcelConfig
						.getObjectFromConfig(myFileFileName);

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
					clazz = Class.forName(clazzName);
					// 通过类名Hibernate映射文件名
					fileName = clazz.getName();
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
					String type_name;
					Boolean performanceType;
					// 实例化一个Excel对应的对象
					object = clazz.newInstance();
					Class tempClazz = clazz;
					// 从数据开始的位置开始遍历Excel文件中的数据
					for (int j = ExcelConfig.getDataBegin(myFileFileName); (ro = sh
							.getRow(j)) != null; j++) {
						// 遍历实体类成员变量和列下标的配置对象的集合
						for (int m = clazzList.size() - 1; m >= 0; m--) {

							eos = clazzList.get(m);
							// 当前实例赋对应的值
							// 获取成员变量名

							// 判断有无“?”来判断是否是月度和年度的区别
							if (eos.getFieldName().contains("?")) {

								String[] split = eos.getFieldName()
										.split("[?]");

								if (split[split.length - 1].equals("0")) {
									performanceType = true;
								} else {
									performanceType = false;
								}
								eos.setFieldName(split[0]);

								// 设置绩效类型
								tempClazz.getMethod("setPerformancetype",
										Boolean.class).invoke(object,
										performanceType);
							}
							if (eos.getFieldName().contains(":")) {
								tempClazz = Class.forName(eos.getFieldName()
										.split(":")[0]);
							} else {
								tempClazz = clazz;
							}
							fieldName = eos.getFieldName().contains(":") ? eos
									.getFieldName().split(":")[1] : eos
									.getFieldName();
							field = tempClazz.getDeclaredField(fieldName);
							// 将首字母转大写
							fieldName = fieldName.replaceFirst(fieldName
									.substring(0, 1), fieldName.substring(0, 1)
									.toUpperCase());
							// 获取成员变量所对应的set方法
							method = tempClazz.getMethod("set" + fieldName,
									field.getType());
							type_name = field.getType().getName();

							Mark annotation = field.getAnnotation(Mark.class);
							if (annotation == null) {
								cell = ro.getCell(eos.getIndexInExcel());
							} else {
								cell = sh.getRow(annotation.row()).getCell(
										annotation.clomn());
							}

							// 根据成员变量的类型获取单元格数据
							switch (type_name) {
							// 成员变量为String时
							case "java.lang.String":
								// 调用方法获取，并强转
								value = (String) changeCellToString(cell);
								break;
							// 成员变量类型为int时
							case "int":
								// 获取单元格中的数据，转为String
								value = (String) changeCellToString(cell);
								// 转为Integer
								value = (Integer) Integer.valueOf(value
										.toString());
								break;
							case "java.util.Date":
								value = (Date) cell.getDateCellValue();
								// 时间格式转换
								String result = (((Date) value).getYear() + 1900)
										+ "年"
										+ (((Date) value).getMonth() + 1)
										+ "月" + ((Date) value).getDate() + "日";
								System.out.println(result);
								break;
							case "java.lang.Boolean":
								value = changeCellToString(cell);
								int key = eos.getKey(value);
								if (key == 1) {
									value = true;
								}
								if (key == 0) {
									value = false;
								}
								break;
							case "java.lang.Integer":
								value = changeCellToString(cell);

								if (eos.getKey(value) != Integer.MAX_VALUE)
									value = eos.getKey(value);
								value = Integer.valueOf((String) value);
								break;
							case "java.lang.Short":
								value = Short.valueOf(changeCellToString(cell));
								break;
							case "java.lang.Double":
								value = Double
										.valueOf(changeCellToString(cell));
								break;
							default:
								value = changeCellToString(cell);
								break;
							}

							ValueChange vc = field
									.getAnnotation(ValueChange.class);
							if (vc != null) {

								String hsql = "from " + vc.tb_name()
										+ " where Type='" + vc.key_type()
										+ "' and " + " value='" + value + "'";
								List<TbMaster> find = dao
										.getHibernateTemplate().find(hsql);
								value = find.get(0).getKey();
							}
							if (eos.getFieldName().contains(":")) {

								// 如果配置中包含“：”说明该成员变量也是个实体类

								Object inCache = isInCache(tempClazz);
								if (inCache != null) {
									String inCacheFiled = eos.getFieldName()
											.split(":")[1];
									Object inCacheValue = tempClazz
											.getMethod(
													"get"
															+ inCacheFiled
																	.replaceFirst(
																			inCacheFiled
																					.substring(
																							0,
																							1),
																			inCacheFiled
																					.substring(
																							0,
																							1)
																					.toUpperCase()))
											.invoke(inCache);
									if (!inCacheValue.equals(value)) {
										System.out.println("信息不一致" + value
												+ " " + fieldName);
										exception
												.addErrorInfo(new ErrorInfo(
														j,
														"行: "
																+ value
																+ "和对应的数据不一致，不存在，请仔细检查"));
									}
								} else {
									String[] split2 = tempClazz.getName()
											.split("[.]");
									String hsql = "from "
											+ split2[split2.length - 1]
											+ " where " + fieldName + "=";
									if (type_name.equals("java.lang.String")) {
										hsql = hsql + "'" + value + "'";
									} else {
										hsql = hsql + value;
									}
									System.out.println(hsql);
									String valueTemp = (String) value;
									System.out.println("query");
									List find = dao.getHibernateTemplate()
											.find(hsql);
									value = find.size() > 0 ? find.get(0)
											: null;

									if (value == null) {

										exception.addErrorInfo(new ErrorInfo(j,
												"行:" + valueTemp + "不存在，请仔细检查"));
										System.out.println(valueTemp
												+ " 不存在，请检查");
									}
									System.out.println(value);
									String[] split = tempClazz.getName().split(
											"[.]");
									clazz.getMethod(
											"set" + split[split.length - 1],
											tempClazz).invoke(object, value);
									if (value != null) {
										cache.add(value);
									}
								}

							} else {
								method.invoke(object, value);
							}
						}
						if (object != null) {

							if (clazz.getName().equals("ppms.domain.TbPoint")) {

								session = dao.getSessionFactory().openSession();
								transaction = session.beginTransaction();
								TbPointdetail dPointdetail = null;
								TbPoint point = (TbPoint) object;
								point.setPointid(TimeStringUtils
										.getTimeString());
								for (int k = 12; ro.getCell(k) != null; k++) {

									dPointdetail = new TbPointdetail();

									dPointdetail
											.setOperationname(changeCellToString(sh
													.getRow(0).getCell(k)));
									cell = ro.getCell(k);
									dPointdetail
											.setOperationscore(Double
													.parseDouble(changeCellToString(cell)));
									dPointdetail.setTbPoint(point);
									dPointdetail.setPointid(point.getPointid());
									object = dPointdetail;
									objs.add(object);
								}
								dao.saveObject(point);
								transaction.commit();
							} else {
								
								if(fieldName.equals("暗访检查成绩批量导入模板.xls")){
									
									TbVisitcheck tbVisitcheck=(TbVisitcheck) object;
									tbVisitcheck.setAveragescore((tbVisitcheck.getFirstscore()+tbVisitcheck.getSecondscore()+tbVisitcheck.getConsistencyscore())/3);
									object=tbVisitcheck;
								}
								objs.add(object);
								System.out.println(object.toString());
							}
						}
						cache.clear();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(fieldName);
			} finally {

				if (session != null) {
					session.close();
				}
			}
			return objs;
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
	public HSSFCell setValueByType(String type_name, Object obj, Method method,
			ExcelObjStruct eos, HSSFCell cell) throws Exception {

		try {
			if (obj != null) {

				Object value = method.invoke(obj);

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

		if (parserCount < 2) {
			int t = 1;
			// 获取Hibernate映射文件的位置
			String path = CommonExcelParser.class
					.getClassLoader()
					.getResource("configForObject.xml")
					.getPath()
					.replace("configForObject.xml",
							fileName.replace(".", "/") + ".hbm.xml");
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
						parserCount++;
						getFieldReflectToClomnName(element2.attribute("class")
								.getText().trim(), ro);
						parserCount--;
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
						if (parserCount == 1) {
							fieldName = fileName + ":"
									+ element2.attribute("name").getText();
						} else {
							fieldName = element2.attribute("name").getText();
						}
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
								temp = temp.replace("(月)", "").replace("(年月日)",
										"");
								// 切割
								commentText = commentText.split("[(]")[0]
										.trim();
								// 切割
								String[] split = temp.split("[(]");

								String descs = split[1].substring(0,
										split[1].length() - 1);
								String[] split2 = descs.split(" ");
								for (String string : split2) {

									// 获取对所在列值得约束，并存储
									int key = Integer
											.valueOf(string.split(":")[0]);
									String value = string.split(":")[1];
									eos.setDesc(key, value);
								}
							}
							// 标记是否有找到该成员变量对应的列

							if (commentText.equals("备注") && parserCount > 0) {
								System.out.println("不是一级备注");
							} else {

								boolean isNot = false;
								// 遍历第一列表头
								for (int i = 0; ro.getCell(i) != null; i++) {

									// 获取单元格的值
									String value = changeCellToString(ro
											.getCell(i));

									if (commentText.equals("月份/年份")
											&& value.equals("年份")) {

										value = commentText;
										eos.setFieldName(eos.getFieldName()
												+ "?1");
									}
									if (commentText.equals("月份/年份")
											&& value.equals("月份")) {

										value = commentText;
										eos.setFieldName(eos.getFieldName()
												+ "?0");
									}
									// 如果实体类的注释和表头相等，即找到了实体类成员变量对应Excel的列
									if (commentText.equals(value)) {

										// 存储列号
										eos.setIndexInExcel(i);
										// 找到了,设为true
										isNot = true;
										// 中断遍历
										break;
									}
								}
								// 遍历完了，没找到匹配
								if (isNot) {
									// 设为Integer的最大值，即表示没匹配的列
									list.add(eos);
								}
							}
						}
					}
					System.out.println(System.currentTimeMillis());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 检验是否要用该值去查数据库
	 * 
	 * @param clazz
	 * @return
	 */
	private Object isInCache(Class clazz) {

		for (Object obj : cache) {
			if (obj.getClass().getName().equals(clazz.getName())) {
				return obj;
			}
		}
		return null;
	}
}
