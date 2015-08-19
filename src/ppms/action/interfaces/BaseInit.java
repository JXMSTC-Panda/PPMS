package ppms.action.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.struts2.ServletActionContext;

import ppms.servlet.ServletURLDispecher;
import sun.awt.SunHints.Value;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseInit extends ActionSupport{

	private Map<String,List<Object>> map;
	public BaseInit(){
		map=(Map<String, List<Object>>) ActionContext.getContext().get("request");
	}
	
	/**
	 * 将查询数据库产生的数据缓存进session
	 */
	public void toCache(){
		
		List<Object> value=null;
		for (Entry<String,List<Object>> entry : map.entrySet()) {
			
			value = entry.getValue();
		}
		ServletActionContext.getRequest().getSession().setAttribute(value.get(0).getClass().getName(),value);
	}
}
