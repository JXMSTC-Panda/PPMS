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
	 * 将excel对应类的实例集合生成excel的记录
	 * @param objs excel对应类的实例集合
	 * @param templateFilePath 导出模板的的存储路径
	 * @return
	 */
	public IExcelTemp toExcel(List<IExcelTemp> objs,String templateFilePath);
	
	/**
	 * 
	 * @param myFile 上传的文件流
	 * @return 封装好excel对应类的实例集合
	 * @throws ExcelParserException excel转换异常
	 */
	public List<IExcelTemp> toObjs(File myFile) throws ExcelParserException;
	
}
