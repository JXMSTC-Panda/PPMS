package ppms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.domain.TbSystemfunction;
import ppms.genericDao.TbSystemfunctionDAO;
import ppms.serviceimpl.AuthoritySrviceImp;
import ppms.shiro.MyRealm;

public class MyTask extends TimerTask {

	private static boolean isRunning = false;
	private ServletContext context = null;

	public MyTask(ServletContext context) {

		this.context = context;
		
	}

	@Override
	public void run() {

		if (!isRunning) {
			//System.out.println("开始执行指定任务.");
			isRunning = true;
			//context.log("开始执行指定任务.");
			// TODO 添加自定义的详细任务，以下只是示例
			/*int i = 0;
			while (i++ < 10) {
				context.log("已完成任务的" + i + "/" + 10);
			}*/
			try {

				AuthoritySrviceImp authoritySrviceImp = new AuthoritySrviceImp();
				authoritySrviceImp = WebApplicationContextUtils
						.getWebApplicationContext(context).getBean(
								AuthoritySrviceImp.class);
				List<TbSystemfunction> tbSystemfunctions = new ArrayList<TbSystemfunction>();
				tbSystemfunctions = authoritySrviceImp.findAllSystemfunctions();
				String size = String.valueOf(tbSystemfunctions.size());
				System.out.println(size + "√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√");
				MyRealm.setTbSystemfunctions(tbSystemfunctions);
				//System.out.print(myRealm.tbSystemfunctions.get(0).getFunctionurl());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.print(isRunning
						+ "★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			}
			isRunning = false;
			///context.log("指定任务执行结束");
			//System.out.println("指定任务执行结束");
		} else {

			//context.log("上一次任务执行还未结束");
		}
	}
}