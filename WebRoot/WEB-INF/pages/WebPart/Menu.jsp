<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!-- #section:basics/sidebar -->
<div id="sidebar" class="sidebar responsive">
	<script type="text/javascript">
		try {
			ace.settings.check('sidebar', 'fixed')
		} catch (e) {
		}
	</script>

	<div class="sidebar-shortcuts" id="sidebar-shortcuts">
		<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
			<button class="btn btn-success">
				<i class="ace-icon fa fa-signal"></i>
			</button>

			<button class="btn btn-info">
				<i class="ace-icon fa fa-pencil"></i>
			</button>

			<!-- #section:basics/sidebar.layout.shortcuts -->
			<button class="btn btn-warning">
				<i class="ace-icon fa fa-users"></i>
			</button>

			<button class="btn btn-danger">
				<i class="ace-icon fa fa-cogs"></i>
			</button>

			<!-- /section:basics/sidebar.layout.shortcuts -->
		</div>

		<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
			<span class="btn btn-success"></span> <span class="btn btn-info"></span>

			<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
		</div>
	</div>
	<!-- /.sidebar-shortcuts -->

	<ul class="nav nav-list">
		<li class="active">
			<a href="index.jsp">
				<i class="fa fa-dashboard"></i>
				<span class="menu-text">控制台</span>
			</a>
		</li>
		<li>
			<a href="#" class="dropdown-toggle"> 
				<i class="fa fa-list"></i>
					<span class="menu-text">班级信息管理</span> 
					<b class="arrow fa fa-angle-down"></b> 
			</a>
			<ul class="submenu">
				<li><a href="ClassAdd"><i class="fa fa-double-angle-right"></i>添加班级 </a></li>
				<li><a href="classModify.jsp"><i class="fa fa-double-angle-right"></i>修改班级 </a></li>
				<li><a href="ClassList"> <i class="fa fa-double-angle-right"></i>班级列表 </a></li>
			</ul>
		</li>

		<li>
			<a href="#" class="dropdown-toggle"> 
				<i class="fa fa-text-width"></i>
				<span class="menu-text">学生管理</span>
				<b class="arrow fa fa-angle-down"></b>
			</a>
			<ul class="submenu">
				<li><a href="stuAdd"><i class="fa fa-double-angle-right"></i> 添加 </a></li>
				<li><a href="stuDetailInfo"><i class="fa fa-double-angle-right"></i> 添加 </a></li>
				<li><a href="StuList"><i class="fa fa-double-angle-right"></i> 学生列表 </a></li>
			</ul>
		</li>
	</ul>
	<!-- /.nav-list -->

	<!-- #section:basics/sidebar.layout.minimize -->
	<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
		<i class="ace-icon fa fa-angle-double-left"
			data-icon1="ace-icon fa fa-angle-double-left"
			data-icon2="ace-icon fa fa-angle-double-right"></i>
	</div>

	<!-- /section:basics/sidebar.layout.minimize -->
	<script type="text/javascript">
		try { ace.settings.check('sidebar', 'collapsed') } catch (e) { }
	</script>
</div>

<!-- /section:basics/sidebar -->

