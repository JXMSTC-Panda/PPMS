package ppms.filter; 
 
 
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;
import javax.servlet.Filter; 
import javax.servlet.FilterChain; 
import javax.servlet.FilterConfig; 
import javax.servlet.ServletContext; 
import javax.servlet.ServletException; 
import javax.servlet.ServletRequest; 
import javax.servlet.ServletResponse; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletRequestWrapper; 
 
/**
 * 乱码过滤器
 * @author shark
 * @update 2015下午7:16:26
 * @function
 *
 */
public class EncodeFilter implements Filter { 
	
	@SuppressWarnings("unused") 
	private FilterConfig config = null;
	private ServletContext context = null;
	//系统编码
	private String encode = null;
	public void destroy() { 
		 
	} 
 
 
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//--响应乱码解决 
		response.setCharacterEncoding(encode);
		response.setContentType("text/html;charset="+encode);
		//--利用装饰设计模式改变request对象和获取请求参数相关的方法,从而解决请求参数乱码问题 
		chain.doFilter(new MyHttpServletRequest((HttpServletRequest) request), response);
	} 
 
 
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.config = filterConfig;
		this.context = filterConfig.getServletContext();
		//获取系统编码设置
		this.encode = context.getInitParameter("encode");
	} 
 
 
	/**
	 * HttpServletRequest包装类
	 * @author shark
	 * @update 2015下午7:19:41
	 * @function
	 *
	 */
	private class MyHttpServletRequest extends HttpServletRequestWrapper{ 
		
		private  HttpServletRequest request = null;
		private boolean isNotEncode = true;
		public MyHttpServletRequest(HttpServletRequest request) {
			super(request);
			this.request = request;
		} 
		 
		//重写方法
		@Override 
		public Map<String,String[]> getParameterMap() {
			try{ 
				//判断变淡提交类型
				if(request.getMethod().equalsIgnoreCase("POST")){
					request.setCharacterEncoding(encode);
					return request.getParameterMap();
				}else if(request.getMethod().equalsIgnoreCase("GET")){
					Map<String,String[]> map = request.getParameterMap();
					if(isNotEncode){
						for(Map.Entry<String, String[]> entry : map.entrySet()){
							String [] vs = entry.getValue();
							for(int i=0;i<vs.length;i++){
								
								//对request域里的参数进行硬解码
								vs[i] = new String(vs[i].getBytes("iso8859-1"),encode);
							} 
						} 
						isNotEncode = false;
					} 
					return map;
				}else{ 
					return request.getParameterMap();
				} 
			}catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			} 
		} 
		 
		//重写
		@Override 
		public String[] getParameterValues(String name) {
			return getParameterMap().get(name);
		} 
		 
		//重写
		@Override 
		public String getParameter(String name) {
			return getParameterValues(name) == null ? null : getParameterValues(name)[0];
		} 
		 
	}  
} 