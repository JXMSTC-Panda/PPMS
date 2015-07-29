<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> <%
String path = request.getContextPath(); String basePath =
request.getScheme() + "://" + request.getServerName() + ":" +
request.getServerPort() + path + "/"; %>

<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>人员成长档案管理系统</title>

<meta name="description" content="" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="../../../assets/css/bootstrap.css" />
<link rel="stylesheet" href="../../../assets/css/font-awesome.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet" href="../../../assets/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet" href="../../../assets/css/ace.css"
	class="ace-main-stylesheet" id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="../../../assets/css/ace-part2.css" class="ace-main-stylesheet" />
		<![endif]-->

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="../../../assets/css/ace-ie.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script src="../../../assets/js/ace-extra.js"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="../../../assets/js/html5shiv.js"></script>
		<script src="../../../assets/js/respond.js"></script>
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
		<!-- /section:basics/sidebar -->
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
						<li><i class="ace-icon fa fa-home home-icon"></i><a href="#">人员档案管理系统</a>
						</li>
						<li><a href="#">父功能</a>
						</li>
						<li class="active">子功能</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div class="widget-box">
								<div class="widget-header widget-header-flat">
									<h4 class="widget-title">角色修改结果</h4>
								</div>
								<div class="widget-body">
									<div class="widget-main">
										<div class="row">
											<div class="col-xs-12">
												<ul class="list-unstyled spaced">
													<li class="center"><i
														class="ace-icon fa fa-bell-o bigger-110 purple"></i>下列角色修改成功</li>

													<li class="gray"><i
														class="ace-icon fa fa-exclamation-triangle bigger-110 orange"></i>
														请在权限配置文件中设定该角色的<span class="bigger-110 red">[人员基本信息查询、人员基本信息修改、人员基本信息批量修改]</span>功能的字段级权限属性（如不设定，默认为可操作全部字段）！
													</li>
													<li class="gray"><i
														class="ace-icon fa fa-exclamation-triangle bigger-110 orange"></i>
														若是<span class="bigger-110 red">[系统管理员]</span>角色，则无需设定，即使设定，也不生效！
													</li>

													<li class="center"><i
														class="ace-icon fa fa-key bigger-110 blue"></i> 角色ID：1111
													</li>
													<li class="center"><i
														class="ace-icon fa fa-user bigger-110 blue"></i> 角色名：管理员</li>

												</ul>
											</div>
										</div>
									</div>
								</div>
								<div class="clearfix form-actions">
									<div class="col-md-offset-5 col-md-7">

										<button class="btn" type="button"
											onclick="top.window.location='roleSearch.jsp'">
											<i class="ace-icon fa fa-mail-forward bigger-110"></i> 转至查询
										</button>
									</div>
								</div>
							</div>
							<!-- PAGE CONTENT ENDS -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="../../WebPart/CopyRight.jsp"></jsp:include>
	</div>
	<jsp:include page="../../WebPart/Script.jsp"></jsp:include>

</body>
</html>
<!-- http://localhost:8080/QQL1133Attend/index.jsp -->