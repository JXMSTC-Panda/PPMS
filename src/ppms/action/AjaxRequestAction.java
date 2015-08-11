package ppms.action;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbEmployee;
import ppms.gason.adapter.TargetStrategy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;

public abstract class AjaxRequestAction extends ActionSupport {

<<<<<<< HEAD
	
=======
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected String[] fieldNames;
	protected Class<?> clazz;
	protected String hsql;
	protected String key;
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	public AjaxRequestAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
	}

	/**
	 * 初始化处理操作
	 */
	public abstract String initProcess();
	/**
	 * 设置  转换成json要转换的成员变量，和转换的类的字节码
	 * @param fieldNames
	 * @param clazz
	 */
	public void setFieldToJson(String [] fieldNames,Class<?> clazz){
		this.fieldNames=fieldNames;
		this.clazz=clazz;
	}
	
	/**
	 * 设置要执行的hsql语句
	 * @param hsql
	 */
	public void setHsql(String hsql){
		this.hsql=hsql;
	}
	public void setKey(String key){
		this.key=key;
	}
	public void excute(){
		
		int i=1;
		try {
			
			Map<String, List<Object>> map = new HashMap<String, List<Object>>();
			
			//查询数据库
			List<Object> objs = (List<Object>) dao.findByHSQL(
					hsql, clazz.newInstance());

			//设置对TbEmployee的策略
			TargetStrategy ts = new TargetStrategy(clazz);  
			//表示仅转换TbEmployee中的employeename和employeeid属性  
			ts.setFields(fieldNames);  
			if(fieldNames==null){
				
				List<Object> newObjs=new ArrayList<>();
				for (Object object : objs) {
					
					Field[] fields = clazz.getDeclaredFields();
					
					for (Field field : fields) {
						
						String fieldName=field.getName();
						fieldName=fieldName.replaceFirst(
								fieldName.substring(0, 1),
								fieldName.substring(0, 1).toUpperCase());
						Method methodGet = clazz.getMethod("get"+fieldName);
		
						Object invoke = methodGet.invoke(object);
						
						if(invoke instanceof Proxy){
							
							Class<?> orgClazz = field.getType();
							String[] split = orgClazz.getName().split("[.]");
							
							String className=split[split.length-1];
							String idName = orgClazz.getDeclaredFields()[0].getName();
							Method method2 = orgClazz.getMethod("get"+orgClazz.getDeclaredFields()[0].getName());
							
							String hsql="from "+className+" where "+idName+method2.invoke(invoke);
							List<?> findByHSQL = dao.findByHSQL(hsql, orgClazz.newInstance());
							
							Method methodSet=clazz.getMethod("set"+field.getName(),orgClazz);
							
							methodSet.invoke(object, findByHSQL.get(0));
						}
					}
					newObjs.add(object);
				}
				
				map.put(key, newObjs);
			}else{
				map.put(key, objs);
			}
			ts.setReverse(true);  
			Gson gson = new GsonBuilder().setExclusionStrategies(ts).create();  

			
			String json = gson.toJson(map);
			response.getWriter().write(json);
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
