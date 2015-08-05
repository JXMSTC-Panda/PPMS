package ppms.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.formula.functions.T;

import ppms.action.interfaces.InitPage;

/**
 * Url请求转发处理，转换成新的请求URL跳转
 * 
 * @author shark
 * @update 2015上午11:05:36
 * @function
 * 
 */
public class ServletURLDispecher extends HttpServlet {

	//页面初始化的配置对象
	private static Properties initConfig;

	static {
		
		initConfig = new Properties();
		try {
			
			//获取配置信息
			initConfig.load(new FileInputStream(new File(
					ServletURLDispecher.class.getClassLoader()
							.getResource("initPage.properties").getPath())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int i=1;
		String url = null;
		String mark = null;

		// 获取请求参数
		StringBuffer requestURL = req.getRequestURL();

		// 切割获取访问路径
		String[] split = requestURL.toString().split("/");
		url = split[split.length - 1];

		
		// 判断格式是否准确
		if (url.contains(".")) {
			String[] split2 = url.split("[.]"); 
			url = split2[0]+ "." + split2[2];
			mark = url;
			// 替换格式，转出标准请求格式
			url = url.replace(".", "/");
			url = url + ".jsp";
			Map<String, String[]> map = req.getParameterMap();
			if (map.size() > 0) {
				url = url + "?";
				for (Entry<String, String[]> entry : map.entrySet()) {

					String[] value = entry.getValue();
					for (String string : value) {
						url = url + entry.getKey() + "=" + string + "&";
					}
				}
				url = (String) url.subSequence(0, url.length() - 1);
			}

			// 拼接根目录
			url = "WEB-INF/content/page/" + url;
			url = url.trim();
			if (url != null) {

				//通过配置信息获取页面初始化实现数据获取的Action
				String actionName = (String) initConfig.get(mark);
				try {
					//实例化实现数据查找的Action
					InitPage forName = (InitPage) Class.forName(actionName)
							.newInstance();

					//获取查找到的数据
					Map<String, List<T>> initPage = forName.initPage();

					if (initPage != null) {
						//遍历map存到request域
						for (Entry<String, List<T>> entry : initPage.entrySet()) {

							req.setAttribute(entry.getKey(), entry.getValue());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					
				}
				req.getRequestDispatcher("/" + url).forward(req, resp);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
