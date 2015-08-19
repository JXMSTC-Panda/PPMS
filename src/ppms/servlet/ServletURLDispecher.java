package ppms.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
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

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int i = 1;
		String url = null;
		String mark = null;

		// 获取请求参数
		StringBuffer requestURL = req.getRequestURL();

		// 切割获取访问路径
		String[] split = requestURL.toString().split("/");
		url = split[split.length - 1];

		// 判断格式是否准确
		if (url.contains(".do")) {
			String[] split2 = url.split("[.]");
			url = url.replace(".do", ".action");
			Map<String, String[]> map = req.getParameterMap();
			if (map.size() > 0) {
				url = url + "?";
				for (Entry<String, String[]> entry : map.entrySet()) {

					String[] value = entry.getValue();
					for (String string : value) {
							url = url + entry.getKey() + "=" + URLEncoder.encode(string) + "&";
					}
				}
				url = (String) url.subSequence(0, url.length() - 1);
			}
			url = url.trim();
			System.out.println(url);
			if (url != null) {
				//req.getRequestDispatcher("/"+url).forward(req, resp);
				resp.sendRedirect(url);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
