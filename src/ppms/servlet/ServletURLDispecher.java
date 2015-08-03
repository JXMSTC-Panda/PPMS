package ppms.servlet;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 静态资源请求转发
 * @author shark
 * @update 2015上午10:18:38
 * @function
 *
 */
public class ServletURLDispecher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int i = 0;
		String url = null;
		StringBuffer requestURL = req.getRequestURL();

		url = requestURL.toString().replace("resource/", "").replace(".", "/");
		url = url + ".jsp";
		Map<String, String[]> map = req.getParameterMap();
		if (map.size() > 0) {
			url = url + "?";
			for (Entry<String, String[]> entry : map.entrySet()) {

				String[] value = entry.getValue();
				for (String string : value) {
					url = url + entry.getKey() + "=" + string + "&";
				}

				System.out.println(value);
			}
		}

		 url = (String) url.subSequence(0, url.length() - 1);
		if (url != null)
			resp.sendRedirect(url);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
