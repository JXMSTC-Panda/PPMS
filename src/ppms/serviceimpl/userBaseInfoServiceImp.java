package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.BaseDaoImp;
import ppms.daoimpl.userBaseInfoDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.service.userBaseInfoService;
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：userBaseInfoServiceImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-13 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-13 下午4:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class userBaseInfoServiceImp extends BaseDaoImp implements userBaseInfoService{

	/**
	 * 声明dao
	 */
	@Autowired
	private userBaseInfoDaoImp dao;
	
	/**
	 * 调用dao层的方法，查询对应表中信息，return给list
	 */
	@Override
	public List<OrganizationNj> getOrganizations() {
		
		return dao.getOrganizations();
	}
	
	/**
	 * 调用dao层的方法，查询对应表中信息，return给list
	 */
	@Override
	public List<TbPost> getTbPosts(){
		return dao.getTbPosts();
	}
	
	/**
	 * 调用dao层的saveObject方法，将数据存到数据库
	 */
    @Override
	public void adduserBaseInfo(TbEmployee tbEmployee) {
    	dao.saveObject(tbEmployee);
    }
    
    /**
	 * 调用dao层的方法，查询对应表中信息，return给list
	 */
    @Override
	public List<TbJob> getTbJobs() {
		return dao.getTbJobs();
	}
    /**
	 * 调用dao层的方法，通过id查询对应表中信息，return给list
	 */
    @Override
	public List<TbEmployee> getTbEmployees(String employeeid) {
		
		return dao.getTbEmployees(employeeid);
	}
    /**
	 * 调用dao层的方法，查询对应表中信息，return给list
	 */
    @Override
    public List<TbRole> getTbRoles(){
    	return dao.getTbRoles();
    }
    /**
	 * 调用dao层的方法，查询对应表中信息，return给list
	 */
    @Override
	public List<TbEmployee> getTbEmployee() {
		
		return dao.getTbEmployees();
	} 
    /**
     * hibernate操作，删除对象
     */
    @Override
    public void delete(Object object) {
		getHibernateTemplate().delete(object);
	}
    @Override
    public void update(Object object){
    	getHibernateTemplate().update(object);
    }
	
}
