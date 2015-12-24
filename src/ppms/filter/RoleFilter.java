package ppms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		// 取的url相对地址，例如：/PPMS/index.jsp
		String url = httpRequest.getRequestURI();
		System.out.println(url);

		try {

			String myUrlString = url.substring(6);
			String[] urlArray = myUrlString.split(".do");
			System.out.println(urlArray[0]);
			if (urlArray[0].equals("index.tachometer")
					|| urlArray[0].equals("login")
					|| urlArray[0].equals("upload")
					|| urlArray[0].equals("chooseOrg")
					|| urlArray[0].equals("getEmployee")
					|| urlArray[0].equals("downData")
					|| urlArray[0].equals("orgback")) {

				chain.doFilter(httpRequest, httpResponse);

			} else if (MyRealm.AuthorityCheck(MySubject.tbRolefunction,
					urlArray[0])) {
				try {
					
					chain.doFilter(httpRequest, httpResponse);
					System.out.println("放行。。。。。。。。。。。。。。。。。。。。。。。");
				} catch (Exception e) { // TODO: handle exception
					e.printStackTrace();
				}
			} else {
				System.out.println("不放行。。。。。。。。。。。。。。。。。。。。。。。");
				request.getRequestDispatcher("WEB-INF/content/page/error.jsp")
						.forward(httpRequest, httpResponse);
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
