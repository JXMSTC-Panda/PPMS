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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap-duallistbox.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap-multiselect.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/select2.css" />

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
						<li><i class="ace-icon fa fa-home home-icon"></i><a href="#">Home</a>
						</li>
						<li><a href="#">Other Pages</a>
						</li>
						<li class="active">Blank Page</li>
					</ul>
					<jsp:include page="../../WebPart/SearchBox.jsp"></jsp:include>
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->

							<div class="page-header center">
								<h1>月度绩效上传功能开通</h1>
							</div>
							<form role="form" method="post"
								action="performance.month.monthPerformanceOpen.add.do">
							<div class="widget-box">
								<div class="widget-header center">
									<h4 class="widget-title">选择营业厅</h4>
								</div>

								<div class="widget-body">
									<div class="widget-main">
										<div class="row">
											<div class="form-group">
												<div class="col-xs-3"></div>
												<div class="col-xs-6">
													<!-- #section:plugins/input.duallist -->
													<select multiple="multiple" size="10" name="organizationNjs"
														id="duallist">

														<c:forEach items="${ requestScope.orgs}" var="org">
															<option value="${org.orgid}">
																<c:out value="${org.org_Name }"></c:out>
															</option>
														</c:forEach>
													</select>

													<!-- /section:plugins/input.duallist -->
													<div class="hr hr-16 hr-dotted"></div>
													<div class="clearfix form-actions">
														<label>开通月份:</label> <input disabled="disabled" value="${requestScope.month}" name="month" />
													</div>
												</div>
												<div class="col-xs-3"></div>
											</div>
										</div>

										<div class="clearfix form-actions">
											<div class="col-md-offset-5 col-md-6">
												<button class="btn btn-info" type="submit"  >
													<i class="ace-icon fa fa-check bigger-110"></i> 开通
												</button>

												&nbsp; &nbsp; &nbsp;
												<button class="btn" type="reset">
													<i class="ace-icon fa fa-undo bigger-110"></i> 重置
												</button>
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
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.bootstrap-duallistbox.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.raty.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/bootstrap-multiselect.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/select2.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/typeahead.jquery.js"></script>

	<!-- inline scripts related to this page -->

	<script type="text/javascript">
		jQuery(function($) {
			var demo1 = $('select[name="organizationNjs"]')
					.bootstrapDualListbox(
							{
								infoTextFiltered : '<span class="label label-purple label-lg">Filtered123</span>'
							});
			var container1 = demo1.bootstrapDualListbox('getContainer');
			container1.find('.btn').addClass('btn-white btn-info btn-bold');
       		
			/**var setRatingColors = function() {
				$(this).find('.star-on-png,.star-half-png').addClass('orange2').removeClass('grey');
				$(this).find('.star-off-png').removeClass('orange2').addClass('grey');
			}*/
			$('.rating').raty({
				'cancel' : true,
				'half' : true,
				'starType' : 'i'
			/**,
			
			'click': function() {
				setRatingColors.call(this);
			},
			'mouseover': function() {
				setRatingColors.call(this);
			},
			'mouseout': function() {
				setRatingColors.call(this);
			}*/
			})//.find('i:not(.star-raty)').addClass('grey');

			$('.multiselect')
					.multiselect(
							{
								enableFiltering : true,
								buttonClass : 'btn btn-white btn-primary',
								templates : {
									button : '<button type="button" class="multiselect dropdown-toggle" data-toggle="dropdown"></button>',
									ul : '<ul class="multiselect-container dropdown-menu"></ul>',
									filter : '<li class="multiselect-item filter"><div class="input-group"><span class="input-group-addon"><i class="fa fa-search"></i></span><input class="form-control multiselect-search" type="text"></div></li>',
									filterClearBtn : '<span class="input-group-btn"><button class="btn btn-default btn-white btn-grey multiselect-clear-filter" type="button"><i class="fa fa-times-circle red2"></i></button></span>',
									li : '<li><a href="javascript:void(0);"><label></label></a></li>',
									divider : '<li class="multiselect-item divider"></li>',
									liGroup : '<li class="multiselect-item group"><label class="multiselect-group"></label></li>'
								}
							});

			///////////////////

		});
	
	</script>
	
	<!-- 获取select的选项 -->
	<script type="text/javascript">
	function t(){
	
	var select = document.getElementById("duallist");
	//获取select标签
   var index = select.selectedIndex;
   var text = select.options[index].text;
   var value = select.options[index].value;
	//提交form表单
   //document.formkk.submit();
	}
	
	
	
	</script>
	
	
</body>
</html>