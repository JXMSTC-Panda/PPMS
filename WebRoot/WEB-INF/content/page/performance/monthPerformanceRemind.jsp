<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>人员成长档案管理系统</title>

<meta name="description" content="" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/font-awesome.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/ace.css"
	class="ace-main-stylesheet" id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-part2.css" class="ace-main-stylesheet" />
		<![endif]-->

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-ie.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script src="${pageContext.request.contextPath}/assets/js/ace-extra.js"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="${pageContext.request.contextPath}/assets/js/html5shiv.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/respond.js"></script>
		<![endif]-->
</head>

<body class="no-skin">
	<jsp:include page="../../WebPart/Head.jsp"></jsp:include>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>
		<jsp:include page="../../WebPart/Menu.jsp"></jsp:include>
		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try {
							ace.settings.check('breadcrumbs', 'fixed')
						} catch (e) {
						}
					</script>
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i><a href="#">PPMS</a>
						</li>
						<li><a href="#">绩效管理</a>
						</li>
						<li class="active">月度绩效管理</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->

							<div class="page-header center">
								<h1>上月绩效未提交事项提醒</h1>
							</div>

							<table class="table table-striped table-bordered">
								<thead>
									<tr style="text-align: center;">
										<td>2008年东区域鼓楼营业厅共<a href="">4人</a>未提交绩效 <br />
											2008年南区域鼓楼营业厅共<a href="">5人</a>未提交绩效 <br /> 2008年西区域鼓楼营业厅共<a
											href="">6人</a>未提交绩效 <br /> 2008年北区域鼓楼营业厅共<a href="">7人</a>未提交绩效
											<br /></td>
									</tr>
								</thead>
							</table>
							<div class="space"></div>
							<div class="page-header center">
								<h1>上月之前绩效未提交事项提醒</h1>
							</div>
							<table class="table table-striped table-bordered">
								<thead>
									<tr style="text-align: center;">
										<td>2008年东区域鼓楼营业厅共<a href="">4人</a>未提交绩效 <br />
											2008年南区域鼓楼营业厅共<a href="">5人</a>未提交绩效 <br /> 2008年西区域鼓楼营业厅共<a
											href="">6人</a>未提交绩效 <br /> 2008年北区域鼓楼营业厅共<a href="">7人</a>未提交绩效
											<br /></td>
									</tr>
								</thead>
							</table>
							<!-- PAGE CONTENT ENDS -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="../../WebPart/CopyRight.jsp"></jsp:include>
	</div>
	<jsp:include page="../../WebPart/Script.jsp"></jsp:include>
	<!-- page specific plugin scripts -->

	<!-- inline scripts related to this page -->
	<script>
		
	</script>
</body>
</html>