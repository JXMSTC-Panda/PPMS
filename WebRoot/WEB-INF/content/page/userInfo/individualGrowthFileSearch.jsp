<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
<script type="text/javascript">
	function goToPage() {
		var input = document
				.getElementsByName("tbChangejobhistory.tbEmployee.employeeid")[0];
		top.window.location = "userInfo.growthFile.individualGrowthFileSearch.do?tbChangejobhistory.tbEmployee.employeeid="
				+ input.value;

	}
</script>
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
							<div class="page-header">
								<h1>
									员工成长档案管理 <small> <i
										class="ace-icon fa fa-angle-double-right"></i> 个人成长路线查询 </small>
								</h1>
							</div>
							<form class="form-horizontal" role="form" method="post">
								<table class="table table-striped table-bordered">
									<thead>

										<c:if test="${requestScope.tbChangejobs==null}">
											<tr>
												<td>工号: <input
													name="tbChangejobhistory.tbEmployee.employeeid" value=""></input>
												</td>
												<td>姓名: <input readonly="readonly" value="" /></td>
												<td>身份证号: <input readonly="readonly" value="" /></td>
												<td>所属营业厅: <input readonly="readonly" value="" /></td>
											</tr>
										</c:if>

										<c:if test="${requestScope.tbChangejobs!=null}">

											<tr>
												<td>工号: <input
													name="tbChangejobhistory.tbEmployee.employeeid"
													value="${requestScope.tbChangejobs.get(0).tbEmployee.employeeid}"></input>
												</td>
												<td>姓名: <input readonly="readonly"
													value="${requestScope.tbChangejobs.get(0).tbEmployee.employeename}" />
												</td>
												<td>身份证号: <input readonly="readonly"
													value="${requestScope.tbChangejobs.get(0).tbEmployee.idnumber}" />
												</td>
												<td>所属营业厅: <input readonly="readonly"
													value="${tbChangejob.tbEmployee.organizationNj.org_Name}" />
												</td>
											</tr>
										</c:if>


									</thead>
								</table>
								<div class="space"></div>
								<table class="table table-striped table-bordered">
									<thead>
										<tr>
											<th class="center">序号</th>

											<th style="text-align: center;">时间</th>
											<th style="text-align: center;">阶段</th>
										</tr>
									</thead>
									<tbody align="center">
										<c:if test="${requestScope.tbChangejobs==null}">
											没有调厅记录
										</c:if>
										<c:if test="${requestScope.tbChangejobs!=null}">
											<c:forEach items="${requestScope.tbChangejobs}"
												var="tbChange" varStatus="status">
												<tr>
													<c:if test="${requestScope.tbChangejobs==null}">
														没有调厅记录
													</c:if>
													<td>${status.index + 1}</td>
													<td>${fn:split(tbChange.changedate,' ')[0]}</td>
													<td>${tbChange.tbJobByOutjobid.jobname}</td>
												</tr>
											</c:forEach>
										</c:if>
									</tbody>
								</table>
								<div class="clearfix form-actions">
									<!-- <div class="col-md-offset-5 col-md-6">
										<button class="btn btn-info" type="submit">
											<i class="ace-icon fa fa-check bigger-110"></i> 导出Excel
										</button> -->
										<div class="col-md-offset-5 col-md-6">
										<button class="btn btn-info" type="button"
											onclick="goToPage()">
											<i class="ace-icon fa fa-check bigger-110"></i> 查询
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

	<!-- inline scripts related to this page -->
	<script>
		
	</script>
</body>
</html>