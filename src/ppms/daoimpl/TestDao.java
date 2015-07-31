package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.domain.TbRole;

@Repository
public class TestDao extends BaseDaoImp{

	public TestDao(){
		System.out.println("create");
	}
	
	public List<TbRole> findAll(){
		
		return getHibernateTemplate().findByExample(new TbRole());
	}
}
