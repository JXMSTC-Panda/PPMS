package ppms.action.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseInit extends ActionSupport {

	protected Map<String, Object> map;

	public BaseInit() {
		map = (Map<String, Object>) ActionContext.getContext().get("request");
	}

	/**
	 * 将查询数据库产生的数据缓存进session
	 */
	public void toCache() {

		List<Object> value = null;

		if (map.size() > 0) {

			for (Entry<String, Object> entry : map.entrySet()) {

				value = (List<Object>) entry.getValue();
			}
		}
		ServletActionContext.getRequest().getSession()
				.setAttribute(value.get(0).getClass().getName(), value);
	}
}
