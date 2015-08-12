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
							<div class="page-header">
										<h1>
											人员综合信息管理
										<small>
											<i class="ace-icon fa fa-angle-double-right"></i>
												人员基本信息单条录入
										</small>
										</h1>
									</div>
								<form class="form-horizontal" role="form" method="post" action="userInfo.userBase.userBaseInfoSingle.result.do">
								
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
																		<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 姓名: </label>

																		<div class="col-sm-9">
																			<input id="form-field-1" placeholder="Username" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.employeename">
																		</div>
																	</div>

																	<div class="form-group">
																		<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 身份证号: </label>

																		<div class="col-sm-9">
																			<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.idnumber">
																		</div>
																	</div>
																</div>	
																<div class="col-xs-6">

																<div class="form-group">
																	<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 性别: </label>
																	<div class="col-sm-9">
																		<div class="radio">
																			<label>
																				<input name="form-field-radio" class="ace" type="radio" name="tbEmployee.sex">
																				<span class="lbl"> 男</span>
																			</label>
																			<label>
																				<input name="form-field-radio" class="ace" type="radio" name="tbEmployee.sex">
																				<span class="lbl"> 女</span>
																			</label>
																		</div>
																	</div>
																</div>
																		<div class="form-group">
																	<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 出生年月: </label>

																	<div class="col-sm-9">
																		<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.birthday">
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
													<h4 class="widget-title">请选择</h4>
												</div>

												<div class="widget-body">
													<div class="widget-main">
														<div class="row">
															<div class="col-xs-12">
																<div class="col-xs-6">
																	<div class="form-group">
																	<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 有无工号: </label>
																		<div class="col-sm-9">
																		<div class="radio">
																			<label>
																		<input name="form-field-radio" class="ace" type="radio">
																		<span class="lbl"> 有工号</span>
																		</label>
																		<label>
																	<input name="form-field-radio" class="ace" type="radio">
																	<span class="lbl"> 无工号</span>
																</label>
															</div>
														</div>
																	</div>
																	
																	<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 是否已分厅: </label>
													<div class="col-sm-9">
														<div class="radio">
															<label>
																<input name="form-field-radio1" class="ace" type="radio">
																<span class="lbl"> 已分厅</span>
															</label>
															<label>
																<input name="form-field-radio1" class="ace" type="radio">
																<span class="lbl"> 未分厅</span>
															</label>
														</div>
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 营业厅名称: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="tbEmployee.organizationNj.orgid">
															<option value=""></option>	
															<c:forEach items="${ requestScope.orgs}" var="org">
																<option value="${org.orgid}">
																	<c:out value="${org.orgName }"></c:out>
																</option>
															</c:forEach>													
														</select>
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 区域: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text">
													</div>
												</div>
																	
																	
																</div>
																<div class="col-xs-6">
																	
																	<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 工号: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.employeecode">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 营业厅类型: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="tbEmployee.orgtype">
															<option value=""></option>
															<c:forEach items="${requestScope.orgs}" var="org">
																<option value="${org.orgid}">
																	<c:out value="${org.type }"></c:out>
																</option>
															</c:forEach>
														</select>
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 营业厅编碼: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text">
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
														<a href="#" data-action="collapse">
															<i class="ace-icon fa fa-chevron-down"></i>
														</a>

														<a href="#" data-action="close">
															<i class="ace-icon fa fa-times"></i>
														</a>
													</div>
												</div>
												<div class="widget-body" style="display: none;">
													<div class="widget-main">
														<div class="row">
															<div class="col-xs-12">
																<div class="col-xs-6">
																	
																	<div class="form-group">
																		<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 银行卡号: </label>

																		<div class="col-sm-9">
																		    <input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.banknumber">
																	    </div>
																	</div>
																	
																	<div class="form-group">
																		<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 银行卡所属银行: </label>

																		<div class="col-sm-9">
																			<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.bankname">
																		</div>
																	</div>
																	
																	<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 人员状态: </label>
													<div class="col-sm-9">
														<div class="radio">
															<label>
																<input name="form-field-radio" class="ace" type="radio" name="tbEmployee.status">
																<span class="lbl"> 有效</span>
															</label>
															<label>
																<input name="form-field-radio" class="ace" type="radio" name="tbEmployee.status">
																<span class="lbl"> 无效</span>
															</label>
														</div>
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 居住所属区域: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.addressarea">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 现居住地址: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.address">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 学历: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Username" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.academicdegree"> 
													</div>
												</div>
													
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 长号: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.mobilenumber">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 短号: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.shortmobilenumber">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 毕业学校: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.schoolname">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 专业: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.specialization">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 移动营业技能鉴定水平: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="">
															<option value=""></option>
															<option value="AL">初级</option>
															<option value="AK">中级</option>
															<option value="AK">高级</option>
														</select>
													</div>
												</div>
						
																	
																</div>
																<div class="col-xs-6">
																	
																	<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 联系电话: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.tel">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 进公司时间: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.entertime">
													</div>
												</div>

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 后台岗位说明: </label>

													<div class="col-sm-9">
														<input id="form-field-1" placeholder="Userid" class="col-xs-10 col-sm-5" type="text" name="tbEmployee.frontbackflag">
													</div>
												</div>

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 前后台标识: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1">
															<option value=""></option>
															<option value="AL">前台</option>
															<option value="AK">后台</option>
														</select>
													</div>
												</div>

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 电信业务营销员技能鉴赏水平: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1">
															<option value=""></option>
															<option value="AL">初级</option>
															<option value="AK">中级</option>
															<option value="AK">高级</option>
														</select>
													</div>
												</div>

												

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 岗职: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="tbEmployee.tbPost.postid">
															<option value=""></option>
															<c:forEach items="${requestScope.posts}" var="post">
																<option value="${post.postid}">
																	<c:out value="${post.postname }"></c:out>
																</option>
															</c:forEach>
														</select>
													</div>
												</div>

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 岗位: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="tbEmployee.tbJob.jobid">
															<option value=""></option>
															<c:forEach items="${requestScope.jobs}" var="job">
																<option value="${job.jobid}">
																	<c:out value="${job.jobname }"></c:out>
																</option>
															</c:forEach>
														</select>
													</div>
												</div>

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 人员类别: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="tbEmployee.employeetype">
															<option value=""></option>
															<c:forEach items="${requestScope.employees}" var="employee">
																<option value="${employee.employeeid}">
																	<c:out value="${employee.employeetype}"></c:out>
																</option>
															</c:forEach>
														</select>
													</div>
												</div>

												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 角色类别: </label>

													<div class="col-sm-9">
														<select class="form-control" id="form-field-select-1" name="tbEmployee.tbRole.roleid">
															<option value=""></option>
															<c:forEach items="${requestScope.roles}" var="role">
																<option value="${role.roleid}">
																	<c:out value="${role.rolename}"></c:out>
																</option>
															</c:forEach>
														</select>
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 备注: </label>

													<div class="col-sm-9">
														<textarea class="form-control" id="form-field-8" placeholder="Default Text" name="tbEmployee.remark"></textarea>
													</div>
												</div>
																</div>
															</div>
												
														</div>
										<div class="clearfix form-actions">
										<div class="col-md-offset-5 col-md-6">
											<input class="btn btn-info" type="submit" value="确定">
											&nbsp; &nbsp; &nbsp;
											<input class="btn" type="reset" value="重置">											
										</div>
									</div>
													</div>
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