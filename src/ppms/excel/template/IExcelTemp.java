package ppms.excel.template;

import ppms.dao.BaseDao;

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
	
}
