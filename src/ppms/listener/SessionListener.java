package ppms.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Session监听器
 * @author shark
 * @update 2015下午7:22:52
 * @function
 *
 */
public class SessionListener implements HttpSessionListener{

	/**
	 * 扫描session域线程
	 */
	private Thread thread;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		System.out.println("create session"+se.getSource());
		
		ThreadToCache cache=new ThreadToCache(se.getSession());
		thread = new Thread(cache);
		thread.start();
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		System.out.println("stop thread");
		thread.stop();
	}

}
