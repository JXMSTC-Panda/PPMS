<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!-- auther:TyurinTsien -->
<!-- date:2015-07-28 14:36:19 -->
<html lang="zh-cn">
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugin/zTree/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
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
						<li><a href="#">权限管理</a></li>
						<li class="active">角色添加</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<form class="form-horizontal" role="form"
								action="roleSingleResult.do">

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1">权限角色：</label>

									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="UserName"
											class="col-xs-10 col-sm-5" />
									</div>
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1">系统管理员：</label>

									<div class="col-sm-9">
										<div class="radio">
											<label> <input name="form-field-radio" type="radio"
												class="ace" /> <span class="lbl">是</span> </label> <label>
												<input name="form-field-radio" type="radio" class="ace" />
												<span class="lbl">否</span> </label> <font color="red">[系统管理员可拥有所有操作权限]</font>
										</div>
									</div>
									<div class="col-lg-4" style="text-align: center;">
										<ul id="treeDemo" class="ztree"></ul>
									</div>
								</div>
								<div class="clearfix form-actions">
									<div class="col-md-offset-3 col-md-9">
										<button class="btn btn-info" type="submit">
											<i class="ace-icon fa fa-check bigger-110"></i>添加
										</button>
										&nbsp; &nbsp; &nbsp;
										<button class="btn" type="reset">
											<i class="ace-icon fa fa-undo bigger-110"></i>重置
										</button>
										<button id="btnTest" class="btn" type="button">
											<i class="ace-icon fa fa-undo bigger-110"></i>测试
										</button>
									</div>
								</div>
							</form>
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
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery-2.0.3.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.gritter.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/plugin/zTree/js/jquery.ztree.all-3.5.min.js"></script>
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
		var setting = {
			check : {
				enable : true,
				chkDisabledInherit : true
			},
			data : {
				simpleData : {
					enable : true
				}
			}
		};

		function disabledNode(e) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"), disabled = e.data.disabled, nodes = zTree
					.getSelectedNodes(), inheritParent = false, inheritChildren = false;
			if (nodes.length == 0) {
				$.gritter.add({
						title : '提示!',
						text : '请选择一个节点！',
						sticky : true,
						time : 1000,
						speed : 10,
						position : 'center',
						class_name : 'gritter-light'
					});
			}
			if (disabled) {
				inheritParent = $("#py").attr("checked");
				inheritChildren = $("#sy").attr("checked");
			} else {
				inheritParent = $("#pn").attr("checked");
				inheritChildren = $("#sn").attr("checked");
			}
			for ( var i = 0, l = nodes.length; i < l; i++) {
				zTree.setChkDisabled(nodes[i], disabled, inheritParent,
						inheritChildren);
			}
		}

		$(document).ready(function() {
			//页面加载的时候初始化ztree
			$.get("authority.null.roleSingle.init.do", function(data) {
				if (data.substr(0, 3) == "{\"p") {
					var obj = JSON.parse(data);
					var sysfunctions = obj.ppms.TbSystemfunctions;
					var zNodes = sysfunctions;
					$.fn.zTree.init($("#treeDemo"), setting, zNodes);
					$("#disabledTrue").bind("click", {
						disabled : true
					}, disabledNode);
					$("#disabledFalse").bind("click", {
						disabled : false
					}, disabledNode);
					alert(JSON.stringify(zNodes));
				} else {
					$.gritter.add({
						title : '出错啦!',
						text : '不好意思，权限加载失败！',
						sticky : true,
						time : 1000,
						speed : 10,
						position : 'center',
						class_name : 'gritter-dark'
					});
				}
			});
		});
	//-->
	</script>
</body>
</html>