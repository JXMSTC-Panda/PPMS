<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML>
<html>
<head>
<title>出错了</title>
<meta name="keywords"
	content="404 iphone web template, Andriod web template, Smartphone web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<link href="${pageContext.request.contextPath}/plugin/Others/error.css"
	rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<!--start-wrap--->
	<div class="wrap">
		<!---start-header---->
		<div class="header">
			<div class="logo">
				<h1>
					<a href="#">Ohh</a>
				</h1>
			</div>
		</div>
		<!---End-header---->
		<!--start-content------>
		<div class="content">
			<img
				src="${pageContext.request.contextPath}/plugin/Others/images/error-img.png"
				title="error" />
			<p>
				<span><label>O</label>hh.....</span> <span id="errorReason">${errorInfo}</span>
			</p>
			<div>
				<c:forEach items="${errorInfos}" var="eis" varStatus="status">
					<span>${eis.index}${eis.info}</span><br>
				</c:forEach>
			</div>
			<a id="backUrl" href="${backUrl}">返回</a><a id="backUrl" href="${backUrl}">登录</a>
			<div class="copy-right">
				<p>
					&#169 All rights Reserved | Designed by <a href="http://chnn.com/">jxmstc.pandas</a>
				</p>
			</div>
		</div>
		<!--End-Cotent------>
	</div>
	<!--End-wrap--->
</body>
</html>
