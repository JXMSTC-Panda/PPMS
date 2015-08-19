package ppms.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

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
