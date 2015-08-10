<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!-- #section:basics/sidebar -->
<div id="sidebar" class="sidebar                  responsive">
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
		<li id="authority" class=""><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-desktop"></i> <span class="menu-text">
					权限管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>

			<ul class="submenu">
				<li id="roleSingle" class=""><a
					href="${pageContext.request.contextPath}/resource/authority.null.roleSingle">
						<i class="menu-icon fa fa-caret-right"></i>角色增加 </a> <b class="arrow"></b>
				</li>
				<li id="roleSearch" class=""><a
					href="${pageContext.request.contextPath}/resource/authority.null.roleSearch">
						<i class="menu-icon fa fa-caret-right"></i>角色查询 </a> <b class="arrow"></b>
				</li>
			</ul></li>

		<li id="userInfo" class=""><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-male"></i> <span class="menu-text">
					人员综合信息管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="userBase" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>人员基本信息管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="userBaseInfoSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.userBase.userBaseInfoSingle">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息单条录入 </a> <b
							class="arrow"></b></li>
						<li id="userBaseInfoBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.userBase.userBaseInfoBatch">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息批量录入 </a> <b
							class="arrow"></b></li>
						<li id="userBaseInfoBatchUpdateBySelectField" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.userBase.userBaseInfoBatchUpdateBySelectField">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息批量修改 </a> <b
							class="arrow"></b></li>
						<li id="userBaseInfoSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.userBase.userBaseInfoSearch">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息查詢 </a> <b
							class="arrow"></b></li>
					</ul></li>

				<li id="growthFile" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>员工成长档案查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="individualGrowthFileSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.growthFile.individualGrowthFileSearch">
								<i class="menu-icon fa fa-caret-right"></i>个人成长线路查询 </a> <b
							class="arrow"></b></li>
						<li id="personnelGrowthFileSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.growthFile.personnelGrowthFileSearch">
								<i class="menu-icon fa fa-caret-right"></i>人员阶段查询 </a> <b
							class="arrow"></b></li>

					</ul></li>

				<li id="changeHall" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>人员调厅记录查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="changeHallSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.changeHall.changeHallSearch">
								<i class="menu-icon fa fa-caret-right"></i>人员调厅记录查询 </a> <b
							class="arrow"></b></li>
						<li id="businessHallSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.changeHall.businessHallSearch">
								<i class="menu-icon fa fa-caret-right"></i>营业厅信息查询 </a> <b
							class="arrow"></b></li>

					</ul></li>

				<li id="hallKeeperExam" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>店长测评、进阶查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="hallKeeperExamSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.hallKeeperExam.hallKeeperExamSearch">
								<i class="menu-icon fa fa-caret-right"></i>店长测评查询 </a> <b
							class="arrow"></b></li>
						<li id="hallKeeperForwardSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.hallKeeperExam.hallKeeperForwardSearch">
								<i class="menu-icon fa fa-caret-right"></i>店长进阶查询 </a> <b
							class="arrow"></b></li>

					</ul></li>

				<li id="managerExam" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>值班经理测评、进阶查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="managerExamSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.managerExam.managerExamSearch">
								<i class="menu-icon fa fa-caret-right"></i>值班经理测评查询 </a> <b
							class="arrow"></b></li>
						<li id="managerForwardSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.managerExam.managerForwardSearch">
								<i class="menu-icon fa fa-caret-right"></i>值班经理进阶查询 </a> <b
							class="arrow"></b></li>

					</ul></li>

				<li id="mountGuardCard" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>合作厅上岗证查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="mountGuardCardSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.mountGuardCard.mountGuardCardSingle">
								<i class="menu-icon fa fa-caret-right"></i>合作厅上岗证单条录入 </a> <b
							class="arrow"></b></li>
						<li id="mountGuardCardBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.mountGuardCard.mountGuardCardBatch">
								<i class="menu-icon fa fa-caret-right"></i>合作厅上岗批量导入 </a> <b
							class="arrow"></b></li>
						<li id="mountGuardCardSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/userInfo.mountGuardCard.mountGuardCardSearch">
								<i class="menu-icon fa fa-caret-right"></i>合作厅上岗证查询 </a> <b
							class="arrow"></b></li>
					</ul></li>
			</ul></li>

		<li id="employeeTrainExam" class=""><a href="#"
			class="dropdown-toggle"> <i class="menu-icon fa fa-desktop"></i>
				<span class="menu-text"> 员工培训/考试管理 </span> <b
				class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="monthExam" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>月度考核管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="monthExamSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.monthExam.monthExamSingle">
								<i class="menu-icon fa fa-caret-right"></i>月度考试单条录入 </a> <b
							class="arrow"></b></li>
						<li id="monthExamBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.monthExam.monthExamBatch">
								<i class="menu-icon fa fa-caret-right"></i>月度考试批量导入 </a> <b
							class="arrow"></b></li>
						<li id="monthExamSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.monthExam.monthExamSearch">
								<i class="menu-icon fa fa-caret-right"></i>月度考试查詢 </a> <b
							class="arrow"></b></li>
					</ul></li>

				<li id="operationTrain" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>业务培训管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="operationTrainSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.operationTrain.operationTrainSingle">
								<i class="menu-icon fa fa-caret-right"></i>业务培训单条录入 </a> <b
							class="arrow"></b></li>
						<li id="operationTrainBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.operationTrain.operationTrainBatch">
								<i class="menu-icon fa fa-caret-right"></i>业务培训批量录入 </a> <b
							class="arrow"></b></li>
						<li id="operationTrainSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.operationTrain.operationTrainSearch">
								<i class="menu-icon fa fa-caret-right"></i>业务培训查询 </a> <b
							class="arrow"></b></li>

					</ul></li>

				<li id="promoteTrain" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>进阶培训管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="promoteTrainSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.promoteTrain.promoteTrainSingle">
								<i class="menu-icon fa fa-caret-right"></i>进阶培训单条录入 </a> <b
							class="arrow"></b></li>
						<li id="promoteTrainBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.promoteTrain.promoteTrainBatch">
								<i class="menu-icon fa fa-caret-right"></i>进阶培训批量导入 </a> <b
							class="arrow"></b></li>
						<li id="promoteTrainSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.promoteTrain.promoteTrainSearch">
								<i class="menu-icon fa fa-caret-right"></i>进阶培训查询 </a> <b
							class="arrow"></b></li>
					</ul></li>

				<li id="freshEmployeeExam" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>新员工/转正考核
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="freshEmployeeExamSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.freshEmployeeExam.freshEmployeeExamSingle">
								<i class="menu-icon fa fa-caret-right"></i>新员工考核成绩单条录入 </a> <b
							class="arrow"></b></li>
						<li id="freshEmployeeExamBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.freshEmployeeExam.freshEmployeeExamBatch">
								<i class="menu-icon fa fa-caret-right"></i>新员工考核成绩批量导入 </a> <b
							class="arrow"></b></li>
						<li id="freshEmployeeExamSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.freshEmployeeExam.freshEmployeeExamSearch">
								<i class="menu-icon fa fa-caret-right"></i>新员工考核成绩查询 </a> <b
							class="arrow"></b></li>
						<li id="becomeEmployeeSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.freshEmployeeExam.becomeEmployeeSingle">
								<i class="menu-icon fa fa-caret-right"></i>转正考核成绩单条录入 </a> <b
							class="arrow"></b></li>
						<li id="becomeEmployeeBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.freshEmployeeExam.becomeEmployeeBatch">
								<i class="menu-icon fa fa-caret-right"></i>转正考核成绩批量导入 </a> <b
							class="arrow"></b></li>
						<li id="becomeEmployeeSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/employeeTrainExam.freshEmployeeExam.becomeEmployeeSearch">
								<i class="menu-icon fa fa-caret-right"></i>转正考核成绩查询 </a> <b
							class="arrow"></b></li>
					</ul></li>
			</ul></li>

		<li id="standardVisit" class=""><a href="#"
			class="dropdown-toggle"> <i class="menu-icon fa fa-desktop"></i>
				<span class="menu-text"> 标准化和暗访管理 </span> <b
				class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="standard" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="standardSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.standard.standardSingle">
								<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩单条录入 </a> <b
							class="arrow"></b></li>
						<li id="standardBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.standard.standardBatch">
								<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩批量导入 </a> <b
							class="arrow"></b></li>
						<li id="standardSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.standard.standardSearch">
								<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩查询 </a> <b
							class="arrow"></b></li>
					</ul></li>

				<li id="monitor" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>监控检查成绩管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="monitorSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.monitor.monitorSingle">
								<i class="menu-icon fa fa-caret-right"></i>监控检查成绩单条录入 </a> <b
							class="arrow"></b></li>
						<li id="monitorBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.monitor.monitorBatch">
								<i class="menu-icon fa fa-caret-right"></i>监控检查成绩批量录入 </a> <b
							class="arrow"></b></li>
						<li id="monitorSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.monitor.monitorSearch">
								<i class="menu-icon fa fa-caret-right"></i>监控检查成绩查询 </a> <b
							class="arrow"></b></li>

					</ul></li>

				<li id="visit" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="visitSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.visit.visitSingle">
								<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩单条录入 </a> <b
							class="arrow"></b></li>
						<li id="visitBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.visit.visitBatch">
								<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩批量导入 </a> <b
							class="arrow"></b></li>
						<li id="visitSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.visit.visitSearch">
								<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩查询 </a> <b
							class="arrow"></b></li>
					</ul></li>

				<li id="operationMistake" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="operationMistakeSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.operationMistake.operationMistakeSingle">
								<i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩单条录入 </a> <b
							class="arrow"></b></li>
						<li id="operationMistakeBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.operationMistake.operationMistakeBatch">
								<i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩批量导入 </a> <b
							class="arrow"></b></li>
						<li id="operationMistakeSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/standardVisit.operationMistake.operationMistakeSearch">
								<i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩查询 </a> <b
							class="arrow"></b></li>

					</ul></li>
			</ul></li>

		<li id="integral" class=""><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-desktop"></i> <span class="menu-text">
					积分管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>

			<ul class="submenu">
				<li id="integralBatch" class=""><a
					href="${pageContext.request.contextPath}/resource/integral.null.integralBatch">
						<i class="menu-icon fa fa-caret-right"></i>积分批量导入 </a> <b
					class="arrow"></b></li>
				<li id="integralSearch" class=""><a
					href="${pageContext.request.contextPath}/resource/integral.null.integralSearch">
						<i class="menu-icon fa fa-caret-right"></i>积分查询 </a> <b class="arrow"></b>
				</li>
			</ul></li>

		<li id="innovation" class=""><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-desktop"></i> <span class="menu-text">
					创新管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>

			<ul class="submenu">
				<li id="innovationSingle" class=""><a
					href="${pageContext.request.contextPath}/resource/innovation.null.innovationSingle">
						<i class="menu-icon fa fa-caret-right"></i>创新提案单条录入 </a> <b
					class="arrow"></b></li>
				<li id="innovationBatch" class=""><a
					href="${pageContext.request.contextPath}/resource/innovation.null.innovationBatch">
						<i class="menu-icon fa fa-caret-right"></i>创新提案批量导入 </a> <b
					class="arrow"></b></li>
				<li id="innovationSearch" class=""><a
					href="${pageContext.request.contextPath}/resource/innovation.null.innovationSearch">
						<i class="menu-icon fa fa-caret-right"></i>创新提案查询 </a> <b
					class="arrow"></b></li>
			</ul></li>

		<li id="praiseCriticism" class=""><a href="#"
			class="dropdown-toggle"> <i class="menu-icon fa fa-desktop"></i>
				<span class="menu-text"> 奖惩管理 </span> <b
				class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>
			<ul class="submenu">
				<li id="employee" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-list-alt"></i>员工奖惩信息管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="employeePraiseCriticismSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/praiseCriticism.employee.employeePraiseCriticismSingle">
								<i class="menu-icon fa fa-caret-right"></i>员工奖惩信息管理单条录入 </a> <b
							class="arrow"></b></li>
						<li id="employeePraiseCriticismBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/praiseCriticism.employee.employeePraiseCriticismBatch">
								<i class="menu-icon fa fa-caret-right"></i>员工奖惩信息管理批量导入 </a> <b
							class="arrow"></b></li>
						<li id="employeePraiseCriticismSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/praiseCriticism.employee.employeePraiseCriticismSearch">
								<i class="menu-icon fa fa-caret-right"></i>员工奖惩信息管理查询 </a> <b
							class="arrow"></b></li>
					</ul></li>
				<li id="businessHall" class=""><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-list-alt"></i>营业厅奖惩信息管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="businessHallPraiseCriticismSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/praiseCriticism.businessHall.businessHallPraiseCriticismSingle">
								<i class="menu-icon fa fa-caret-right"></i>营业厅奖惩信息单条录入 </a> <b
							class="arrow"></b></li>
						<li id="businessHallPraiseCriticismBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/praiseCriticism.businessHall.businessHallPraiseCriticismBatch">
								<i class="menu-icon fa fa-caret-right"></i>营业厅奖惩信息批量导入 </a> <b
							class="arrow"></b></li>
						<li id="businessHallPraiseCriticismSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/praiseCriticism.businessHall.businessHallPraiseCriticismSearch">
								<i class="menu-icon fa fa-caret-right"></i>营业厅奖惩信息查询 </a> <b
							class="arrow"></b></li>
					</ul></li>
			</ul></li>

		<li id="performance" class=""><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-desktop"></i> <span class="menu-text">
					绩效管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>
			<ul class="submenu">
				<li id="month" class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-list-alt"></i>月度绩效管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="monthPerformanceRemind" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.month.monthPerformanceRemind">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效未提交事项提醒 </a> <b
							class="arrow"></b></li>
						<li id="monthPerformanceOpen" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.month.monthPerformanceOpen">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效上传功能开通 </a> <b
							class="arrow"></b></li>
						<li id="monthPerformanceSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.month.monthPerformanceSingle">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效单条录入 </a> <b
							class="arrow"></b></li>
						<li id="monthPerformanceBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.month.monthPerformanceBatch">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效批量导入 </a> <b
							class="arrow"></b></li>
						<li id="monthPerformanceSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.month.monthPerformanceSearch">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效查询 </a> <b
							class="arrow"></b></li>
					</ul></li>
				<li id="" year class=""><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-list-alt"></i>年度绩效管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="yearPerformanceSingle" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.year.yearPerformanceSingle">
								<i class="menu-icon fa fa-caret-right"></i>年度绩效单条录入 </a> <b
							class="arrow"></b></li>
						<li id="yearPerformanceBatch" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.year.yearPerformanceBatch">
								<i class="menu-icon fa fa-caret-right"></i>年度绩效批量导入 </a> <b
							class="arrow"></b></li>
						<li id="yearPerformanceSearch" class=""><a
							href="${pageContext.request.contextPath}/resource/performance.year.yearPerformanceSearch">
								<i class="menu-icon fa fa-caret-right"></i>年度绩效查询 </a> <b
							class="arrow"></b></li>
					</ul></li>
			</ul></li>

		<li id="other" class=""><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-file-o"></i> <span class="menu-text">其他</span>

				<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="batchImportTempletList" class=""><a
					href="${pageContext.request.contextPath}/resource/other.null.batchImportTempletList">
						<i class="menu-icon fa fa-caret-right"></i>批量导入模板下载 </a> <b
					class="arrow"></b></li>
				<li id="otherSystemSetting" class=""><a
					href="${pageContext.request.contextPath}/resource/other.null.otherSystemSetting">
						<i class="menu-icon fa fa-caret-right"></i>系统设定 </a> <b class="arrow"></b>
				</li>
			</ul></li>

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
		try {
			ace.settings.check('sidebar', 'collapsed')
		} catch (e) {
		}
	</script>
</div>


<!-- /section:basics/sidebar -->

