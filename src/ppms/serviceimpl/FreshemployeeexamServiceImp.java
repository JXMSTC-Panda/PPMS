/**  
 * @文件名: FreshemployeeexamServiceImp.java 
 * @包名 ppms.serviceimpl 
 * @描述: TODO 
 * @修改人：
 * @修改时间：2015-8-21 下午9:03:04 
 * @修改内容：

 * @version V1.0  
 */
package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.BaseDaoImp;
import ppms.daoimpl.FreshemployeeexamDaoImp;
import ppms.domain.TbFreshemployeeexam;
import ppms.service.FreshemployeeexamService;

/**
 *        项目名称：PPMS   类名称：FreshemployeeexamServiceImp   类描述：   创建人：SuperPcf
 * 创建时间：2015-8-21 下午9:03:04   修改人：（修改人的名字） 修改时间：2015-8-21 下午9:03:04   修改备注：  
 * 
 * @version       
 */
@Service
public class FreshemployeeexamServiceImp implements FreshemployeeexamService {

	@Autowired
	private FreshemployeeexamDaoImp dao;

	@Override
	public void addFreshemployeeexam(TbFreshemployeeexam tbFreshemployeeexam) {

		dao.addFreshemployeeexam(tbFreshemployeeexam);

	}

	@Override
	public List<TbFreshemployeeexam> geTbFreshemployeeexams() {

		return dao.getFreshemployeeexam();
	}

	@Override
	public void deleteFreshemployeeexam(TbFreshemployeeexam tb, String id) {
		dao.delete(tb, id);
	}

	@Override
	public void update(TbFreshemployeeexam tbFreshemployeeexam) {
		dao.update(tbFreshemployeeexam);
	}

}
