<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>Blank Page - Ace Admin</title>

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
	href="${pageContext.request.contextPath}/assets/css/jquery-ui.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/datepicker.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/ui.jqgrid.css" />
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
	<!-- #section:basics/navbar.layout -->
	<div id="navbar" class="navbar navbar-default">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>
		<div class="navbar-container" id="navbar-container">
			<!-- #section:basics/sidebar.mobile.toggle -->
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<!-- /section:basics/sidebar.mobile.toggle -->
			<div class="navbar-header pull-left">
				<!-- #section:basics/navbar.layout.brand -->
				<a href="#" class="navbar-brand"> <small> <i
						class="fa fa-leaf"></i> Ace Admin </small> </a>

				<!-- /section:basics/navbar.layout.brand -->

				<!-- #section:basics/navbar.toggle -->

				<!-- /section:basics/navbar.toggle -->
			</div>

			<!-- #section:basics/navbar.dropdown -->
			<div class="navbar-buttons navbar-header pull-right"
				role="navigation">
				<ul class="nav ace-nav">
					<li class="grey"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <i
							class="ace-icon fa fa-tasks"></i> <span class="badge badge-grey">4</span>
					</a>

						<ul
							class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
							<li class="dropdown-header"><i class="ace-icon fa fa-check"></i>
								4 Tasks to complete</li>

							<li class="dropdown-content">
								<ul class="dropdown-menu dropdown-navbar">
									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left">Software Update</span> <span
													class="pull-right">65%</span>
											</div>

											<div class="progress progress-mini">
												<div style="width:65%" class="progress-bar"></div>
											</div> </a></li>

									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left">Hardware Upgrade</span> <span
													class="pull-right">35%</span>
											</div>

											<div class="progress progress-mini">
												<div style="width:35%"
													class="progress-bar progress-bar-danger"></div>
											</div> </a></li>

									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left">Unit Testing</span> <span
													class="pull-right">15%</span>
											</div>

											<div class="progress progress-mini">
												<div style="width:15%"
													class="progress-bar progress-bar-warning"></div>
											</div> </a></li>

									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left">Bug Fixes</span> <span
													class="pull-right">90%</span>
											</div>

											<div class="progress progress-mini progress-striped active">
												<div style="width:90%"
													class="progress-bar progress-bar-success"></div>
											</div> </a></li>
								</ul></li>

							<li class="dropdown-footer"><a href="#"> See tasks with
									details <i class="ace-icon fa fa-arrow-right"></i> </a></li>
						</ul></li>

					<li class="purple"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <i
							class="ace-icon fa fa-bell icon-animated-bell"></i> <span
							class="badge badge-important">8</span> </a>

						<ul
							class="dropdown-menu-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
							<li class="dropdown-header"><i
								class="ace-icon fa fa-exclamation-triangle"></i> 8 Notifications
							</li>

							<li class="dropdown-content">
								<ul class="dropdown-menu dropdown-navbar navbar-pink">
									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left"> <i
													class="btn btn-xs no-hover btn-pink fa fa-comment"></i> New
													Comments </span> <span class="pull-right badge badge-info">+12</span>
											</div> </a></li>

									<li><a href="#"> <i
											class="btn btn-xs btn-primary fa fa-user"></i> Bob just
											signed up as an editor ... </a></li>

									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left"> <i
													class="btn btn-xs no-hover btn-success fa fa-shopping-cart"></i>
													New Orders </span> <span class="pull-right badge badge-success">+8</span>
											</div> </a></li>

									<li><a href="#">
											<div class="clearfix">
												<span class="pull-left"> <i
													class="btn btn-xs no-hover btn-info fa fa-twitter"></i>
													Followers </span> <span class="pull-right badge badge-info">+11</span>
											</div> </a></li>
								</ul></li>

							<li class="dropdown-footer"><a href="#"> See all
									notifications <i class="ace-icon fa fa-arrow-right"></i> </a></li>
						</ul></li>

					<li class="green"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <i
							class="ace-icon fa fa-envelope icon-animated-vertical"></i> <span
							class="badge badge-success">5</span> </a>

						<ul
							class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
							<li class="dropdown-header"><i
								class="ace-icon fa fa-envelope-o"></i> 5 Messages</li>

							<li class="dropdown-content">
								<ul class="dropdown-menu dropdown-navbar">
									<li><a href="#" class="clearfix"> <img
											src="${pageContext.request.contextPath}/assets/avatars/avatar.png"
											class="msg-photo" alt="Alex's Avatar" /> <span
											class="msg-body"> <span class="msg-title"> <span
													class="blue">Alex:</span> Ciao sociis natoque penatibus et
													auctor ... </span> <span class="msg-time"> <i
													class="ace-icon fa fa-clock-o"></i> <span>a moment
														ago</span> </span> </span> </a></li>

									<li><a href="#" class="clearfix"> <img
											src="${pageContext.request.contextPath}/assets/avatars/avatar3.png"
											class="msg-photo" alt="Susan's Avatar" /> <span
											class="msg-body"> <span class="msg-title"> <span
													class="blue">Susan:</span> Vestibulum id ligula porta felis
													euismod ... </span> <span class="msg-time"> <i
													class="ace-icon fa fa-clock-o"></i> <span>20 minutes
														ago</span> </span> </span> </a></li>

									<li><a href="#" class="clearfix"> <img
											src="${pageContext.request.contextPath}/assets/avatars/avatar4.png"
											class="msg-photo" alt="Bob's Avatar" /> <span
											class="msg-body"> <span class="msg-title"> <span
													class="blue">Bob:</span> Nullam quis risus eget urna mollis
													ornare ... </span> <span class="msg-time"> <i
													class="ace-icon fa fa-clock-o"></i> <span>3:15 pm</span> </span> </span>
									</a></li>

									<li><a href="#" class="clearfix"> <img
											src="${pageContext.request.contextPath}/assets/avatars/avatar2.png"
											class="msg-photo" alt="Kate's Avatar" /> <span
											class="msg-body"> <span class="msg-title"> <span
													class="blue">Kate:</span> Ciao sociis natoque eget urna
													mollis ornare ... </span> <span class="msg-time"> <i
													class="ace-icon fa fa-clock-o"></i> <span>1:33 pm</span> </span> </span>
									</a></li>

									<li><a href="#" class="clearfix"> <img
											src="${pageContext.request.contextPath}/assets/avatars/avatar5.png"
											class="msg-photo" alt="Fred's Avatar" /> <span
											class="msg-body"> <span class="msg-title"> <span
													class="blue">Fred:</span> Vestibulum id penatibus et auctor
													... </span> <span class="msg-time"> <i
													class="ace-icon fa fa-clock-o"></i> <span>10:09 am</span> </span>
										</span> </a></li>
								</ul></li>

							<li class="dropdown-footer"><a href="inbox.html"> See
									all messages <i class="ace-icon fa fa-arrow-right"></i> </a></li>
						</ul></li>

					<!-- #section:basics/navbar.user_menu -->
					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="${pageContext.request.contextPath}/assets/avatars/user.jpg"
							alt="Jason's Photo" /> <span class="user-info"> <small>Welcome,</small>
								Jason </span> <i class="ace-icon fa fa-caret-down"></i> </a>

						<ul
							class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="#"> <i class="ace-icon fa fa-cog"></i>
									Settings </a></li>

							<li><a href="profile.html"> <i
									class="ace-icon fa fa-user"></i> Profile </a></li>

							<li class="divider"></li>

							<li><a href="#"> <i class="ace-icon fa fa-power-off"></i>
									Logout </a></li>
						</ul></li>

					<!-- /section:basics/navbar.user_menu -->
				</ul>
			</div>

			<!-- /section:basics/navbar.dropdown -->
		</div>
		<!-- /.navbar-container -->
	</div>

	<!-- /section:basics/navbar.layout -->
	<jsp:include page="../../WebPart/Menu.jsp"></jsp:include>
	<!-- /section:basics/sidebar -->
	<div class="main-content">
		<div class="main-content-inner">
			<!-- #section:basics/content.breadcrumbs -->
			<div class="breadcrumbs" id="breadcrumbs">
				<script type="text/javascript">
					try {
						ace.settings.check('breadcrumbs', 'fixed')
					} catch (e) {
					}
				</script>

				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
					</li>

					<li><a href="#">Other Pages</a></li>
					<li class="active">Blank Page</li>
				</ul>
				<!-- /.breadcrumb -->

				<!-- #section:basics/content.searchbox -->
				<div class="nav-search" id="nav-search">
					<form class="form-search">
						<span class="input-icon"> <input type="text"
							placeholder="Search ..." class="nav-search-input"
							id="nav-search-input" autocomplete="off" /> <i
							class="ace-icon fa fa-search nav-search-icon"></i> </span>
					</form>
				</div>
				<!-- /.nav-search -->

				<!-- /section:basics/content.searchbox -->
			</div>

			<!-- /section:basics/content.breadcrumbs -->
			<div class="page-header">
				<h1>
					创新提案管理 <small> <i
						class="ace-icon fa fa-angle-double-right"></i> 创新提案查询 </small>
				</h1>
			</div>

			<div class="clearfix">
				<div class="pull-right tableTools-container"></div>
			</div>
			<div class="table-header">已有角色表</div>
			<form action="" name="StuListForm">
				<table id="dynamic-table"
					class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th class="center"><label class="pos-rel"> <input
									type="checkbox" class="ace" /> <span class="lbl"></span> </label></th>
							<th>序号</th>
							<th>工号</th>
							<th>姓名</th>
							<th>身份证号</th>
							<th>营业厅编码</th>
							<th>营业厅名称</th>
							<th>创新方案</th>
							<th>创新类型</th>
							<th>评定时间</th>
							<th>部门核定结果</th>
							<th>层级</th>
							<th>奖励方式</th>
							<th>加分标准</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach items="${requestScope.innovations}" var="innovation"
							varStatus="status">
							<tr>
								<td class="center"><label class="pos-rel"> <input
										type="checkbox" class="ace" /> <span class="lbl"></span> </label>
								</td>

								<td><c:out value="${innovation.tbEmployee.employeecode}"></c:out></td>
								<td>${employee.idnumber}</td>
								<td>${employee.employeename}</td>
								<td><c:if test="${employee.sex==true}">
										<c:out value="男"></c:out>
									</c:if> <c:if test="${employee.sex==false}">
										<c:out value="女"></c:out>
									</c:if></td>
								<td>${employee.birthday}</td>
								<td>
									<div class="hidden-sm hidden-xs action-buttons">
										<a class="blue" href="javascript:void(0)" name=""
											onclick="GetDetail(this)"> <i
											class="fa fa-search-plus bigger-130">详细</i> </a> <a class="green"
											href="javascript:void(0)" name="" onclick="Modify(this)">
											<i class="fa fa-pencil bigger-130">修改</i> </a> <a class="red"
											href="ClassDelete?classId="> <i
											class="fa fa-trash bigger-130">删除</i> </a>
									</div>
									<div class="hidden-md hidden-lg">
										<div class="inline pos-rel">
											<button class="btn btn-minier btn-yellow dropdown-toggle"
												data-toggle="dropdown" data-position="auto">
												<i class="ace-icon fa fa-caret-down icon-only bigger-120"></i>
											</button>

											<ul
												class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
												<li><a href="javascript:void(0)" name=""
													onclick="GetDetail(this)" class="tooltip-info"
													data-rel="tooltip" title="View"> <span class="blue">
															<i class="ace-icon fa fa-search-plus bigger-120"></i> </span> </a></li>

												<li><a href="javascript:void(0)" name=""
													onclick="Modify(this)" class="tooltip-success"
													data-rel="tooltip" title="Edit"> <span class="green">
															<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
													</span> </a>
												</li>

												<li><a href="ClassDelete?classId="
													class="tooltip-error" data-rel="tooltip" title="Delete">
														<span class="red"> <i
															class="ace-icon fa fa-trash-o bigger-120"></i> </span> </a>
												</li>
											</ul>
										</div>
									</div></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
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
	<script src="../assets/js/dataTables/jquery.dataTables.js"></script>
	<script src="../assets/js/dataTables/jquery.dataTables.bootstrap.js"></script>
	<script
		src="../assets/js/dataTables/extensions/TableTools/js/dataTables.tableTools.js"></script>
	<script
		src="../assets/js/dataTables/extensions/ColVis/js/dataTables.colVis.js"></script>
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
		jQuery(function($) {
			//initiate dataTables plugin
			var oTable1 = $('#dynamic-table')
			//.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
			.dataTable({
				bAutoWidth : false,
				"aoColumns" : [ {
					"bSortable" : false
				}, null, null, null, null, null, {
					"bSortable" : false
				} ],
				"aaSorting" : [],

			//,
			//"sScrollY": "200px",
			//"bPaginate": false,

			//"sScrollX": "100%",
			//"sScrollXInner": "120%",
			//"bScrollCollapse": true,
			//Note: if you are applying horizontal scrolling (sScrollX) on a ".table-bordered"
			//you may want to wrap the table inside a "div.dataTables_borderWrap" element

			//"iDisplayLength": 50
			});
			//oTable1.fnAdjustColumnSizing();

			//TableTools settings
			TableTools.classes.container = "btn-group btn-overlap";
			TableTools.classes.print = {
				"body" : "DTTT_Print",
				"info" : "tableTools-alert gritter-item-wrapper gritter-info gritter-center white",
				"message" : "tableTools-print-navbar"
			}

			//initiate TableTools extension
			var tableTools_obj = new $.fn.dataTable.TableTools(
					oTable1,
					{
						"sSwfPath" : "../assets/js/dataTables/extensions/TableTools/swf/copy_csv_xls_pdf.swf", //in Ace demo ../assets will be replaced by correct assets path

						"sRowSelector" : "td:not(:last-child)",
						"sRowSelect" : "multi",
						"fnRowSelected" : function(row) {
							//check checkbox when row is selected
							try {
								$(row).find('input[type=checkbox]').get(0).checked = true
							} catch (e) {
							}
						},
						"fnRowDeselected" : function(row) {
							//uncheck checkbox
							try {
								$(row).find('input[type=checkbox]').get(0).checked = false
							} catch (e) {
							}
						},

						"sSelectedClass" : "success",
						"aButtons" : [
								{
									"sExtends" : "copy",
									"sToolTip" : "Copy to clipboard",
									"sButtonClass" : "btn btn-white btn-primary btn-bold",
									"sButtonText" : "<i class='fa fa-copy bigger-110 pink'></i>",
									"fnComplete" : function() {
										this
												.fnInfo(
														'<h3 class="no-margin-top smaller">Table copied</h3>\
									<p>Copied '
																+ (oTable1
																		.fnSettings()
																		.fnRecordsTotal())
																+ ' row(s) to the clipboard.</p>',
														1500);
									}
								},

								{
									"sExtends" : "csv",
									"sToolTip" : "Export to CSV",
									"sButtonClass" : "btn btn-white btn-primary  btn-bold",
									"sButtonText" : "<i class='fa fa-file-excel-o bigger-110 green'></i>"
								},

								{
									"sExtends" : "pdf",
									"sToolTip" : "Export to PDF",
									"sButtonClass" : "btn btn-white btn-primary  btn-bold",
									"sButtonText" : "<i class='fa fa-file-pdf-o bigger-110 red'></i>"
								},

								{
									"sExtends" : "print",
									"sToolTip" : "Print view",
									"sButtonClass" : "btn btn-white btn-primary  btn-bold",
									"sButtonText" : "<i class='fa fa-print bigger-110 grey'></i>",

									"sMessage" : "<div class='navbar navbar-default'><div class='navbar-header pull-left'><a class='navbar-brand' href='#'><small>Optional Navbar &amp; Text</small></a></div></div>",

									"sInfo" : "<h3 class='no-margin-top'>Print view</h3>\
									  <p>Please use your browser's print function to\
									  print this table.\
									  <br />Press <b>escape</b> when finished.</p>",
								} ]
					});
			//we put a container before our table and append TableTools element to it
			$(tableTools_obj.fnContainer())
					.appendTo($('.tableTools-container'));

			//also add tooltips to table tools buttons
			//addding tooltips directly to "A" buttons results in buttons disappearing (weired! don't know why!)
			//so we add tooltips to the "DIV" child after it becomes inserted
			//flash objects inside table tools buttons are inserted with some delay (100ms) (for some reason)
			setTimeout(function() {
				$(tableTools_obj.fnContainer()).find('a.DTTT_button').each(
						function() {
							var div = $(this).find('> div');
							if (div.length > 0)
								div.tooltip({
									container : 'body'
								});
							else
								$(this).tooltip({
									container : 'body'
								});
						});
			}, 200);

			//ColVis extension
			var colvis = new $.fn.dataTable.ColVis(oTable1, {
				"buttonText" : "<i class='fa fa-search'></i>",
				"aiExclude" : [ 0, 6 ],
				"bShowAll" : true,
				//"bRestore": true,
				"sAlign" : "right",
				"fnLabel" : function(i, title, th) {
					return $(th).text();//remove icons, etc
				}

			});

			//style it
			$(colvis.button()).addClass('btn-group').find('button').addClass(
					'btn btn-white btn-info btn-bold')

			//and append it to our table tools btn-group, also add tooltip
			$(colvis.button()).prependTo('.tableTools-container .btn-group')
					.attr('title', 'Show/hide columns').tooltip({
						container : 'body'
					});

			//and make the list, buttons and checkboxed Ace-like
			$(colvis.dom.collection)
					.addClass(
							'dropdown-menu dropdown-light dropdown-caret dropdown-caret-right')
					.find('li').wrapInner('<a href="javascript:void(0)" />') //'A' tag is required for better styling
					.find('input[type=checkbox]').addClass('ace').next()
					.addClass('lbl padding-8');

			/////////////////////////////////
			//table checkboxes
			$('th input[type=checkbox], td input[type=checkbox]').prop(
					'checked', false);

			//select/deselect all rows according to table header checkbox
			$('#dynamic-table > thead > tr > th input[type=checkbox]').eq(0)
					.on(
							'click',
							function() {
								var th_checked = this.checked;//checkbox inside "TH" table header

								$(this).closest('table').find('tbody > tr')
										.each(function() {
											var row = this;
											if (th_checked)
												tableTools_obj.fnSelect(row);
											else
												tableTools_obj.fnDeselect(row);
										});
							});

			//select/deselect a row when the checkbox is checked/unchecked
			$('#dynamic-table').on(
					'click',
					'td input[type=checkbox]',
					function() {
						var row = $(this).closest('tr').get(0);
						if (!this.checked)
							tableTools_obj.fnSelect(row);
						else
							tableTools_obj.fnDeselect($(this).closest('tr')
									.get(0));
					});

			$(document).on('click', '#dynamic-table .dropdown-toggle',
					function(e) {
						e.stopImmediatePropagation();
						e.stopPropagation();
						e.preventDefault();
					});

			//And for the first simple table, which doesn't have TableTools or dataTables
			//select/deselect all rows according to table header checkbox
			var active_class = 'active';
			$('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on(
					'click',
					function() {
						var th_checked = this.checked;//checkbox inside "TH" table header

						$(this).closest('table').find('tbody > tr').each(
								function() {
									var row = this;
									if (th_checked)
										$(row).addClass(active_class).find(
												'input[type=checkbox]').eq(0)
												.prop('checked', true);
									else
										$(row).removeClass(active_class).find(
												'input[type=checkbox]').eq(0)
												.prop('checked', false);
								});
					});

			//select/deselect a row when the checkbox is checked/unchecked
			$('#simple-table').on('click', 'td input[type=checkbox]',
					function() {
						var $row = $(this).closest('tr');
						if (this.checked)
							$row.addClass(active_class);
						else
							$row.removeClass(active_class);
					});

			/********************************/
			//add tooltip for small view action buttons in dropdown menu
			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});

			//tooltip placement on right or left
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				//var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}

		})
	</script>
</body>
</html>
