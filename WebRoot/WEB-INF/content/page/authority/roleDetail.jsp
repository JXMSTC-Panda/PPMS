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
<link rel="stylesheet"
	href="../../../plugin/zTree/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
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
						<li><a href="#">父功能</a></li>
						<li class="active">子功能</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<form class="form-horizontal" role="form">

								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> 权限角色： </label>

									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="UserName"
											value="default" class="col-xs-10 col-sm-5"
											readonly="readonly" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> 系统管理员： </label>

									<div class="col-sm-9">
										<div class="radio">
											<label> <input name="form-field-radio" type="radio"
												class="ace" disabled="disabled" /> <span class="lbl">
													是</span> </label> <label> <input name="form-field-radio"
												type="radio" class="ace" disabled="disabled"
												checked="checked" /> <span class="lbl">否</span> </label> <font
												color="red">[系统管理员可拥有所有操作权限]</font>
										</div>
									</div>
									<div class="col-lg-12" style="text-align: center;">
										<ul id="treeDemo" class="ztree"></ul>
									</div>
								</div>

								<div class="clearfix form-actions">
									<div class="col-md-offset-3 col-md-9">
										<button class="btn btn-info" type="button">
											<i class="ace-icon fa fa-check bigger-110"></i> 修改
										</button>

										&nbsp; &nbsp; &nbsp;
										<button class="btn" type="reset">
											<i class="ace-icon fa fa-undo bigger-110"></i> 返回
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
	<script type="text/javascript"
		src="../../../plugin/zTree/js/jquery.ztree.all-3.5.min.js"></script>
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
	<!--
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
		var zNodes = [ {
			id : 1,
			pId : 0,
			name : "权限管理",
			open : true,
			chkDisabled : true
		}, {
			id : 11,
			pId : 1,
			name : "权限管理",
			open : true
		}, {
			id : 111,
			pId : 11,
			name : "角色增加",
		}, {
			id : 112,
			pId : 11,
			name : "角色查询"
		}, {
			id : 113,
			pId : 11,
			name : "角色修改"
		}, {
			id : 114,
			pId : 11,
			name : "角色删除"
		}, {
			id : 2,
			pId : 0,
			name : "人员综合信息管理",
			checked : true,
			open : false,
			chkDisabled : true
		}, {
			id : 21,
			pId : 2,
			name : "人员基本信息管理",
			checked : true
		}, {
			id : 211,
			pId : 21,
			name : "人员基本信息单条录入"
		}, {
			id : 212,
			pId : 21,
			name : "人员基本信息批量导入"
		}, {
			id : 213,
			pId : 21,
			name : "人员基本信息批量修改"
		}, {
			id : 214,
			pId : 21,
			name : "人员基本信息查询"
		}, {
			id : 215,
			pId : 21,
			name : "人员基本信息修改"
		}, {
			id : 216,
			pId : 21,
			name : "人员基本信息删除"
		}, {
			id : 217,
			pId : 21,
			name : "人员基本信息失效"
		}, {
			id : 22,
			pId : 2,
			name : "员工成长档案查询",
			checked : true
		}, {
			id : 221,
			pId : 22,
			name : "人员调厅记录查询"
		}, {
			id : 222,
			pId : 22,
			name : "营业厅编码查询"
		}, {
			id : 23,
			pId : 2,
			name : "人员调厅记录查询",
			checked : true
		}, {
			id : 231,
			pId : 23,
			name : "人员调厅记录查询"
		}, {
			id : 232,
			pId : 23,
			name : "营业厅编码查询"
		}, {
			id : 24,
			pId : 2,
			name : "店长测评、进阶查询",
			checked : true
		}, {
			id : 241,
			pId : 24,
			name : "店长测评查询"
		}, {
			id : 241,
			pId : 24,
			name : "店长进阶查询"
		}, {
			id : 25,
			pId : 2,
			name : "值班经理测评、进阶查询",
			checked : true
		}, {
			id : 231,
			pId : 25,
			name : "值班经理测评查询"
		}, {
			id : 231,
			pId : 25,
			name : "值班经理进阶查询"
		}, {
			id : 26,
			pId : 2,
			name : "合作厅上岗证查询"
		}, {
			id : 231,
			pId : 26,
			name : "上岗证单条录入"
		}, {
			id : 231,
			pId : 26,
			name : "上岗证批量导入"
		}, {
			id : 231,
			pId : 26,
			name : "上岗证查询"
		}, {
			id : 231,
			pId : 26,
			name : "上岗证修改"
		}, {
			id : 231,
			pId : 26,
			name : "上岗证删除"
		}, {
			id : 3,
			pId : 0,
			name : "员工培训/考试管理",
			checked : true,
			open : false,
			chkDisabled : true
		}, {
			id : 31,
			pId : 3,
			name : "月度考试管理",
		}, {
			id : 311,
			pId : 31,
			name : "月度考试成绩单条录入"
		}, {
			id : 312,
			pId : 31,
			name : "月度考试成绩批量导入"
		}, {
			id : 313,
			pId : 31,
			name : "月度考试成绩查询"
		}, {
			id : 314,
			pId : 31,
			name : "月度考试成绩修改"
		}, {
			id : 315,
			pId : 31,
			name : "月度考试成绩删除"
		}, {
			id : 32,
			pId : 3,
			name : "业务培训管理",
		}, {
			id : 321,
			pId : 32,
			name : "业务培训成绩单条录入"
		}, {
			id : 322,
			pId : 32,
			name : "业务培训成绩批量导入"
		}, {
			id : 323,
			pId : 32,
			name : "业务培训成绩查询"
		}, {
			id : 324,
			pId : 32,
			name : "业务培训成绩修改"
		}, {
			id : 325,
			pId : 32,
			name : "业务培训成绩删除"
		}, {
			id : 33,
			pId : 3,
			name : "进阶培训管理",
		}, {
			id : 331,
			pId : 33,
			name : "进阶培训成绩单条录入"
		}, {
			id : 332,
			pId : 33,
			name : "进阶培训成绩批量导入"
		}, {
			id : 333,
			pId : 33,
			name : "进阶培训成绩查询"
		}, {
			id : 334,
			pId : 33,
			name : "进阶培训成绩修改"
		}, {
			id : 335,
			pId : 33,
			name : "进阶培训成绩删除"
		}, {
			id : 34,
			pId : 3,
			name : "新员工/转正考核管理",
		}, {
			id : 341,
			pId : 34,
			name : "新员工考核成绩单条录入"
		}, {
			id : 342,
			pId : 34,
			name : "新员工考核成绩批量导入"
		}, {
			id : 343,
			pId : 34,
			name : "新员工考核成绩查询"
		}, {
			id : 344,
			pId : 34,
			name : "新员工考核成绩修改"
		}, {
			id : 345,
			pId : 34,
			name : "新员工考核成绩删除"
		}, {
			id : 346,
			pId : 34,
			name : "转正考核成绩单条录入"
		}, {
			id : 347,
			pId : 34,
			name : "转正考核成绩批量导入"
		}, {
			id : 348,
			pId : 34,
			name : "转正考核成绩查询"
		}, {
			id : 349,
			pId : 34,
			name : "转正考核成绩修改"
		}, {
			id : 3410,
			pId : 34,
			name : "转正考核成绩删除"
		}, {
			id : 4,
			pId : 0,
			name : "标准化和暗访管理",
			checked : true,
			open : false,
			chkDisabled : true
		}, {
			id : 41,
			pId : 4,
			name : "标准化检查成绩管理",
		}, {
			id : 411,
			pId : 41,
			name : "标准化检查成绩单条录入"
		}, {
			id : 412,
			pId : 41,
			name : "标准化检查成绩批量导入"
		}, {
			id : 413,
			pId : 41,
			name : "标准化检查成绩查询"
		}, {
			id : 414,
			pId : 41,
			name : "标准化检查成绩修改"
		}, {
			id : 42,
			pId : 4,
			name : "监控检查成绩管理",
		}, {
			id : 421,
			pId : 42,
			name : "监控检查成绩单条录入"
		}, {
			id : 422,
			pId : 42,
			name : "监控检查成绩批量导入"
		}, {
			id : 423,
			pId : 42,
			name : "监控检查成绩查询"
		}, {
			id : 424,
			pId : 42,
			name : "监控检查成绩修改"
		}, {
			id : 425,
			pId : 42,
			name : "监控检查成绩删除"
		}, {
			id : 43,
			pId : 4,
			name : "暗访检查成绩管理",
		}, {
			id : 431,
			pId : 43,
			name : "暗访检查成绩单条录入"
		}, {
			id : 432,
			pId : 43,
			name : "暗访检查成绩单条录入"
		}, {
			id : 433,
			pId : 43,
			name : "暗访检查成绩单条录入"
		}, {
			id : 434,
			pId : 43,
			name : "暗访检查成绩修改"
		}, {
			id : 44,
			pId : 4,
			name : "业务差错检查成绩管理",
		}, {
			id : 441,
			pId : 44,
			name : "业务差错单条录入"
		}, {
			id : 442,
			pId : 44,
			name : "业务差错批量导入"
		}, {
			id : 443,
			pId : 44,
			name : "业务差错查询"
		}, {
			id : 444,
			pId : 44,
			name : "业务差错修改"
		}, {
			id : 445,
			pId : 44,
			name : "业务差错删除"
		}, {
			id : 5,
			pId : 0,
			name : "积分管理",
			open : false,
			chkDisabled : true
		}, {
			id : 51,
			pId : 5,
			name : "积分管理",
			open : false
		}, {
			id : 511,
			pId : 51,
			name : "积分批量导入",
			chkDisabled : true
		}, {
			id : 512,
			pId : 51,
			name : "积分查询"
		}, {
			id : 513,
			pId : 51,
			name : "积分删除"
		}, {
			id : 6,
			pId : 0,
			name : "创新管理",
			open : false,
			chkDisabled : true
		}, {
			id : 61,
			pId : 6,
			name : "创新管理",
			open : false
		}, {
			id : 611,
			pId : 61,
			name : "创新提案单条录入",
			chkDisabled : true
		}, {
			id : 612,
			pId : 61,
			name : "创新提案批量导入"
		}, {
			id : 613,
			pId : 61,
			name : "创新提案查询"
		}, {
			id : 614,
			pId : 61,
			name : "创新提案修改"
		}, {
			id : 615,
			pId : 61,
			name : "创新提案删除"
		}, {
			id : 7,
			pId : 0,
			name : "奖惩管理",
			open : false,
			chkDisabled : true
		}, {
			id : 71,
			pId : 7,
			name : "员工奖惩信息管理",
			open : false
		}, {
			id : 711,
			pId : 71,
			name : "员工奖惩信息单条录入",
			chkDisabled : true
		}, {
			id : 712,
			pId : 71,
			name : "员工奖惩信息批量导入"
		}, {
			id : 713,
			pId : 71,
			name : "员工奖惩信息查询"
		}, {
			id : 714,
			pId : 71,
			name : "员工奖惩信息修改"
		}, {
			id : 715,
			pId : 71,
			name : "员工奖惩信息删除"
		}, {
			id : 72,
			pId : 7,
			name : "营业厅奖惩信息管理",
			open : false
		}, {
			id : 711,
			pId : 72,
			name : "营业厅奖惩信息单条录入",
			chkDisabled : true
		}, {
			id : 712,
			pId : 72,
			name : "营业厅奖惩信息批量导入"
		}, {
			id : 713,
			pId : 72,
			name : "营业厅奖惩信息查询"
		}, {
			id : 714,
			pId : 72,
			name : "营业厅奖惩信息修改"
		}, {
			id : 715,
			pId : 72,
			name : "营业厅奖惩信息删除"
		}, {
			id : 8,
			pId : 0,
			name : "绩效管理",
			open : false,
			chkDisabled : true
		}, {
			id : 81,
			pId : 8,
			name : "月度绩效管理",
			open : false
		}, {
			id : 811,
			pId : 81,
			name : "月度绩效未提交事项提醒",
			chkDisabled : true
		}, {
			id : 812,
			pId : 81,
			name : "月度绩效单条录入"
		}, {
			id : 813,
			pId : 81,
			name : "月度绩效批量导入"
		}, {
			id : 814,
			pId : 81,
			name : "月度绩效查询"
		}, {
			id : 815,
			pId : 81,
			name : "月度绩效上传功能开通"
		}, {
			id : 816,
			pId : 81,
			name : "月度绩效修改",
			chkDisabled : true
		}, {
			id : 817,
			pId : 81,
			name : "月度绩效删除"
		}, {
			id : 818,
			pId : 81,
			name : "月度绩效评分标准上传"
		}, {
			id : 819,
			pId : 81,
			name : "月度绩效评分标准更新"
		}, {
			id : 8110,
			pId : 81,
			name : "月度绩效评分标准删除"
		}, {
			id : 8111,
			pId : 81,
			name : "月度绩效评分标准查看"
		}, {
			id : 82,
			pId : 8,
			name : "年度绩效管理",
			open : false
		}, {
			id : 821,
			pId : 82,
			name : "年度绩效单条录入",
			chkDisabled : true
		}, {
			id : 822,
			pId : 82,
			name : "年度绩效批量导入"
		}, {
			id : 823,
			pId : 82,
			name : "年度绩效查询"
		}, {
			id : 824,
			pId : 82,
			name : "年度绩效修改"
		}, {
			id : 825,
			pId : 82,
			name : "年度绩效删除"
		}, {
			id : 826,
			pId : 82,
			name : "年度绩效评分标准上传",
			chkDisabled : true
		}, {
			id : 827,
			pId : 82,
			name : "年度绩效评分标准更新"
		}, {
			id : 828,
			pId : 82,
			name : "年度绩效评分标准删除"
		}, {
			id : 829,
			pId : 82,
			name : "年度绩效评分标准查看"
		}, {
			id : 9,
			pId : 0,
			name : "其它",
			open : true,
			chkDisabled : true
		}, {
			id : 91,
			pId : 9,
			name : "其它",
			open : true
		}, {
			id : 911,
			pId : 91,
			name : "批量导入模板下载",
			chkDisabled : true
		}, {
			id : 912,
			pId : 91,
			name : "系统设定"
		}, ];

		function disabledNode(e) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"), disabled = e.data.disabled, nodes = zTree
					.getSelectedNodes(), inheritParent = false, inheritChildren = false;
			if (nodes.length == 0) {
				alert("请先选择一个节点");
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
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			$("#disabledTrue").bind("click", {
				disabled : true
			}, disabledNode);
			$("#disabledFalse").bind("click", {
				disabled : false
			}, disabledNode);
		});
	//-->
	</script>
</body>
</html>
<!-- http://localhost:8080/QQL1133Attend/index.jsp -->