<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<jsp:include page="../../WebPart/Head.jsp"></jsp:include>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>
		
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
						<li><a href="#">员工奖惩信息管理</a>
						</li>
					<li ><a href="#">员工奖惩信息单条路修改</a></li>
					<li class="active">选择员工</li>
					</ul>
					
				</div>
				<div class="page-content">
					<jsp:include page="../../WebPart/Skin.jsp"></jsp:include>
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<h3 class="header smaller lighter blue">有效员工信息</h3>

							<div class="clearfix">
								<div class="pull-right tableTools-container"></div>
							</div>
							<div class="table-header">信息查询</div>
							<form  name="StuListForm" action="praiseCriticism.employee.employeePraiseCriticismSearch.modify.selectEmployeeSkipUpdate.do?tbEmployeepraisecriticism.praisecriticismid=${requestScope.praisecriticismid}" method="post" >
								<table id="dynamic-table"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											
											
											<th></th>
											<th>工号</th>
											<th>姓名</th>
											<th>身份证号</th>
											<th>区域</th>
											<th>营业厅编码</th>
											<th>营业厅名称</th>
											<th>性别</th>
											<th>出生年月</th>
											<th>岗职</th>
											<th>岗位</th>
											
										</tr>
									</thead>

									<tbody>
										<c:forEach items="${requestScope.employeeInfos}"
											var="employeeInfo">
											<tr>
												<td><input type="radio" name="selectEmployee"
													value="${employeeInfo.employeeid}" checked></td>
												
												<td>${employeeInfo.employeecode}</td>
												<td>${employeeInfo.employeename}
												</td>
												<%-- <td>${employeeInfo.idnumber}</td> --%>
												
												<td>
													<a name="idnumber" href="javascript:void(0);"
														data-container="body" data-toggle="popover"
														data-placement="bottom" data-content="${employeeInfo.idnumber}">
													</a>

												</td>
												<td>${employeeInfo.organizationNj.areadesc}</td>
												<td>${employeeInfo.organizationNj.orgid}</td>
												<td>${employeeInfo.organizationNj.org_Name}</td>
												<td><c:if test="${employeeInfo.sex==true}">
														<c:out value="女"></c:out>
													</c:if> <c:if test="${employeeInfo.sex==false}">
														<c:out value="男"></c:out>
													</c:if>
												</td>
												
												<%-- <td>${fn:split(fn:split(employeeInfo.birthday,' ')[0],'-')[0]}-${fn:split(fn:split(employeeInfo.birthday,' ')[0],'-')[1]}</td> --%>
												<td>
													<a name="birthday" href="javascript:void(0);"
														data-container="body" data-toggle="popover"
														data-placement="bottom" data-content="${employeeInfo.birthday}">
													</a>

												</td>
												<td>${employeeInfo.tbPost.postname}</td>
												<td>${employeeInfo.tbJob.jobname}</td>


												
											</tr>
										</c:forEach>
										<table cellpadding="0" cellspacing="0" width="95%"
											align="center">
											<tr>
												<div class="clearfix form-actions">
												<div class="col-md-offset-3 col-md-9" style="padding-left:20%">
													<button class="btn btn-info" type="submit" >
														<i class="ace-icon fa fa-check bigger-110"></i> 确定
													</button>
												</div>
											</tr>
										</table>
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
	<script
		src="${pageContext.request.contextPath}/assets/js/dataTables/jquery.dataTables.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/dataTables/jquery.dataTables.bootstrap.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/dataTables/extensions/TableTools/js/dataTables.tableTools.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/dataTables/extensions/ColVis/js/dataTables.colVis.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
	
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
	$(document).ready(function() {
			$('[data-toggle="popover"]').popover();
			myEachPopover("birthday",0, 7);
			myEachPopover("idnumber",0, 8);
			
		});
	
	
		jQuery(function($) {
			//initiate dataTables plugin
			var oTable1 = $('#dynamic-table')
			//.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
			.dataTable(
					{
						bAutoWidth : false,
						"aoColumns" : [ {
							"bSortable" : false
						}, null, null, null, null, null, null, null, null,
								null, {
									"bSortable" : true
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
						"sSwfPath" : "${pageContext.request.contextPath}/assets/js/dataTables/extensions/TableTools/swf/copy_csv_xls_pdf.swf", //in Ace demo ../assets will be replaced by correct assets path

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
<!-- http://localhost:8080/QQL1133Attend/index.jsp -->