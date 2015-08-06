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
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace.css"
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
			try { ace.settings.check('main-container', 'fixed') } catch (e) { }
		</script>
		<jsp:include page="../../WebPart/Menu.jsp"></jsp:include>
		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try { ace.settings.check('breadcrumbs', 'fixed') } catch (e) { }
					</script>
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i><a href="#">Home</a>
						</li>
						<li><a href="#">Other Pages</a></li>
						<li class="active">Blank Page</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<form class="form-horizontal" role="form">
												<!-- #section:elements.form -->
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-input-readonly"> 区域： </label>
													<div class="col-sm-9">
														<input readonly="" type="text" class="col-xs-10 col-sm-5" id="form-input-readonly" value="" />
														<span class="help-inline col-xs-12 col-sm-7">		
											</span>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-input-readonly"> 营业厅编码： </label>
													<div class="col-sm-9">
														<input readonly="" type="text" class="col-xs-10 col-sm-5" id="form-input-readonly" value="" />
														<span class="help-inline col-xs-12 col-sm-7">
											</span>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-input-readonly"> 营业厅名称： </label>
													<div class="col-sm-9">
														<input readonly="" type="text" class="col-xs-10 col-sm-5" id="form-input-readonly" value="" />
														<span class="help-inline col-xs-12 col-sm-7">
															<input type="button" value="选择营业厅" class="btn_select_5" onclick="selectSingleBusinessHall.html"/>
														</span>
													</div>
												</div>
				<!-- /section:elements.form -->								
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 培训时间： </label>
													<div class="col-sm-9">
														<input type="text" id="form-field-1" placeholder="培训时间" class="col-xs-10 col-sm-5" />
													</div>
												</div>	
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 考试分数： </label>
													<div class="col-sm-9">
														<input type="text" id="form-field-1" placeholder="Grade" class="col-xs-10 col-sm-5" />
														<label class=" control-label no-padding-left" for="form-field-1"> 分 </label>
													</div>
												</div>
												<div class="clearfix form-actions">
													<div class="col-md-offset-3 col-md-9">
														<button class="btn btn-info" type="button">
															<i class="ace-icon fa fa-check bigger-110"></i> Submit
														</button>
														&nbsp; &nbsp; &nbsp;
														<button class="btn" type="reset">
															<i class="ace-icon fa fa-undo bigger-110"></i> Reset
														</button>
													</div>
												</div>
											</form>
										</div>
										<!-- /.col -->
									</div>
									<!-- /.row -->
								</div>
								<!-- /.page-content -->			
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