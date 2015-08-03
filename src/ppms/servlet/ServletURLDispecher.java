package ppms.servlet;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Url请求转发处理，转换成新的请求URL跳转
 * @author shark
 * @update 2015上午11:05:36
 * @function
 *
 */
public class ServletURLDispecher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String url = null;
		
		//获取请求参数
		StringBuffer requestURL = req.getRequestURL();

		//切割获取访问路径
		String[] split = requestURL.toString().split("/");
		url = split[split.length - 1];

		//判断格式是否准确
		if (url.contains(".")) {
			
			//替换格式，转出标准请求格式
			url = url.replace(".", "/");
			url = url + ".jsp";
			
			//获取请求参数，
			Map<String, String[]> map = req.getParameterMap();
			if (map.size() > 0) {
				url = url + "?";
				for (Entry<String, String[]> entry : map.entrySet()) {

					String[] value = entry.getValue();
					for (String string : value) {
						url = url + entry.getKey() + "=" + string + "&";
					}
				}
			}
			url = (String) url.subSequence(0, url.length() - 1);
			//拼接根目录
			url="content/page/"+url;
			if (url != null)
				req.getRequestDispatcher("/"+url).forward(req, resp);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
