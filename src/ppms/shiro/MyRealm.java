package ppms.shiro;

import java.util.List;

import ppms.domain.TbRolefunction;
import ppms.domain.TbSystemfunction;

public class MyRealm {

	public static List<TbSystemfunction> tbSystemfunctions;
	//public static TbRolefunction tbRolefunction;

	public MyRealm() {

	}

	public static List<TbSystemfunction> getTbSystemfunctions() {
		return tbSystemfunctions;
	}

	public static void setTbSystemfunctions(
			List<TbSystemfunction> newtbSystemfunctions) {
		tbSystemfunctions = newtbSystemfunctions;
	}

	/**
	 * @Title: AuthorityCheck
	 * @Description: 验证权限
	 * @return Boolean
	 * @throws
	 */
	public static Boolean AuthorityCheck(TbRolefunction tbRolefunction,String urlString) {

		String[] urlArrayString = urlString.split("\\.");
		String url = urlArrayString[0] + "." + urlArrayString[1] + "."
				+ urlArrayString[2];
		boolean status = false;
		try {
			if (urlArrayString.length >= 4) {
				// 子功能
				if (urlArrayString[3].contains("modify")
						|| urlArrayString[3].contains("delete")
						|| urlArrayString[3].contains("detail")
						|| urlArrayString[3].contains("invalid")
						|| urlArrayString[3].contains("input")) {

					url = url + urlArrayString[3];
				}
			}
			
			for (TbSystemfunction tbSystemfunction : tbSystemfunctions) {

				if (url.equals(tbSystemfunction.getFunctionurl())) {

					if (tbRolefunction.getFunctionids().contains(
							tbSystemfunction.getFunctionid()))

						status = true;
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			status = false;
			e.printStackTrace();
		}
		return status;
	}
}
