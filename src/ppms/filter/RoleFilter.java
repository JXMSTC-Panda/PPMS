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



public class RoleFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain ) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatch=request.getRequestDispatcher("/content/page/error.jsp");
		
		HttpServletRequest httpRequest = (HttpServletRequest)request; 
        //取的url相对地址，例如：/PPMS/index.jsp  
        String url = httpRequest.getRequestURI();  
        System.out.println(url);
        chain.doFilter(request, response);
        //request.getRequestDispatcher("/content/page/error.jsp").forward(request,response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}


}
