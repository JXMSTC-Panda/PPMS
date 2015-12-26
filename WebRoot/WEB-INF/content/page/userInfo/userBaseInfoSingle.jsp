<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/Plugin/artDialog4.1.7/skins/default.css" />
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
						<li><i class="ace-icon fa fa-home home-icon"></i><a href="#">人员成长档案管理系统</a>
						</li>
						<li><a href="#">人员综合信息管理</a></li>
						<li class="active">人员基本信息管理</li>
					</ul>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div class="page-header">
								<h1>
									人员基本信息管理<small> <i
										class="ace-icon fa fa-angle-double-right"></i> 人员基本信息单条录入 </small>
								</h1>
							</div>
							<form class="form-horizontal" role="form" method="post"
								action="userInfo.userBase.userBaseInfoSingle.Single.do">
								<div class="widget-box">
									<div class="widget-header">
										<h4 class="widget-title">请选择</h4>
									</div>

									<div class="widget-body">
										<div class="widget-main">
											<div class="row">
												<div class="col-xs-12">
													<div class="col-xs-6">																										

														<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-input-readonly"> 营业厅名称： </label>
															<div class="col-sm-9">
																<input readonly=" " type="text"
																	class="col-xs-10 col-sm-5" id="form-input-readonly"
																	value="${organizationNj.org_Name}"
																	 /> <span
																	class="help-inline col-xs-12 col-sm-7">
																	<button type="button"
																		onClick="top.window.location='chooseOrg.do?backUrl=userInfo.userBase.userBaseInfoSingle.do'"
																		class="btn btn-info">选择营业厅</button> </span>
															</div>
														</div>

														<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-field-1"> 区域: </label>

															<div class="col-sm-9">
																<input id="form-field-1" class="col-xs-10 col-sm-5"
																	type="text" value="${organizationNj.areadesc}">
															</div>
														</div>


													</div>
													<div class="col-xs-6">

														
															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 营业厅类型: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.orgtype" >
																		<option value="${organizationNj.orgid }">
																		<c:if test="${organizationNj.type=='1' }">主厅</c:if>
																		<c:if test="${organizationNj.type=='2' }">合作厅</c:if>
																		<c:if test="${organizationNj.type=='3' }">置换厅</c:if>
																		</option>
																		
																	</select>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 营业厅编码: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.organizationNj.orgid" value="${organizationNj.orgid}">
																</div>
															</div>
														</div>
													</div>


												</div>
											</div>
										</div>
									</div>
								
								<div class="widget-box">
									<div class="widget-header">
										<h4 class="widget-title">基础信息</h4>
									</div>

									<div class="widget-body">
										<div class="widget-main">
											<div class="row">
												<div class="col-xs-12">
													<div class="col-xs-6">
														<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-field-1"> 姓名: </label>

															<div class="col-sm-9">
																<input id="fname" class="col-xs-10 col-sm-5"
																	type="text" name="tbEmployee.employeename" onblur="isEmail(this.value)" onclick="isEmail(this.value)"><span id="ts"></span>
															</div>
														</div>

														<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-field-1"> 身份证号: </label>

															<div class="col-sm-9">
																<input id="form-field-1" class="col-xs-10 col-sm-5 input-mask-idnumber"
																	type="text" name="tbEmployee.idnumber">
															</div>
														</div>
													</div>
													<div class="col-xs-6">

														<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-field-1"> 性别: </label>
															<div class="col-sm-9">
																<div class="radio">
																	<label> <input 
																		class="ace" type="radio" name="tbEmployee.sex"
																		value="true"> <span class="lbl"> 男</span> </label> <label>
																		<input  class="ace"
																		type="radio" name="tbEmployee.sex" value="false">
																		<span class="lbl"> 女</span> </label>
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-field-1"> 出生年月: </label>

															<div class="col-sm-9">
																<div class="input-group col-xs-10 col-sm-5">
																	<input class="form-control date-picker "
																		id="id-date-picker-1" type="text"
																		data-date-format="yyyy-mm-dd"
																		name="tbEmployee.birthday" /> <span
																		class="input-group-addon"> <i
																		class="fa fa-calendar bigger-110"></i> </span>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								

									<div class="widget-box collapsed">
										<div class="widget-header">
											<h4 class="widget-title">详细信息录入</h4>

											<div class="widget-toolbar">
												<a href="#" data-action="collapse"> <i
													class="ace-icon fa fa-chevron-down"></i> </a> <a href="#"
													data-action="close"> <i class="ace-icon fa fa-times"></i>
												</a>
											</div>
										</div>
										<div class="widget-body" style="display: none;">
											<div class="widget-main">
												<div class="row">
													<div class="col-xs-12">
														<div class="col-xs-6">
																
															<div class="form-group">
															<label class="col-sm-3 control-label no-padding-right"
																for="form-field-1"> 工号: </label>

															<div class="col-sm-9">
																<input id="form-field-1" class="col-xs-10 col-sm-5"
																	type="text" name="tbEmployee.employeecode">
															</div>
														</div>	
															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 银行卡号: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5 input-mask-bankid"
																		type="text" name="tbEmployee.banknumber">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 银行卡所属银行: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.bankname">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 人员状态: </label>
																<div class="col-sm-9">
																	<div class="radio">
																		<label> <input
																			class="ace" type="radio" name="tbEmployee.status"
																			value="true"> <span class="lbl"> 有效</span> </label> <label>
																			<input  class="ace"
																			type="radio" name="tbEmployee.status" value="false">
																			<span class="lbl"> 无效</span> </label>
																	</div>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 居住所属区域: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.addressarea">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 现居住地址: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.address">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 学历: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.academicdegree">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 长号: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.mobilenumber">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 短号: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.shortmobilenumber">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 毕业学校: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.schoolname">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 专业: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.specialization">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 移动营业技能鉴定水平: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.mobilelevel">
																		<option value=""></option>
																		<option value="-1">初级</option>
																		<option value="0">中级</option>
																		<option value="1">高级</option>
																	</select>
																</div>
															</div>


														</div>
														<div class="col-xs-6">
															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 密码: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.idpassword">
																</div>
															</div>
															
															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 联系电话: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5 form-control input-mask-phone"
																		type="text" name="tbEmployee.tel" >
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 进公司时间: </label>
																
																<div class="col-sm-9">
																<div class="input-group col-xs-10 col-sm-5">
																	<input class="form-control date-picker "
																		id="id-date-picker-1" type="text"
																		data-date-format="yyyy-mm-dd"
																		name="tbEmployee.entertime" /> <span
																		class="input-group-addon"> <i
																		class="fa fa-calendar bigger-110"></i> </span>
																</div>
															</div>																																
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 后台岗位说明: </label>

																<div class="col-sm-9">
																	<input id="form-field-1" class="col-xs-10 col-sm-5"
																		type="text" name="tbEmployee.backjobcomment">
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 前后台标识: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.frontbackflag">
																		<option value=""></option>
																		<option value="true">前台</option>
																		<option value="false">后台</option>
																	</select>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 电信业务营销员技能鉴赏水平: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.telecomlevel">
																		<option value=""></option>
																		<option value="-1">初级</option>
																		<option value="0">中级</option>
																		<option value="1">高级</option>
																	</select>
																</div>
															</div>



															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 岗职: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.tbPost.postid">
																		<option value=""></option>
																		<c:forEach items="${sessionScope.posts}" var="post">
																			<option value="${post.postid}">
																				<c:out value="${post.postname }"></c:out>
																			</option>
																		</c:forEach>
																	</select>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 岗位: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.tbJob.jobid">
																		<option value=""></option>
																		<c:forEach items="${sessionScope.jobs}" var="job">
																			<option value="${job.jobid}">
																				<c:out value="${job.jobname }"></c:out>
																			</option>
																		</c:forEach>
																	</select>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 人员类别: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.employeetype">
																		<option value=""></option>
																		<c:forEach items="${sessionScope.employees}"
																			var="employee">
																			<option value="${employee.employeeid}">
																				<c:out value="${employee.employeetype}"></c:out>
																			</option>
																		</c:forEach>
																	</select>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 角色类别: </label>

																<div class="col-sm-9">
																	<select class="form-control" id="form-field-select-1"
																		name="tbEmployee.tbRole.roleid">
																		<option value=""></option>
																		<c:forEach items="${sessionScope.roles}" var="role">
																			<option value="${role.roleid}">
																				<c:out value="${role.rolename}"></c:out>
																			</option>
																		</c:forEach>
																	</select>
																</div>
															</div>

															<div class="form-group">
																<label class="col-sm-3 control-label no-padding-right"
																	for="form-field-1"> 备注: </label>

																<div class="col-sm-9">
																	<textarea class="form-control" id="form-field-8"
																		name="tbEmployee.remark"></textarea>
																</div>
															</div>
														</div>
													</div>

												</div>
												<div class="clearfix form-actions">
													<div class="col-md-offset-5 col-md-6">
														<input class="btn btn-info" type="submit" value="确定">
														&nbsp; &nbsp; &nbsp; <input class="btn" type="reset"
															value="重置">
													</div>
												</div>
											</div>
										</div>

									</div>
							</form>
							<%request.getSession().removeAttribute("organizationNj"); %>
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
		src="${pageContext.request.contextPath}/assets/js/date-time/bootstrap-datepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/date-time/bootstrap-timepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/date-time/moment.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/date-time/daterangepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/date-time/bootstrap-datetimepicker.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.maskedinput.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/Plugin/artDialog4.1.7/artDialog.js"></script>
	<!-- inline scripts related to this page -->
	<script>
	$.mask.definitions['1']='[1]';
				$('.input-mask-idnumber').mask('999999999999999999',{placeholder:" ",completed:function(){}});
				$('.input-mask-phone').mask('19999999999',{placeholder:" ",completed:function(){}});
				$('.input-mask-bankid').mask('9999999999999999999',{placeholder:" ",completed:function(){}});
		//datepicker plugin
		//link
		$('.date-picker').datepicker({
			autoclose : true,
			todayHighlight : true
		})
		//show datepicker when clicking on the icon
		.next().on(ace.click_event, function() {
			$(this).prev().focus();
		});

		//or change it into a date range picker
		$('.input-daterange').datepicker({
			autoclose : true
		});

		//to translate the daterange picker, please copy the "examples/daterange-fr.js" contents here before initialization
		$('input[name=date-range-picker]').daterangepicker({
			'applyClass' : 'btn-sm btn-success',
			'cancelClass' : 'btn-sm btn-default',
			locale : {
				applyLabel : 'Apply',
				cancelLabel : 'Cancel',
			}
		}).prev().on(ace.click_event, function() {
			$(this).next().focus();
		});

		$('#timepicker1').timepicker({
			minuteStep : 1,
			showSeconds : true,
			showMeridian : false
		}).next().on(ace.click_event, function() {
			$(this).prev().focus();
		});

		$('#date-timepicker1').datetimepicker().next().on(ace.click_event,
				function() {
					$(this).prev().focus();
				});

		$('#colorpicker1').colorpicker();

		$('#simple-colorpicker-1').ace_colorpicker();
		
	</script>
</body>
</html>