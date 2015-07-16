package ppms.excel.template;

import java.io.File;
import java.util.List;

import ppms.dao.BaseDao;
import ppms.exception.ExcelParserException;

/**
 * excel模板标准接口
 * @author shark
 *
 */
public interface IExcelTemp {

	/**
	 * 向数据库存入excel的数据
	 * @param dao
	 * @return
	 */
	public IExcelTemp toSave(BaseDao dao); 
	
	/**
	 * 当前对象转换成excel表的记录
	 * @return
	 */
	public IExcelTemp toExcel(File file);
	
	/**
	 * 
	 * @param myFile 上传的文件流
	 * @return 封装好excel对应类的实例集合
	 * @throws ExcelParserException excel转换异常
	 */
	public List<IExcelTemp> toObjs(File myFile) throws ExcelParserException;
	
}
