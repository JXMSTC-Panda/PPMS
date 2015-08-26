<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<div class="footer">
	<div class="footer-inner">
		<!-- #section:basics/footer -->
		<div class="footer-content">
			<span class="bigger-120"> <span class="blue bolder">JXMSTC</span>
				Application &copy; 2015 NCHU java 一组</span> &nbsp; &nbsp; <span
				class="action-buttons"> <a href="#"> <i
					class="ace-icon fa fa-qq light-blue bigger-150"></i> </a> <a
				href="#"> <i
					class="ace-icon fa fa-weibo text-primary red bigger-150"></i>
			</a> <a href="#"> <i
					class="ace-icon fa fa-windows Blue bigger-150"></i> </a> </span>
		</div>
		<!-- /section:basics/footer -->
	</div>
</div>
<a href="#" id="btn-scroll-up"
	class="btn-scroll-up btn btn-sm btn-inverse"> <i
	class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i> 
</a>