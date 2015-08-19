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
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery.gritter.css" />
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
						<li class="active">权限管理</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="page-header">
						<h1>
							权限管理 <small> <i class="ace-icon fa fa-angle-double-right"></i>
								角色添加</small>
						</h1>
					</div>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div id="alertDiv" class="alert alert-block alert-success">
								<button type="button" class="close" data-dismiss="alert">
									<i class="ace-icon fa fa-times"></i>
								</button>
								<i class="ace-icon fa "></i> <strong id="alertText" 　class="red"></strong>.
							</div>
							<form class="form-horizontal" id="form_roleadd" method="post" role="form"
								action="authority.null.roleSingle.roleAdd.do">

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1">权限角色：</label>

									<div class="col-sm-9">
										<input type="text" id="form-role-name" name="roleName"
											placeholder="角色名" class="col-xs-10 col-sm-5" />
									</div>
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1">系统管理员：</label>

									<div class="col-sm-9">
										<div class="radio">
											<label> <input name="role1" type="radio" class="ace" />
												<span class="lbl">是</span> </label> <label> <input
												name="role0" type="radio" class="ace" /> <span class="lbl">否</span>
											</label> <font color="red">[系统管理员可拥有所有操作权限]</font>
										</div>
									</div>
									<div class="col-lg-4" style="text-align: center;">
										<ul id="treeDemo" class="ztree"></ul>
									</div>
								</div>
								<div class="clearfix form-actions">
									<div class="col-md-offset-3 col-md-9">
										<button class="btn btn-info" id="roleAddBtn" type="button">
											<i class="ace-icon fa fa-check bigger-110"></i>添加
										</button>
										&nbsp; &nbsp; &nbsp;
										<button class="btn" type="reset">
											<i class="ace-icon fa fa-undo bigger-110"></i>重置
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.gritter.js"></script>
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
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"), 
			disabled = e.data.disabled, 
			nodes = zTree.getSelectedNodes(), 
			inheritParent = false, 
			inheritChildren = false;
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
			$("#alertDiv").show();
			$("#alertDiv i").addClass("fa-spinner red");
			$("#alertDiv strong").addClass("red");
			$("#alertDiv strong").html("权限模块加载中......");
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
					//alert(JSON.stringify(zNodes));
					$("#alertDiv i").removeClass("fa-spinner red");
					$("#alertDiv strong").removeClass("red");
					$("#alertDiv i").addClass("fa-check green");
					$("#alertDiv strong").addClass("green");
					$("#alertDiv strong").html("权限模块加载完成");
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
			//添加角色按钮
			$("#roleAddBtn").click(function() {
				//得到ZTree对象
				var treeObj = $.fn.zTree.getZTreeObj("treeDemo"),
				//被选中的节点
				nodes = treeObj.getCheckedNodes(true),
				v = "";
				alert(nodes);
				for ( var i = 0; i < nodes.length; i++) {
					v += nodes[i].name + ",";
					alert(nodes[i].id); //获取选中节点的值
				}
				alert(v);
				alert(JSON.stringify(nodes));
				$.ajax({
					cache : false,
					type : "POST",
					url : "authority.null.roleSingle.roleAdd.do",
					data : "{username:'" + "1" + "',pwd:'" + "2" + "'}",
					async : false,
					error : function(request) {
						$.gritter.add({
							title : '出错啦!',
							text : '网络似乎有问题！',
							sticky : true,
							time : 1000,
							speed : 10,
							position : 'center',
							class_name : 'gritter-light'
						});
					},
					success : function(data) {
						if (data == "1") {
							$.gritter.add({
								title : 'success!',
								text : '厉害' + data,
								sticky : true,
								time: 1000,
								speed : 10,
								position : 'center',
								class_name : 'gritter-light'
							});
							//location.href = "index.tachometer.do";
						} else {
							$.gritter.add({
								title : '出错啦!',
								text : '账号或密码错误，请重试！' + data,
								sticky : true,
								time: 1000,
								speed : 10,
								position : 'center',
								class_name : 'gritter-light'
							});
						}
					}
				});
			});
		});
	//-->
	</script>
</body>
</html>