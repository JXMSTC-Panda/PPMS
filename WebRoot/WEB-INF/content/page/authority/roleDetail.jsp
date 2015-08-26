<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jquery.gritter.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jquery-ui.custom.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/chosen.css" />
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
					<%-- <jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include> --%>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="page-header">
						<h1>
							权限管理 <small> <i class="ace-icon fa fa-angle-double-right"></i>
								角色详情</small>
						</h1>
					</div>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div id="alertDiv" class="alert alert-block alert-success">
								<button type="button" class="close" data-dismiss="alert">
									<i class="ace-icon fa fa-times"></i>
								</button>
								<i class="ace-icon fa "></i> <strong id="alertText" class="red"></strong>
								<input id="roleID" type="hidden" value="${roleID}">
								<input id="roleNodes" type="hidden" value="${roleNodes}">
								<input id="roleName" type="hidden" value="${roleName}">
							</div>
							<form class="form-horizontal" id="form_roleadd" method="post">

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1">权限角色：</label>

									<div class="col-sm-9">
										<input type="text" id="roleNameInput" placeholder="角色名"
											class="col-xs-10 col-sm-5"/>
									</div>
								</div>

								<div class="form-group">

									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1">系统管理员：</label>

									<div class="col-sm-9">
										<input id="roleCheckBox" class="ace ace-switch ace-switch-5"
											type="checkbox" value="${roleType}"/> <span class="lbl red">
											[系统管理员可拥有所有操作权限]</span>
									</div>
								</div>

								<div class="form-group">
									<div class=col-lg-3></div>
									<div class="col-lg-4" style="text-align: center;">
										<ul id="treeDemo" class="ztree"></ul>
									</div>
								</div>
								<div class="clearfix form-actions">
									<div class="col-md-offset-3 col-md-9">
										<button class="btn btn-info" id="roleUpdataBtn" type="button">
											<i class="ace-icon fa fa-check bigger-110"></i>修改
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
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/jquery.gritter.js"></script>
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
		
			if($("#roleCheckBox").val() == "1"){
				$("#roleCheckBox").attr("checked","checked");
			}
			$("#roleCheckBox").click(function(){
				if($(this).val()=="1"){
					$(this).removeAttr("value","1");
					$(this).removeAttr("checked","checked");
					$(this).attr("value","0");
				}else{
					$(this).removeAttr("","0");
					$(this).attr("value","1");
				}
			});
			//页面加载的时候初始化ztree
			$("#alertDiv").show();
			$("#alertDiv i").addClass("fa-spinner red");
			$("#alertDiv strong").addClass("red");
			$("#alertDiv strong").html("权限模块加载中......");
			var roleID = $("#roleID").val();
			var roleNodes = $("#roleNodes").val();
			$("#roleNameInput").val($("#roleName").val());
			$.get("authority.null.roleSearch.detail.init.do?roleID="+roleID, function(data) {
			
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
					
					var node,
					roleNodesArray = roleNodes.split(",");
					var zTree = $.fn.zTree.getZTreeObj("treeDemo");
					var reg2 = "[1,5,6,9][1-9]";
					var reg3 = "[2-4,7,8][1-9][1-9]";
					for(var i = 0;i < roleNodesArray.length;i++){
						var id = roleNodesArray[i];
						var reg2test = id.match(reg2);
						var reg3test = id.match(reg3);
						//alert(id + "," + reg2test + "," + reg3test);
						if(id.match(reg2) != null || id.match(reg3) != null){
							node = zTree.getNodeByParam("id",id);
							//alert(id);
                    		zTree.checkNode(node, true, true);
                    	}else{
                    	
                    	}
                    }
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

			//修改角色按钮
			$("#roleUpdataBtn").click(function() {

				$("#alertDiv").show();
				$("#alertDiv i").addClass("fa-spinner red");
				$("#alertDiv strong").addClass("red");
				$("#alertDiv strong").html("权限模块正在修改中......");
				var roleID = $("#alertDiv input").val()
				//角色名称
				,roleName = $("#roleNameInput").val()
				//角色类型
				,roleType = $("input[type='checkbox']").is(':checked')
				//得到ZTree对象
				,treeObj = $.fn.zTree.getZTreeObj("treeDemo"),
				//被选中的节点
				nodes = treeObj.getCheckedNodes(true), v = "";
				
				//alert(roleID + roleName);
				for ( var i = 0; i < nodes.length; i++) {
					if(i != nodes.length -1)
						v += nodes[i].id + ",";
					else
					    v += nodes[i].id;
				}
				//post到后台
				$.ajax({
					cache : false,
					type : "POST",
					url : "authority.null.roleSearch.modify.updataRole.do",
					datatype:"json",
					data : "roleID=" + roleID +
						   "&roleName=" + roleName + 
						   "&roleType=" + roleType + 
						   "&roleNodes=" + v,
					async : true,
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
								text : '<a>',
								sticky : true,
								time : 1000,
								speed : 10,
								position : 'center',
								class_name : 'gritter-light'
							});
							//location.href = "index.tachometer.do";
						} else {
							$.gritter.add({
								title : '出错啦!',
								text : data,
								sticky : true,
								time : 1000,
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