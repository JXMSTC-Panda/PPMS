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

							<table id="grid-table" name=""></table>

							<div id="grid-pager"></div>

							<script type="text/javascript">
								var $path_base = "..";//in Ace demo this will be used for editurl parameter
							</script>
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
		src="${pageContext.request.contextPath}/assets/js/jqGrid/jquery.jqGrid.src.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jqGrid/i18n/grid.locale-en.js"></script>

	<!-- inline scripts related to this page -->
	<script type="text/javascript">
	
	
	var grid_data =[];

		jQuery(function($) {
			var grid_selector = "#grid-table";
			var pager_selector = "#grid-pager";

			//resize to fit page size
			$(window).on(
					'resize.jqGrid',
					function() {
						$(grid_selector).jqGrid('setGridWidth',
								$(".page-content").width());
					})
			//resize on sidebar collapse/expand
			var parent_column = $(grid_selector).closest('[class*="col-"]');
			$(document).on(
					'settings.ace.jqGrid',
					function(ev, event_name, collapsed) {
						if (event_name === 'sidebar_collapsed'
								|| event_name === 'main_container_fixed') {
							//setTimeout is for webkit only to give time for DOM changes and then redraw!!!
							setTimeout(function() {
								$(grid_selector).jqGrid('setGridWidth',
										parent_column.width());
							}, 0);
						}
					})

			//if your grid is inside another element, for example a tab pane, you should use its parent's width:
			/**
			$(window).on('resize.jqGrid', function () {
				var parent_width = $(grid_selector).closest('.tab-pane').width();
				$(grid_selector).jqGrid( 'setGridWidth', parent_width );
			})
			//and also set width when tab pane becomes visible
			$('#myTab a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
			  if($(e.target).attr('href') == '#mygrid') {
				var parent_width = $(grid_selector).closest('.tab-pane').width();
				$(grid_selector).jqGrid( 'setGridWidth', parent_width );
			  }
			})
			 */

			jQuery(grid_selector)
					.jqGrid(
							{
								//direction: "rtl",

								//subgrid options
								subGrid : true,
								//subGridModel: [{ name : ['No','Item Name','Qty'], width : [55,200,80] }],
								//datatype: "xml",
								subGridOptions : {
									plusicon : "ace-icon fa fa-plus center bigger-110 blue",
									minusicon : "ace-icon fa fa-minus center bigger-110 blue",
									openicon : "ace-icon fa fa-chevron-right center orange"
								},
								//for this example we are using local data
								subGridRowExpanded : function(subgridDivId,
										rowId) {
									var subgridTableId = subgridDivId + "_t";
									$("#" + subgridDivId)
											.html(
													"<table id='" + subgridTableId + "'></table>");
									$("#" + subgridTableId).jqGrid(
											{
												datatype : 'local',
												data : subgrid_data,
												colNames : [ 'No', 'Item Name',
														'Qty' ],
												colModel : [ {
													name : 'id',
													width : 50
												}, {
													name : 'name',
													width : 150
												}, {
													name : 'qty',
													width : 50
												} ]
											});
								},

								data : grid_data,
								
								//url:
								//从服务器端返回的数据类型，默认xml。
								//可选类型：xml，local，json，jsonnp，script，xmlstring，jsonstring，clientside
								datatype : "json",

								height : 250,

								//列显示名称，是一个数组对象
								colNames : [ '操作', '序号', '工号', '姓名', '身份证',
										'营业厅编码', '营业厅名称', '月份', '成绩（分）', '备注',
										'月度绩效评分标准' ],

								//常用到的属性：name 列显示的名称；index 传到服务器端用来排序用的列名称；
								//width 列宽度；align 对齐方式；sortable 是否可以排序
								colModel : [
										{
											name : 'myac',
											index : '',
											width : 80,
											fixed : true,
											sortable : false,
											resize : false,
											formatter : 'actions',
											formatoptions : {
												keys : true,
												//delbutton: false,//disable delete button

												delOptions : {
													recreateForm : true,
													beforeShowForm : beforeDeleteCallback
												},
											//editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}
											}
										}, { //绩效id
											name : 'performanceid',
											index : 'performanceid',
											width : 60,
											sorttype : "String",
											editable : true

										}, { //员工id
											name : 'employeeid',
											index : 'employeeid',
											width : 60,
											editable : true,
											sorttype : "String",

										}, { //员工名字
											name : 'employeename',
											index : 'employeename',
											width : 90,
											editable : true,
											sorttype : "String",
										}, { //员工身份证
											name : 'idnumber',
											index : 'idnumber',
											width : 150,
											editable : true,
											sorttype : "String",
										}, { //营业厅编码
											name : 'orgid',
											index : 'orgid',
											width : 90,
											editable : true,
											sorttype : "Integer",
										}, { //营业厅名称
											name : 'orgName',
											index : 'orgName',
											width : 90,
											editable : true,
											sorttype : "String",

										}, { //月份
											name : 'performancedate',
											index : 'performancedate',
											width : 90,
											editable : true,
											sorttype : "Date",

										}, {//月度成绩
											name : 'performancescore',
											index : 'performancescore',
											width : 90,
											editable : true,
											sorttype : "Double",

										}, {//备注
											name : 'remark',
											index : 'remark',
											width : 90,
											editable : true,
											sorttype : "String",

										}, {//月度成绩
											name : 'performancescore',
											index : 'performancescore',
											width : 90,
											editable : true,
											sorttype : "Double",

										} ],

								viewrecords : true, //是否显示记录数
								rowNum : 10, //在grid上记录，这个参数是要被传到后台
								rowList : [ 10, 20, 30 ], //一个下拉选择框，用来改变现实记录数，当选择是会覆盖rowName参数传给后台

								//定义翻页用的导航栏，必须是有效的html元素。翻页工具栏可以放置在html页面任意位置
								pager : pager_selector,
								altRows : true, //设置zebra-striped值
								//toppager: true,

								multiselect : true, //定义是否可以多选
								//multikey: "ctrlKey",
								multiboxonly : true, //只有当multiselect = true.起作用，当multiboxonly 为ture时只有选择checkbox才会起作用

								// loadComplete当从服务器返回响应时执行，xhr：XMLHttpRequest 对象
								loadComplete : function() {
									var table = this;
									setTimeout(function() {
										styleCheckbox(table);

										updateActionIcons(table);
										updatePagerIcons(table);
										enableTooltips(table);
									}, 0);
								},

								//定义对form编辑时的url
								editurl : "/dummy.html",//nothing is saved
								//表格名称
								caption : "详细信息"

							//,autowidth: true,

							/**
							
							,
							grouping:true, 
							groupingView : { 
							groupField : ['name'],
							groupDataSorted : true,
							plusicon : 'fa fa-chevron-down bigger-110',
							minusicon : 'fa fa-chevron-up bigger-110'
							},
							caption: "Grouping"
							 */

							});
			$(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size

			//enable search/filter toolbar
			//jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})
			//jQuery(grid_selector).filterToolbar({});

			//switch element when editing inline
			function aceSwitch(cellvalue, options, cell) {
				setTimeout(function() {
					$(cell).find('input[type=checkbox]').addClass(
							'ace ace-switch ace-switch-5').after(
							'<span class="lbl"></span>');
				}, 0);
			}
			//enable datepicker
			function pickDate(cellvalue, options, cell) {
				setTimeout(function() {
					$(cell).find('input[type=text]').datepicker({
						format : 'yyyy-mm-dd',
						autoclose : true
					});
				}, 0);
			}

			//navButtons
			jQuery(grid_selector).jqGrid(
					'navGrid',
					pager_selector,
					{ //navbar options
						edit : true,
						editicon : 'ace-icon fa fa-pencil blue',
						add : true,
						addicon : 'ace-icon fa fa-plus-circle purple',
						del : true,
						delicon : 'ace-icon fa fa-trash-o red',
						search : true,
						searchicon : 'ace-icon fa fa-search orange',
						refresh : true,
						refreshicon : 'ace-icon fa fa-refresh green',
						view : true,
						viewicon : 'ace-icon fa fa-search-plus grey',
					},
					{
						//edit record form
						//closeAfterEdit: true,
						//width: 700,
						recreateForm : true,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find(
									'.ui-jqdialog-titlebar').wrapInner(
									'<div class="widget-header" />')
							style_edit_form(form);
						}
					},
					{
						//new record form
						//width: 700,
						closeAfterAdd : true,
						recreateForm : true,
						viewPagerButtons : false,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find(
									'.ui-jqdialog-titlebar').wrapInner(
									'<div class="widget-header" />')
							style_edit_form(form);
						}
					},
					{
						//delete record form
						recreateForm : true,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							if (form.data('styled'))
								return false;

							form.closest('.ui-jqdialog').find(
									'.ui-jqdialog-titlebar').wrapInner(
									'<div class="widget-header" />')
							style_delete_form(form);

							form.data('styled', true);
						},
						onClick : function(e) {
							//alert(1);
						}
					},
					{
						//search form
						recreateForm : true,
						afterShowSearch : function(e) {
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find(
									'.ui-jqdialog-title').wrap(
									'<div class="widget-header" />')
							style_search_form(form);
						},
						afterRedraw : function() {
							style_search_filters($(this));
						},
						multipleSearch : true,
					/**
					multipleGroup:true,
					showQuery: true
					 */
					},
					{
						//view record form
						recreateForm : true,
						beforeShowForm : function(e) {
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find(
									'.ui-jqdialog-title').wrap(
									'<div class="widget-header" />')
						}
					})

			function style_edit_form(form) {
				//enable datepicker on "sdate" field and switches for "stock" field
				form.find('input[name=sdate]').datepicker({
					format : 'yyyy-mm-dd',
					autoclose : true
				})

				form.find('input[name=stock]').addClass(
						'ace ace-switch ace-switch-5').after(
						'<span class="lbl"></span>');
				//don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)
				//.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');

				//update buttons classes
				var buttons = form.next().find('.EditButton .fm-button');
				buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon
				buttons.eq(0).addClass('btn-primary').prepend(
						'<i class="ace-icon fa fa-check"></i>');
				buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')

				buttons = form.next().find('.navButton a');
				buttons.find('.ui-icon').hide();
				buttons.eq(0).append(
						'<i class="ace-icon fa fa-chevron-left"></i>');
				buttons.eq(1).append(
						'<i class="ace-icon fa fa-chevron-right"></i>');
			}

			function style_delete_form(form) {
				var buttons = form.next().find('.EditButton .fm-button');
				buttons.addClass('btn btn-sm btn-white btn-round').find(
						'[class*="-icon"]').hide();//ui-icon, s-icon
				buttons.eq(0).addClass('btn-danger').prepend(
						'<i class="ace-icon fa fa-trash-o"></i>');
				buttons.eq(1).addClass('btn-default').prepend(
						'<i class="ace-icon fa fa-times"></i>')
			}

			function style_search_filters(form) {
				form.find('.delete-rule').val('X');
				form.find('.add-rule').addClass('btn btn-xs btn-primary');
				form.find('.add-group').addClass('btn btn-xs btn-success');
				form.find('.delete-group').addClass('btn btn-xs btn-danger');
			}
			function style_search_form(form) {
				var dialog = form.closest('.ui-jqdialog');
				var buttons = dialog.find('.EditTable')
				buttons.find('.EditButton a[id*="_reset"]').addClass(
						'btn btn-sm btn-info').find('.ui-icon').attr('class',
						'ace-icon fa fa-retweet');
				buttons.find('.EditButton a[id*="_query"]').addClass(
						'btn btn-sm btn-inverse').find('.ui-icon').attr(
						'class', 'ace-icon fa fa-comment-o');
				buttons.find('.EditButton a[id*="_search"]').addClass(
						'btn btn-sm btn-purple').find('.ui-icon').attr('class',
						'ace-icon fa fa-search');
			}

			function beforeDeleteCallback(e) {
				var form = $(e[0]);
				if (form.data('styled'))
					return false;

				form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')
						.wrapInner('<div class="widget-header" />')
				style_delete_form(form);

				form.data('styled', true);
			}

			function beforeEditCallback(e) {
				var form = $(e[0]);
				form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')
						.wrapInner('<div class="widget-header" />')
				style_edit_form(form);
			}

			//it causes some flicker when reloading or navigating grid
			//it may be possible to have some custom formatter to do this as the grid is being created to prevent this
			//or go back to default browser checkbox styles for the grid
			function styleCheckbox(table) {
				/**
					$(table).find('input:checkbox').addClass('ace')
					.wrap('<label />')
					.after('<span class="lbl align-top" />')
				
				
					$('.ui-jqgrid-labels th[id*="_cb"]:first-child')
					.find('input.cbox[type=checkbox]').addClass('ace')
					.wrap('<label />').after('<span class="lbl align-top" />');
				 */
			}

			//unlike navButtons icons, action icons in rows seem to be hard-coded
			//you can change them like this in here if you want
			function updateActionIcons(table) {
				/**
				var replacement = 
				{
					'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue',
					'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red',
					'ui-icon-disk' : 'ace-icon fa fa-check green',
					'ui-icon-cancel' : 'ace-icon fa fa-times red'
				};
				$(table).find('.ui-pg-div span.ui-icon').each(function(){
					var icon = $(this);
					var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
					if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
				})
				 */
			}

			//replace icons with FontAwesome icons like above
			function updatePagerIcons(table) {
				var replacement = {
					'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',
					'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',
					'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',
					'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'
				};
				$(
						'.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')
						.each(
								function() {
									var icon = $(this);
									var $class = $.trim(icon.attr('class')
											.replace('ui-icon', ''));

									if ($class in replacement)
										icon.attr('class', 'ui-icon '
												+ replacement[$class]);
								})
			}

			function enableTooltips(table) {
				$('.navtable .ui-pg-button').tooltip({
					container : 'body'
				});
				$(table).find('.ui-pg-div').tooltip({
					container : 'body'
				});
			}

			//var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');

			$(document).one('ajaxloadstart.page', function(e) {
				$(grid_selector).jqGrid('GridUnload');
				$('.ui-jqdialog').remove();
			});
		});
	</script>
</body>
</html>