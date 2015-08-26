package ppms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ShiroListener implements ServletContextListener {

	private java.util.Timer timer = null;  
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		timer = new java.util.Timer(true) ;  
        event.getServletContext().log("定时器已启动。") ;  
        timer.schedule(new ppms.util.MyTask(event.getServletContext()), 10, 5000) ;  
        event.getServletContext().log("已经添加任务调度表。" ) ;  
	}
}
