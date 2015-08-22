package ppms.action.interfaces;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseInit extends ActionSupport {

	protected Map<String, Object> map;
	private HttpServletRequest request;

	public BaseInit() {
		map = new HashMap<String, Object>();
		request=ServletActionContext.getRequest();
	}

	/**
	 * 将查询数据库产生的数据缓存进session
	 */
	public void toCache() {

		Object value = null;
		Method method=null;
		List list=null;
		try {
			if (map.size() > 0) {

				for (Entry<String, Object> entry : map.entrySet()) {

					value = entry.getValue();
					
					request.setAttribute(entry.getKey(), entry.getValue());
					if(value instanceof List){
						list=(List) value;
						String name = list.get(0).getClass().getName();
						ListForCache<Object> cache=new ListForCache<Object>();
						cache.setList(list);
						ServletActionContext.getRequest().getSession().setAttribute(list.get(0).getClass().getName(),cache);
					}
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
