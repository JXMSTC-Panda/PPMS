package ppms.action.interfaces;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;

/**
 * 实现页面初始化
 * @author shark
 * @update 2015上午10:04:04
 * @function
 *
 */
public interface InitPage {

	/**
	 * 使用该接口必须实现在initPage.properties配置  配置规则为  url请求名=处理Action的犬类名
	 * 查询数据库获取页面初始化所需的数据String是页面域里的别名，List是要传到页面数据 url是请求的url
	 * @param servletContext 
	 * @return 
	 */
	public Map<String,List<T>> initPage(ServletContext servletContext,String url);
}
