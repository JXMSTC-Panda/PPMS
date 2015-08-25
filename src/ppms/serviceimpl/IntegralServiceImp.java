package ppms.serviceimpl;

import java.util.List;

import org.hibernate.Query;
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
//		for (TbPoint tbPoint : list) {
//			
//			if(!tbPoint.getOrganizationNj().getType().equals(pointType)){
//				list.remove(tbPoint);
//			}
//		}
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
