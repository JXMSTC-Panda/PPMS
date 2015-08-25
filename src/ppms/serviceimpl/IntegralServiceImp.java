package ppms.serviceimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbPoint;
import ppms.domain.TbPointdetail;
import ppms.service.IntegralService;

/**
 * 积分业务管理实现类
 * @author Shark
 *
 */
@Service
public class IntegralServiceImp implements IntegralService{

	
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;
	@Override
	public List<TbPoint> getAllPoints(String pointType) {
		
		
		List<TbPoint> list = dao.getEntitiestNotLazy(new TbPoint(), new String []{"tbEmployee","tbJob","organizationNj"}, null);
		for (int i=0;i<list.size();i++) {
		String type=null;
		if(list.get(i).getOrganizationNj().getType()==1){
			type="1";
		}else if(list.get(i).getOrganizationNj().getType()==0){
			type="0";
		}else{
			type="0";
		}
		
			if(!type.equals(pointType)){
				list.remove(i);
			}
		}
		if(list.size()>0){
			return list;
		}
		return null;
	}
	@Override
	public boolean delete(String id) {
		
		Query createQuery = dao.getSessionFactory().openSession().createQuery("delete from TbPointdetail where pointid="+id);
		createQuery.executeUpdate();
		return dao.delete(new TbPoint(), id);
	}

}
