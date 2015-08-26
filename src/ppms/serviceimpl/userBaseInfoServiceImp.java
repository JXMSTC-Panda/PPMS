package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
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
import ppms.genericDao.TbEmployeeDAO;
import ppms.genericDao.TbRoleDAO;
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
    @Autowired
    private TbEmployeeDAO tbEmployeeDAO;
    
    /**
     * hibernate操作，删除对象
     */
    @Override
    public void delete(Object object) {
		getHibernateTemplate().delete(object);
	}
    /*public void update(String employeecode,String employeeid,String employeename,
    		String idnumber,Boolean sex,Date birthday,String bankname,
    		String banknumber,Boolean status,String addressarea,String address,
    		String mobilenumber,String shortmobilenumber,String academicdegree,
    		String schoolname,String specialization,String tel,Date entertime,
    		String backjobcomment,String remark){
    	
    	TbEmployee tbEmployees= tbEmployeeDAO.findById(employeeid);
    	    	
    	tbEmployees.setEmployeename(employeename);
		tbEmployees.setEmployeecode(employeecode);
		tbEmployees.setIdnumber(idnumber);
		tbEmployees.setBirthday(birthday);
		tbEmployees.setBankname(bankname);
		tbEmployees.setBanknumber(banknumber);
		tbEmployees.setStatus(status);
		tbEmployees.setAddressarea(addressarea);
		tbEmployees.setAddress(address);
		tbEmployees.setMobilenumber(mobilenumber);
		tbEmployees.setShortmobilenumber(shortmobilenumber);
		tbEmployees.setAcademicdegree(academicdegree);
		tbEmployees.setSchoolname(schoolname);
		tbEmployees.setSpecialization(specialization);
		tbEmployees.setTel(tel);
		tbEmployees.setEntertime(entertime);
		tbEmployees.setBackjobcomment(backjobcomment);
		tbEmployees.setRemark(remark);
		
    	tbEmployeeDAO.update(tbEmployees);
		
    }*/
    @Override
	public void update(TbEmployee tbEmployee) {
		// TODO Auto-generated method stub
		tbEmployeeDAO.update(tbEmployee);
	}
	@Override
    public void delete(String employeeid){
    	try {
        	tbEmployeeDAO.detete(employeeid);   
		} catch (Exception e) {
			e.printStackTrace();
		}
   
    }
}
