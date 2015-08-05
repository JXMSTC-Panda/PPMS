package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.PraiseCriticismDao;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.service.PraiseCriticismService;

@Service
public class PraiseCriticismServiceImp implements PraiseCriticismService {

	@Autowired
	private PraiseCriticismDao dao; //创建一个PraiseCriticismDao的对象dao
	
	/*
	 * 动态下拉框，根据奖惩类型，动态变化奖惩级别*/
	@Override
	public List<TbEmployeepraisecriticism> findLevel(int key){
		
		return dao.findLevel(key);
	}
}
