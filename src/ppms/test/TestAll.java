package ppms.test;

import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.AjaxRequestAction;
import ppms.domain.TbRole;
import ppms.genericDao.TbRoleDAO;

public class TestAll {

	@Autowired
	TbRoleDAO tbRoleDAO;

	@org.junit.Test
	public void Test() {

		AjaxRequestAction.isEntityObj("ppms.domain.TbInnovation");
	}
}
