package ppms.listener;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;

import ppms.action.interfaces.ListForCache;

public class ThreadToCache implements Runnable{

	private HttpSession session;
	public ThreadToCache(HttpSession session){
		this.session=session;
	}
	@Override
	public void run() {
		
		
		ListForCache cache;
		while (true) {
			
			System.out.println("扫描中");
			try {
				Thread.sleep(8*60*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Enumeration<String> attributeNames = session.getAttributeNames();
			while(attributeNames.hasMoreElements()){
				
				String name = attributeNames.nextElement();
				if(name.startsWith("ppms.domain")){
					cache=(ListForCache) session.getAttribute(name);
					if(cache.checkTimeOut()){
						session.removeAttribute(name);
					}
				}
			}
		}
	}

}
