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
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/dropzone.css" />
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
						<li><i class="ace-icon fa fa-home home-icon"></i><a href="#">PPMS</a>
						</li>
						<li><a href="#">员工培训/考试管理</a>
						</li>
						<li class="active">新员工/转正考核 </li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div class="page-content">
									<!-- #section:settings.box -->

									<!-- /section:settings.box -->
									<div class="page-header">
										<h1>
								员工考核
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									新员工批量录入
								</small>
							</h1>
									</div>
									<!-- /.page-header -->

									<div class="row">
										<div class="col-xs-12">
											<div>
												<form action="../dummy.html" class="dropzone" id="dropzone">
													<div class="fallback">
														<input name="file" type="file" multiple="" />
													</div>
												</form>
											</div>

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
	<script src="${pageContext.request.contextPath}/assets/js/dropzone.js"></script>
	<!-- inline scripts related to this page -->
<script type="text/javascript">
		jQuery(function($) {
			try {
				Dropzone.autoDiscover = false;
				var myDropzone = new Dropzone(
						"#dropzone",
						{
							paramName : "file", // The name that will be used to transfer the file
							maxFilesize : 1024, // MB
							url : "upload.do?expect=新员工考核成绩批量导入模板.xls",
							addRemoveLinks : true,
							dictDefaultMessage : '<span class="bigger-150 bolder"><i class="ace-icon fa fa-caret-right red"></i> 拖拽文件</span> 上传 \
				<span class="smaller-80 grey">(或点我)</span> <br /> \
				<i class="upload-icon ace-icon fa fa-cloud-upload blue fa-3x"></i>',
							dictResponseError : '上传文件时出错!',
							//change the previewTemplate to use Bootstrap progress bars
							previewTemplate : "<div class=\"dz-preview dz-file-preview\">\n  <div class=\"dz-details\">\n    <div class=\"dz-filename\"><span data-dz-name></span></div>\n    <div class=\"dz-size\" data-dz-size></div>\n    <img data-dz-thumbnail />\n  </div>\n  <div class=\"progress progress-small progress-striped active\"><div class=\"progress-bar progress-bar-success\" data-dz-uploadprogress></div></div>\n  <div class=\"dz-success-mark\"><span></span></div>\n  <div class=\"dz-error-mark\"><span></span></div>\n  <div class=\"dz-error-message\"><span data-dz-errormessage></span></div>\n</div>"
						});
				$(document).one('ajaxloadstart.page', function(e) {
					try {
						myDropzone.destroy();
					} catch (e) {
					}
				});
			} catch (e) {
				alert('Dropzone.js 不支持老版本的浏览器');
			}
		});

		</script>
</body>
</html>