<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
							<form action="#">
								<div class="page-content">
									<!-- #section:settings.box -->

									<!-- /section:settings.box -->
									<div class="page-header">
										<h1>
								其他
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									系统设置
								</small>
							</h1>
									</div>
									<!-- /.page-header -->

									<div class="row">
									
									<div class="col-xs-12  widget-container-col">
										<div class="widget-box widget-color-blue">
											<!-- #section:custom/widget-box.options -->
											

											<!-- /section:custom/widget-box.options -->
											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover" style="text-align: center;">
														<thead class="thin-border-bottom">
															<tr>
																<th style="text-align: center;"class="col-xs-2">
																	
																	序号
																</th>

																<th style="text-align: center;"colspan="2" class="col-xs-8">
																	通过的分值设定
																</th>
																<th style="text-align: center;" class="col-xs-2">
																	设定值
																</th>										
															</tr>
														</thead>

														<tbody>
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >1</td>

																<td class="col-xs-8" style="display: table-cell;vertical-align: middle;"colspan="2">
																	<a href="#">营业员上岗证考核成绩</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>

															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >2</td>

																<td class="col-xs-8" style="display: table-cell;vertical-align: middle;"colspan="2">
																	<a href="#">账务稽核人员上岗证考核成绩</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>

															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >3</td>

																<td class="col-xs-8" style="display: table-cell;vertical-align: middle;"colspan="2">
																	<a href="#">月度考试成绩</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>

															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >4</td>

																<td class="col-xs-8" style="display: table-cell;vertical-align: middle;"colspan="2">
																	<a href="#">业务培训考试成绩</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>

															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >5</td>

																<td class="col-xs-8" style="display: table-cell;vertical-align: middle;"colspan="2">
																	<a href="#">进阶培训考试成绩</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >6</td>

																<td class="col-xs-8" style="display: table-cell;vertical-align: middle;"colspan="2">
																	<a href="#">新员工考核成绩</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="3">7</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="3">
																	<a href="#">转正考核</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">考试成绩：</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">汉字：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx个/分钟"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">数字：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx个/分钟"/>
																	
																</td>	
																
															</tr>
															
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /.span -->
									
									<div class="col-xs-12  widget-container-col" style="margin-top: 30px;">
										<div class="widget-box widget-color-blue">
											<!-- #section:custom/widget-box.options -->
											

											<!-- /section:custom/widget-box.options -->
											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover" style="text-align: center;">
														<thead class="thin-border-bottom">
															<tr>
																<th style="text-align: center;">
																	
																	序号
																</th>

																<th style="text-align: center;"colspan="2">
																	加减分设定值
																</th>
																<th style="text-align: center;" >
																	设定值
																</th>										
															</tr>
														</thead>

														<tbody>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="3">1</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="3">
																	<a href="#">部门层级创新奖励方式</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">个人成长档案加分</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">个人月度绩效</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">经费奖励</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															
															
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="3">2</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="3">
																	<a href="#">区域层级创新奖励方式</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">个人成长档案加分</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">个人月度绩效</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">经费奖励</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="4">3</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="4">
																	<a href="#">员工奖惩信息-惩罚</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">公司发文通报：</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">中心通报：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">区域通报：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">明暗访扣分：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="3">4</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="3">
																	<a href="#">员工奖惩信息-表彰</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">公司发文表彰：</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">中心表彰：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">区域表彰：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="2">5</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="2">
																	<a href="#">员工奖惩信息-月度考试成绩/新员工考核成绩</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">营业员/新员工考核<br /></a>
																		<input  type="text" placeholder="<=xx分"/>
																	
																	
																</td>	
																<td style="text-align: center; display: table-cell;vertical-align: middle;"  class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">营业员/新员工考核<br /></a>
																		<input  type="text" placeholder=">=xx分"/>
														
																	
																</td>	
																<td style="text-align: center; display: table-cell;vertical-align: middle;"  class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>		
																
															</tr>
															
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="3">6</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="3">
																	<a href="#">营业厅奖惩信息-惩罚</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">公司发文通报：</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">中心通报：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">区域通报：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="3">7</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="3">
																	<a href="#">营业厅奖惩信息-表彰</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">公司发文表彰：</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">中心表彰：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">区域表彰：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" rowspan="5">8</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" rowspan="5">
																	<a href="#">年度绩效等级</a>
																</td>
																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">优秀：</a>
																	
																</td>	
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">优良：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">良好：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">一般：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分"/>
																	
																</td>	
																
															</tr>
															<tr>
																

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;">
																	<a href="#">需改进：</a>
																</td>
																<td style="text-align: center;" class="col-xs-2">
																	<input  type="text" placeholder=">=xx分" />
																	
																</td>	
																
															</tr>
															
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /.span -->
									
									
									<div class="col-xs-12  widget-container-col" style="margin-top: 30px;">
										<div class="widget-box widget-color-blue">
											<!-- #section:custom/widget-box.options -->
											

											<!-- /section:custom/widget-box.options -->
											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover" style="text-align: center;">
														<thead class="thin-border-bottom">
															<tr>
																<th style="text-align: center;">
																	
																	序号
																</th>

																<th style="text-align: center;">
																	加减分设定值
																</th>
																<th style="text-align: center;" >
																	设定值
																</th>										
															</tr>
														</thead>

														<tbody>
															
															<tr>
																<td class="col-xs-2" style="display: table-cell;vertical-align: middle;" >1</td>

																<td class="col-xs-4" style="display: table-cell;vertical-align: middle;" >
																	<a href="#">下次绩效上传截至时间</a>
																</td>
																
																<td style="text-align: center;" class="col-xs-6">
																	<div class="input-group">
																		<input id="date-timepicker1" type="text" class="form-control" />
																		<span class="input-group-addon">
																			<i class="fa fa-clock-o bigger-110"></i>
																		</span>
																	</div>
																</td>	
																
															</tr>
														
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /.span -->
									
								</div><!-- /.row -->
									<!-- /.row -->
								</div>
												<div class="clearfix form-actions">
													<div class="col-md-offset-3 col-md-9" >
														&nbsp; &nbsp; &nbsp;
														&nbsp; &nbsp; &nbsp;
														&nbsp; &nbsp; &nbsp;
														&nbsp; &nbsp; &nbsp;
														&nbsp; &nbsp; &nbsp;
														&nbsp; &nbsp; &nbsp;
														&nbsp; &nbsp; &nbsp;
														<button class="btn btn-info" type="button">
															<i class="ace-icon fa fa-check bigger-110"></i> 确定
														</button>
															&nbsp; &nbsp; &nbsp;
														<button class="btn" type="reset">
															<i class="ace-icon fa fa-undo bigger-110"></i> 重置
														</button>
															&nbsp; &nbsp; &nbsp;
														
													</div>
												</div>
								<!-- /.page-content -->
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