<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
							<div class="page-header">
								<h1>
									店长测评、进阶查询 <small> <i
										class="ace-icon fa fa-angle-double-right"></i> 店长进阶查询 </small>
								</h1>
							</div>
							
							<div class="row">
									<div class="col-xs-12">
										

										<div class="clearfix">
											<div class="pull-right tableTools-container"></div>
										</div>
										<div class="table-header">
											详细信息
										</div>

										<!-- div.table-responsive -->

										<!-- div.dataTables_borderWrap -->
										<div>
											<table id="dynamic-table" class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th rowspan="2">
															序号
														</th>
														<th rowspan="2">工号</th>
														<th rowspan="2">姓名</th>
														<th rowspan="2">区域</th>

														<th rowspan="2">
															营业厅名称
														</th>
														<th rowspan="2">岗职</th>

														<th rowspan="2">学历</th>
														
														<th rowspan="1" colspan="2">
															技能鉴定水平
														</th>
														<th rowspan="2">上一年绩效(分)</th>
														
														<th rowspan="2">进阶店长考试成绩(分)</th>
														<th rowspan="2">专项报告成绩(分)</th>
														<th rowspan="1" colspan="2">暗访成绩(分)</th>
														
														<th rowspan="2">暗访成绩均分(分)</th>
														<th rowspan="2">业务考试成绩(分)</th>
													</tr>
													<tr>
														
														
														<th>电信业务营销员</th>
														<th>移动营业</th>
														
														<th>第一次暗访</th>
														<th>第二次暗访</th>
														
														
														
														
													</tr>
												</thead>

												<tbody>
												<% int i = 0; %>
												<c:forEach items="${ requestScope.datas}" var="test">
														<tr>
															<td><%= ++i %></td>
														
															<td>${test.employeecode }</td>
															<td>${test.employeename }</td>
															<td>${test.areadesc }</td>
															<td>${test.org_Name }</td>
															<td>${test.postname }</td>
															
															<td>${test.academicdegree }</td>
															<td>${test.strtelecomlevel }</td>
															<td>${test.strmobilelevel }</td>
															<td>${test.performancescore }</td>
															<td>${test.promotionscore }</td>
															
															<td><input type="text" style="width: 40px"> </td>
															
															<td>${test.firstscore }</td>
															<td>${test.secondscore }</td>
															<td>${test.aver }</td>
															<td><input type="text" style="width: 40px"></td>
															
															
															
														</tr>
													</c:forEach>
												<%-- <c:forEach items="${ requestScope.tbPromotiontraining }"
												var="tpt">
													<tr>
														<td><%= ++i %></td>
														<c:forEach items="${ requestScope.tbEmployee }"
														var="te">
															<c:choose>
																<c:when test="${te.employeecode!=null }">
																	<td>${te.employeecode }</td>
																</c:when>
																<c:otherwise>
																	<td>无数据</td>
																</c:otherwise>
															</c:choose>
														
															<c:choose>
																<c:when test="${te.employeename!=null }">
																	<td>${te.employeename }</td>
																</c:when>
																<c:otherwise>
																	<td>无数据</td>
																</c:otherwise>
															</c:choose>
														
															<c:forEach items="${requestScope.tbArea }" var="ta">
																<td>${ta.areadesc }</td>
															</c:forEach>
															
															
															<c:forEach items="${requestScope.organizationNj }" var="on">
																<td>${on.org_Name }</td>
															</c:forEach>
															
															<c:forEach items="${requestScope.tbPost }" var="tp">
																<td>${tp.postname }</td>
															</c:forEach>
															
															<c:choose>
																<c:when test="${te.academicdegree!=null }">
																	<td>${te.academicdegree }</td>
																</c:when>
																<c:otherwise>
																	<td>无数据</td>
																</c:otherwise>
															</c:choose>
															
															<c:choose>
																<c:when test="${te.telecomlevel!=null }">
																	<c:if test="${te.telecomlevel==-1 }">
																		<td>初级</td>
																	</c:if>
																	<c:if test="${te.telecomlevel==0 }">
																		<td>初级</td>
																	</c:if>
																	<c:if test="${te.telecomlevel==1 }">
																		<td>中级</td>
																	</c:if>
																	<c:if test="${te.telecomlevel==2 }">
																		<td>高级</td>
																	</c:if>
																</c:when>
																<c:otherwise>
																	<td>无数据</td>
																</c:otherwise>
															</c:choose>
															
															<c:choose>
																<c:when test="${te.mobilelevel!=null }">
																	<c:if test="${te.mobilelevel==-1 }">
																		<td>初级</td>
																	</c:if>
																	<c:if test="${te.mobilelevel==0 }">
																		<td>初级</td>
																	</c:if>
																	<c:if test="${te.mobilelevel==1 }">
																		<td>中级</td>
																	</c:if>
																	<c:if test="${te.mobilelevel==2 }">
																		<td>高级</td>
																	</c:if>
																</c:when>
																<c:otherwise>
																	<td>无数据</td>
																</c:otherwise>
															</c:choose>
															
															
														</c:forEach>
														<td>${tpf.performancescore }</td>
														
														<td>${tpt.promotionscore }</td>
														<td><input type="text" style="width: 40px"></td>
														<td>${tbVisitcheck.firstscore }</td>
														<td>${tbVisitcheck.secondscore }</td>
														<td>${(tbVisitcheck.firstscore+tbVisitcheck.secondscore)/2 }</td>
														
														<td><input type="text" style="width: 40px"></td>
													</tr>
												</c:forEach>
													<tr>
														<td>1</td>
														<td>2</td>
														<td>3</td>
														<td>4</td>
														<td>5</td>
														
														<td>6</td>
														<td>7</td>
														<td>8</td>
														<td>9</td>
														<td>10</td>
														
														<td>11</td>
														<td>12</td>
														<td>13</td>
														<td>14</td>
														
														<td>15</td>
														<td>16</td>
														
													</tr> --%>
												
													<%-- <% int i = 0; %>
													<c:forEach items="${ requestScope.tbMountguardexam }"
														var="tmge" varStatus="status">
														<tr>
															<td class="center">
																<label class="pos-rel">
																	<input type="checkbox" class="ace" />
																	<span class="lbl"></span>
																</label>
															</td>
															<td><%= ++i %></td>
															<td>111</td>
															<c:forEach items="${ requestScope.tbEmployeeByTbEmployeeId }"
																var="employee">
																<td>${employee.employeecode}</td>
																<td>${employee.employeename}</td>
																<td>${employee.idnumber}</td>
															</c:forEach>
															<c:forEach items="${ requestScope.organizationNjByOrgId }"
																var="org">
																<td>${org.orgid}</td>
																<td>${org.org_Name}</td>
															</c:forEach>
															<td>${tmge.examtype}</td>
															<td>${tmge.examdate}</td>
															<td>${tmge.examexpire }</td>
															<td>${tmge.examscore}</td>
															
															<td>
																<c:if test="${tmge.examscore>=60}">
																	<span class="label label-sm label-success">PASS</span>
																</c:if>
																<c:if test="${tmge.examscore<60}">
																	<span class="label label-sm label-warning">NOT PASS</span>
																</c:if>
															</td>
															<td>
																<div class="hidden-sm hidden-xs action-buttons">
																	<a class="green" href="#">
																		<i class="ace-icon fa fa-pencil bigger-130">修改</i>
																	</a>

																	<a class="red" href="#">
																		<i class="ace-icon fa fa-trash-o bigger-130">删除</i>
																	</a>
																</div>

																<div class="hidden-md hidden-lg">
																	<div class="inline pos-rel">
																		<button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown" data-position="auto">
																			<i class="ace-icon fa fa-caret-down icon-only bigger-120"></i>
																		</button>

																		<ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
																			<li>
																				<a href="#" class="tooltip-info" data-rel="tooltip" title="View">
																					<span class="blue">
																						<i class="ace-icon fa fa-search-plus bigger-120"></i>
																					</span>
																				</a>
																			</li>
	
																			<li>
																				<a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
																					<span class="green">
																						<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
																					</span>
																				</a>
																			</li>

																			<li>
																				<a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
																					<span class="red">
																						<i class="ace-icon fa fa-trash-o bigger-120"></i>
																					</span>
																				</a>
																			</li>
																		</ul>
																	</div>
																</div>
															</td>
														</tr>
													</c:forEach>  --%>
													
													
													
										
												</tbody>
											</table>
										</div>
									</div>
								</div>
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
		<script src="${pageContext.request.contextPath}/assets/js/dataTables/jquery.dataTables.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/dataTables/jquery.dataTables.bootstrap.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/dataTables/extensions/TableTools/js/dataTables.tableTools.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/dataTables/extensions/ColVis/js/dataTables.colVis.js"></script>
	
	
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
			jQuery(function($) {
				//initiate dataTables plugin
				var oTable1 = 
				$('#dynamic-table')
				//.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
				.dataTable( {
					bAutoWidth: false,
					"aoColumns": [
					  null,
					  null, null,null, null, null,null, null,null, null,null, null,null,null, null,
					  null
					],
					"aaSorting": [],
			
					//,
					//"sScrollY": "200px",
					//"bPaginate": false,
			
					//"sScrollX": "100%",
					//"sScrollXInner": "120%",
					//"bScrollCollapse": true,
					//Note: if you are applying horizontal scrolling (sScrollX) on a ".table-bordered"
					//you may want to wrap the table inside a "div.dataTables_borderWrap" element
			
					//"iDisplayLength": 50
			    } );
				//oTable1.fnAdjustColumnSizing();
			
			
				//TableTools settings
				TableTools.classes.container = "btn-group btn-overlap";
				TableTools.classes.print = {
					"body": "DTTT_Print",
					"info": "tableTools-alert gritter-item-wrapper gritter-info gritter-center white",
					"message": "tableTools-print-navbar"
				}
			
				//initiate TableTools extension
				var tableTools_obj = new $.fn.dataTable.TableTools( oTable1, {
					"sSwfPath": "../assets/js/dataTables/extensions/TableTools/swf/copy_csv_xls_pdf.swf", //in Ace demo ../assets will be replaced by correct assets path
					
					"sRowSelector": "td:not(:last-child)",
					"sRowSelect": "multi",
					"fnRowSelected": function(row) {
						//check checkbox when row is selected
						try { $(row).find('input[type=checkbox]').get(0).checked = true }
						catch(e) {}
					},
					"fnRowDeselected": function(row) {
						//uncheck checkbox
						try { $(row).find('input[type=checkbox]').get(0).checked = false }
						catch(e) {}
					},
			
					"sSelectedClass": "success",
			        "aButtons": [
						{
							"sExtends": "copy",
							"sToolTip": "Copy to clipboard",
							"sButtonClass": "btn btn-white btn-primary btn-bold",
							"sButtonText": "<i class='fa fa-copy bigger-110 pink'></i>",
							"fnComplete": function() {
								this.fnInfo( '<h3 class="no-margin-top smaller">Table copied</h3>\
									<p>Copied '+(oTable1.fnSettings().fnRecordsTotal())+' row(s) to the clipboard.</p>',
									1500
								);
							}
						},
						
						{
							"sExtends": "csv",
							"sToolTip": "Export to CSV",
							"sButtonClass": "btn btn-white btn-primary  btn-bold",
							"sButtonText": "<i class='fa fa-file-excel-o bigger-110 green'></i>"
						},
						
						{
							"sExtends": "pdf",
							"sToolTip": "Export to PDF",
							"sButtonClass": "btn btn-white btn-primary  btn-bold",
							"sButtonText": "<i class='fa fa-file-pdf-o bigger-110 red'></i>"
						},
						
						{
							"sExtends": "print",
							"sToolTip": "Print view",
							"sButtonClass": "btn btn-white btn-primary  btn-bold",
							"sButtonText": "<i class='fa fa-print bigger-110 grey'></i>",
							
							"sMessage": "<div class='navbar navbar-default'><div class='navbar-header pull-left'><a class='navbar-brand' href='#'><small>Optional Navbar &amp; Text</small></a></div></div>",
							
							"sInfo": "<h3 class='no-margin-top'>Print view</h3>\
									  <p>Please use your browser's print function to\
									  print this table.\
									  <br />Press <b>escape</b> when finished.</p>",
						}
			        ]
			    } );
				//we put a container before our table and append TableTools element to it
			    $(tableTools_obj.fnContainer()).appendTo($('.tableTools-container'));
				
				//also add tooltips to table tools buttons
				//addding tooltips directly to "A" buttons results in buttons disappearing (weired! don't know why!)
				//so we add tooltips to the "DIV" child after it becomes inserted
				//flash objects inside table tools buttons are inserted with some delay (100ms) (for some reason)
				setTimeout(function() {
					$(tableTools_obj.fnContainer()).find('a.DTTT_button').each(function() {
						var div = $(this).find('> div');
						if(div.length > 0) div.tooltip({container: 'body'});
						else $(this).tooltip({container: 'body'});
					});
				}, 200);
				
				
				
				//ColVis extension
				var colvis = new $.fn.dataTable.ColVis( oTable1, {
					"buttonText": "<i class='fa fa-search'></i>",
					"aiExclude": [0, 6],
					"bShowAll": true,
					//"bRestore": true,
					"sAlign": "right",
					"fnLabel": function(i, title, th) {
						return $(th).text();//remove icons, etc
					}
					
				}); 
				
				//style it
				$(colvis.button()).addClass('btn-group').find('button').addClass('btn btn-white btn-info btn-bold')
				
				//and append it to our table tools btn-group, also add tooltip
				$(colvis.button())
				.prependTo('.tableTools-container .btn-group')
				.attr('title', 'Show/hide columns').tooltip({container: 'body'});
				
				//and make the list, buttons and checkboxed Ace-like
				$(colvis.dom.collection)
				.addClass('dropdown-menu dropdown-light dropdown-caret dropdown-caret-right')
				.find('li').wrapInner('<a href="javascript:void(0)" />') //'A' tag is required for better styling
				.find('input[type=checkbox]').addClass('ace').next().addClass('lbl padding-8');
			
			
				
				/////////////////////////////////
				//table checkboxes
				$('th input[type=checkbox], td input[type=checkbox]').prop('checked', false);
				
				//select/deselect all rows according to table header checkbox
				$('#dynamic-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function(){
					var th_checked = this.checked;//checkbox inside "TH" table header
					
					$(this).closest('table').find('tbody > tr').each(function(){
						var row = this;
						if(th_checked) tableTools_obj.fnSelect(row);
						else tableTools_obj.fnDeselect(row);
					});
				});
				
				//select/deselect a row when the checkbox is checked/unchecked
				$('#dynamic-table').on('click', 'td input[type=checkbox]' , function(){
					var row = $(this).closest('tr').get(0);
					if(!this.checked) tableTools_obj.fnSelect(row);
					else tableTools_obj.fnDeselect($(this).closest('tr').get(0));
				});
				
			
				
				
					$(document).on('click', '#dynamic-table .dropdown-toggle', function(e) {
					e.stopImmediatePropagation();
					e.stopPropagation();
					e.preventDefault();
				});
				
				
				//And for the first simple table, which doesn't have TableTools or dataTables
				//select/deselect all rows according to table header checkbox
				var active_class = 'active';
				$('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function(){
					var th_checked = this.checked;//checkbox inside "TH" table header
					
					$(this).closest('table').find('tbody > tr').each(function(){
						var row = this;
						if(th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
						else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
					});
				});
				
				//select/deselect a row when the checkbox is checked/unchecked
				$('#simple-table').on('click', 'td input[type=checkbox]' , function(){
					var $row = $(this).closest('tr');
					if(this.checked) $row.addClass(active_class);
					else $row.removeClass(active_class);
				});
			
				
			
				/********************************/
				//add tooltip for small view action buttons in dropdown menu
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				
				//tooltip placement on right or left
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					//var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			
			})
		</script>
</body>
</html>