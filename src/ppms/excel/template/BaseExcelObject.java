package ppms.excel.template;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import ppms.dao.BaseDao;
import ppms.exception.ExcelParserException;

public class BaseExcelObject implements IExcelTemp {

	@Override
	public IExcelTemp toSave(BaseDao dao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IExcelTemp toExcel(File path) {

		return this;
	}

	/**
	 * 根据单元格中的数据类型获取数据
	 * 
	 * @param cell
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

	
	@Override
	public List<IExcelTemp> toObjs(File myFile) throws ExcelParserException {

		if (myFile == null) {

			throw new ExcelParserException("文件上传失败");
		} else {
			// 模板对应excel对应类的实例集合
			List<IExcelTemp> objs = null;

			FileInputStream file = null;
			POIFSFileSystem ts;
			try {

				File name = myFile.getAbsoluteFile();
				System.out.println(name.getName());
				// 读取文件
				file = new FileInputStream(myFile);

				// 获取指向该excel的POIFSFileSystem实例
				ts = new POIFSFileSystem(file);
				HSSFWorkbook wb = new HSSFWorkbook(ts);
				HSSFSheet sh = wb.getSheetAt(0);
				HSSFRow ro = null;

				// 获取模板excel对应类的字节码
				Class clazz = this.getClass();

				// 遍历excel表的每一行（从第一行数据读，不读表头）
				for (int i = 1; sh.getRow(i) != null; i++) {

					ro = sh.getRow(i);
					objs = new ArrayList<IExcelTemp>();
					// 实例化一个excel对应类的实例
					IExcelTemp obj = (IExcelTemp) clazz.newInstance();
					// 遍历excel表的每一列
					// 获取excel对应类的的成员变量
					Field[] fields = clazz.getDeclaredFields();
					for (int j = 0; ro.getCell(j) != null; j++) {

						// 按顺序获取成员变量中的每一个
						Field field = fields[j];
						// 获取成员变量的名
						String fieldName = field.getName();
						// 获取成员变量的类型
						Class<?> type = field.getType();
						// 获取类型名
						String tyep_name = type.getName();
						// 将成员变量名的一个字母转大写
						fieldName = fieldName.replaceFirst(
								fieldName.substring(0, 1),
								fieldName.substring(0, 1).toUpperCase());
						// 获取成员变量所对应的set方法
						Method method = clazz
								.getMethod("set" + fieldName, type);
						// 根据下标获取单元格对象
						HSSFCell cell = ro.getCell(j);
						Object value = null;

						// 根据成员变量的类型获取单元格数据
						switch (tyep_name) {
						// 成员变量为String时
						case "java.lang.String":
							// 调用方法获取，并强转
							value = (String) changeCellToString(cell);
							break;
						// 成员变量类型为int时
						case "int":
							// 获取单元格中的数据，转为String
							value = (String) (String) changeCellToString(cell);
							// 转为Integer
							value = (Integer) Integer.valueOf(value.toString());
						default:
							System.out.println("无类型");
							break;
						}
						// invoke实现对当前对象的设置值
						method.invoke(obj, value);
						objs.add(obj);
					}
					System.out.println(obj.toString());
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
}
