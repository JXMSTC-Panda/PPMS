package ppms.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import ppms.annotation.Mark;
import ppms.excel.template.IExcelTemp;
import ppms.exception.ExcelParserException;

/**
 * 通用excel解析成对象和对象打包成excel文件的解析器
 * 
 * @author shark
 * @version 1.1(excel解析成对象完成)
 * 
 */
public class CommonExcelParser {

	// excel对应的文本对象
	private HSSFWorkbook wb;
	// excel表单对象
	private HSSFSheet sh;
	// pio文件流对象
	private POIFSFileSystem ts;

	public IExcelTemp toExcel(List<IExcelTemp> objs, String templateFilePath) {

		try {
			FileInputStream fis = new FileInputStream(templateFilePath);
			this.setFile(fis);
			int i = 0;
			int j = 0;
			HSSFRow ro = null;
			HSSFCell cell = null;
			while ((ro = sh.getRow(i)) != null) {
				j = 0;
				i++;
				while ((cell = ro.getCell(j)) != null) {
					j++;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (IExcelTemp) this;
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
	public List<IExcelTemp> toObjs(File myFile, String myFileFileName)
			throws ExcelParserException {

		int t=0;
		List<IExcelTemp> objs = null;
		FileInputStream file = null;
		if (myFile == null) {
			throw new ExcelParserException("文件上传失败");
		} else {
			try {
				file = new FileInputStream(myFile);
				setFile(file);
				// 模板对应excel对应类的实例集合
				objs = new ArrayList<IExcelTemp>();

				System.out.println(myFileFileName);
				HSSFRow ro = null;

				// 获取模板excel和对应类（可能多个类）逻辑配置信息
				List<ExcelObjStruct> configs = ExcelConfig
						.getObjectFromConfig(myFileFileName);
				Class<?> clazz = null;
				String clazzName = null;
				String clomns = null;

				// 遍历excel表，从第一行开始
				for (int i = ExcelConfig.getDataBegin(myFileFileName); sh
						.getRow(i) != null; i++) {

					// 获取一行数据
					ro = sh.getRow(i);

					// 遍历逻辑配置对象集合
					for (ExcelObjStruct eos : configs) {

						// 获取数据对应的类的全路径
						clazzName = eos.getClassName();
						// 获取数据对应类的字节码
						clazz = Class.forName(clazzName);

						// 获取数据对应类的成员变量
						Field[] fields = clazz.getDeclaredFields();
						Method method;
						Object value = null;
						List<Integer[]> objRefIndexs = null;
						if (eos.getFieldIndex().equals("*")) {
							objRefIndexs = new ArrayList<Integer[]>();
							List<Integer> inter = new ArrayList<Integer>();
							for (int k = 1; ro.getCell(k) != null; k++) {
								inter.add(k);
							}
							Integer[] array = inter.toArray(new Integer[inter
									.size()]);
							objRefIndexs.add(array);
						} else {

							// 获取excel一行数据上的多个同类对象的数据行号集合
							objRefIndexs = getIndexs(eos.getFieldIndex());
						}
						// 遍历单个对象所对应excel的单元格的列号
						for (Integer[] integers : objRefIndexs) {

							// 记录遍历成员变量位置的游标
							int cursor = 0;
							// 实例化一个和数据对应的对象实例
							IExcelTemp object = (IExcelTemp) clazz
									.newInstance();
							for (Integer integer : integers) {

								// 获取对象所对应行号列号上的数据

								Field field = fields[cursor];

								// 获取成员变量名
								String fieldName = field.getName();
								// 将首字母转大写
								fieldName = fieldName
										.replaceFirst(
												fieldName.substring(0, 1),
												fieldName.substring(0, 1)
														.toUpperCase());
								// 获取成员变量所对应的set方法
								method = clazz.getMethod("set" + fieldName,
										field.getType());
								String type_name = field.getType().getName();
								HSSFCell cell = null;

								Mark annotation = field
										.getAnnotation(Mark.class);
								if (annotation == null) {
									cell = ro.getCell(integer);
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
											+ "月"
											+ ((Date) value).getDate()
											+ "日";
									System.out.println(result);
									break;
								}
								// 当前实例赋对应的值
								method.invoke(object, value);
								cursor++;

							}
							System.out.println(object.toString());
							objs.add(object);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				// 关闭流
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					file = null;
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
			// TODO Auto-generated catch block
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
				}
				Integer intValue = Integer.parseInt(str);
				returnValue = intValue.toString();
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

}
