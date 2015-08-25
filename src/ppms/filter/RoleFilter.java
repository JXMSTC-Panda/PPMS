package ppms.filter;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import ppms.shiro.MyRealm;
import ppms.shiro.MySubject;

public class RoleFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub

		RequestDispatcher dispatch = request
				.getRequestDispatcher("/content/page/error.jsp");

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		// 取的url相对地址，例如：/PPMS/index.jsp
		String url = httpRequest.getRequestURI();
		System.out.println(url);

		try {
			// 得到当前访问对象
			String myUrlString = url.substring(6);
			String[] urlArray = myUrlString.split(".do");
			System.out.println(urlArray[0]);
			if (urlArray[0].equals("index.tachometer")
					|| urlArray[0].equals("login")) {

				chain.doFilter(request, response);

			} else if (MyRealm.AuthorityCheck(MySubject.tbRolefunction,urlArray[0])) {

				chain.doFilter(request, response);

			} else {

				request.getRequestDispatcher("WEB-INF/content/page/error.jsp")
						.forward(request, response);
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.getRequestDispatcher("WEB-INF/content/page/error.jsp")
					.forward(request, response);

			return;
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
