package ppms.excel.template;

import ppms.dao.BaseDao;

/**
 * excel模板标准接口
 * @author shark
 *
 */
public interface IExcelTemp {

	public IExcelTemp toSave(BaseDao dao); 
}
