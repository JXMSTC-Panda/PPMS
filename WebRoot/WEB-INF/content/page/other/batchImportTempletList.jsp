<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html lang="en">

	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Blank Page - Ace Admin</title>

		<meta name="description" content="" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.css" />

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery-ui.custom.css" />
		<!-- text fonts -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

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
								<div class="page-content">
									<!-- #section:settings.box -->

									<!-- /section:settings.box -->
									<div class="page-header">
										<h1>
								其他
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									批量导入模版下载
								</small>
							</h1>
									</div>
									<!-- /.page-header -->

									<div class="row">
									
									<div class="col-xs-12  widget-container-col">
										<div class="widget-box widget-color-blue">
											<!-- #section:custom/widget-box.options -->
											<div class="widget-header">
												<h5 class="widget-title bigger lighter">
													<i class="ace-icon fa fa-table"></i>
													请选择批量导入的功能模版
												</h5>

												<div class="widget-toolbar widget-toolbar-light no-border">
													<select id="simple-colorpicker-1" class="hide">
														<option selected="" data-class="blue" value="#307ECC">#307ECC</option>
														<option data-class="blue2" value="#5090C1">#5090C1</option>
														<option data-class="blue3" value="#6379AA">#6379AA</option>
														<option data-class="green" value="#82AF6F">#82AF6F</option>
														<option data-class="green2" value="#2E8965">#2E8965</option>
														<option data-class="green3" value="#5FBC47">#5FBC47</option>
														<option data-class="red" value="#E2755F">#E2755F</option>
														<option data-class="red2" value="#E04141">#E04141</option>
														<option data-class="red3" value="#D15B47">#D15B47</option>
														<option data-class="orange" value="#FFC657">#FFC657</option>
														<option data-class="purple" value="#7E6EB0">#7E6EB0</option>
														<option data-class="pink" value="#CE6F9E">#CE6F9E</option>
														<option data-class="dark" value="#404040">#404040</option>
														<option data-class="grey" value="#848484">#848484</option>
														<option data-class="default" value="#EEE">#EEE</option>
													</select>
												</div>
											</div>

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
																	功能名
																</th>
																
															</tr>
														</thead>

														<tbody>
															<tr>
																<td class="">1</td>

																<td>
																	<a href="downloadAction.do?fileName=人员基本信息批量导入模板.xls">人员基本信息批量导入模板</a>
																</td>

																
															</tr>

															<tr>
																<td class="">2</td>

																<td>
																	<a href="downloadAction.do?fileName=合作厅上岗证批量导入模板.xls">合作厅上岗证批量导入模板</a>
																</td>

																
															</tr>

															<tr>
																<td class="">3</td>

																<td>
																	<a href="downloadAction.do?fileName=月度考试批量导入模板.xls">月度考试批量导入模板</a>
																</td>

																
															</tr>

															<tr>
																<td class="">4</td>

																<td>
																	<a href="downloadAction.do?fileName=业务培训批量导入模板.xls">业务培训批量导入模板</a>
																</td>

																
															</tr>

															<tr>
																<td class="">5</td>

																<td>
																	<a href="downloadAction.do?fileName=进阶培训管理批量导入模板.xls">进阶培训管理批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">6</td>

																<td>
																	<a href="downloadAction.do?fileName=新员工考核成绩批量导入模板.xls">新员工考核成绩批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">7</td>

																<td>
																	<a href="downloadAction.do?fileName=转正考核成绩批量导入模板.xls">转正考核成绩批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">8</td>

																<td>
																	<a href="downloadAction.do?fileName=标准化检查成绩批量导入模板.xls">标准化检查成绩批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">9</td>

																<td>
																	<a href="downloadAction.do?fileName=监控检查成绩批量导入模板.xls">监控检查成绩批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">10</td>

																<td>
																	<a href="downloadAction.do?fileName=暗访检查成绩批量导入模板.xls">暗访检查成绩批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">11</td>

																<td>
																	<a href="downloadAction.do?fileName=业务差错检查成绩批量导入模板.xls">业务差错检查成绩批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">12</td>

																<td>
																	<a href="downloadAction.do?fileName=积分批量导入模板(合作厅).xls">积分批量导入模板(合作厅)</a>
																</td>

																
															</tr>
															<tr>
																<td class="">13</td>

																<td>
																	<a href="downloadAction.do?fileName=积分批量导入模板(主厅).xls">积分批量导入模板(主厅)</a>
																</td>

																
															</tr>
															<tr>
																<td class="">14</td>

																<td>
																	<a href="downloadAction.do?fileName=创新提案批量导入模板.xls">创新提案批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">15</td>

																<td>
																	<a href="downloadAction.do?fileName=员工奖惩信息批量导入模板.xls">员工奖惩信息批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">16</td>

																<td>
																	<a href="downloadAction.do?fileName=营业厅奖惩信息批量导入模板.xls">营业厅奖惩信息批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">17</td>

																<td>
																	<a href="downloadAction.do?fileName=月度绩效批量导入模板.xls">月度绩效批量导入模板</a>
																</td>

																
															</tr>
															<tr>
																<td class="">18</td>

																<td>
																	<a href="downloadAction.do?fileName=年度绩效批量导入模板.xls">年度绩效批量导入模板</a>
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
								<!-- /.page-content -->
								<!-- PAGE CONTENT ENDS -->
							</div>
							<!-- /.col -->
						</div>
						<!-- /.row -->
					</div>
					<!-- /.page-content -->
				</div>
			</div>
			<!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">Ace</span> Application &copy; 2013-2014
						</span>

						&nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div>
		<!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.js'>" + "<" + "/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery1x.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if ('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.mobile.custom.js'>" + "<" + "/script>");
		</script>
		<script src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>

		<!-- page specific plugin scripts -->
		<script src="${pageContext.request.contextPath}/assets/js/jquery-ui.custom.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.ui.touch-punch.js"></script>
		<!-- ace scripts -->
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.scroller.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.colorpicker.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.fileinput.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.typeahead.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.wysiwyg.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.spinner.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.treeview.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.wizard.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/elements.aside.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.ajax-content.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.touch-drag.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.sidebar.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.sidebar-scroll-1.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.submenu-hover.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.widget-box.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.settings.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.settings-rtl.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.settings-skin.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.widget-on-reload.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace/ace.searchbox-autocomplete.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) {
			
				$('#simple-colorpicker-1').ace_colorpicker({pull_right:true}).on('change', function(){
					var color_class = $(this).find('option:selected').data('class');
					var new_class = 'widget-box';
					if(color_class != 'default')  new_class += ' widget-color-'+color_class;
					$(this).closest('.widget-box').attr('class', new_class);
				});
			
			
				// scrollables
				$('.scrollable').each(function () {
					var $this = $(this);
					$(this).ace_scroll({
						size: $this.attr('data-size') || 100,
						//styleClass: 'scroll-left scroll-margin scroll-thin scroll-dark scroll-light no-track scroll-visible'
					});
				});
				$('.scrollable-horizontal').each(function () {
					var $this = $(this);
					$(this).ace_scroll(
					  {
						horizontal: true,
						styleClass: 'scroll-top',//show the scrollbars on top(default is bottom)
						size: $this.attr('data-size') || 500,
						mouseWheelLock: true
					  }
					).css({'padding-top': 12});
				});
				
				$(window).on('resize.scroll_reset', function() {
					$('.scrollable-horizontal').ace_scroll('reset');
				});
			
				
				$('#id-checkbox-vertical').prop('checked', false).on('click', function() {
					$('#widget-toolbox-1').toggleClass('toolbox-vertical')
					.find('.btn-group').toggleClass('btn-group-vertical')
					.filter(':first').toggleClass('hidden')
					.parent().toggleClass('btn-toolbar')
				});
			
				/**
				//or use slimScroll plugin
				$('.slim-scrollable').each(function () {
					var $this = $(this);
					$this.slimScroll({
						height: $this.data('height') || 100,
						railVisible:true
					});
				});
				*/
				
			
				/**$('.widget-box').on('setting.ace.widget' , function(e) {
					e.preventDefault();
				});*/
			
				/**
				$('.widget-box').on('show.ace.widget', function(e) {
					//e.preventDefault();
					//this = the widget-box
				});
				$('.widget-box').on('reload.ace.widget', function(e) {
					//this = the widget-box
				});
				*/
			
				//$('#my-widget-box').widget_box('hide');
			
				
			
				// widget boxes
				// widget box drag & drop example
			    $('.widget-container-col').sortable({
			        connectWith: '.widget-container-col',
					items:'> .widget-box',
					handle: ace.vars['touch'] ? '.widget-header' : false,
					cancel: '.fullscreen',
					opacity:0.8,
					revert:true,
					forceHelperSize:true,
					placeholder: 'widget-placeholder',
					forcePlaceholderSize:true,
					tolerance:'pointer',
					start: function(event, ui) {
						//when an element is moved, it's parent becomes empty with almost zero height.
						//we set a min-height for it to be large enough so that later we can easily drop elements back onto it
						ui.item.parent().css({'min-height':ui.item.height()})
						//ui.sender.css({'min-height':ui.item.height() , 'background-color' : '#F5F5F5'})
					},
					update: function(event, ui) {
						ui.item.parent({'min-height':''})
						//p.style.removeProperty('background-color');
					}
			    });
				
			
			
			});
		</script>
</html>																	