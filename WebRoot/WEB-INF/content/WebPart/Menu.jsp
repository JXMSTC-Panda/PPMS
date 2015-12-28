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
		<li id="tachometer" class="">
			<a href="index.tachometer.do" class="">
				<i class="menu-icon fa fa-tachometer"></i>
				<span class="menu-text">控制台</span>
				<b class="arrow"></b>
			</a>
			<b cite="arrow"></b>
		</li>
		<li id="authority" name="menu1" class="hidden"><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-unlock-alt"></i> <span class="menu-text">
					权限管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="roleSingle" name="menu11" class="hidden"><a
					href="authority.null.roleSingle.do">
						<i class="menu-icon fa fa-caret-right"></i>角色增加 </a> <b class="arrow"></b>
				</li>
				<li id="roleSearch" name="menu12" class="hidden"><a
					href="authority.null.roleSearch.do">
						<i class="menu-icon fa fa-caret-right"></i>角色查询 </a> <b class="arrow"></b>
				</li>
			</ul></li>

		<li id="userInfo" name="menu2" class="hidden"><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-users"></i> <span class="menu-text">
					人员综合信息管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="userBase" name="menu21" class="hidden">
					<a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>人员基本信息管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="userBaseInfoSingle" name="menu211" class="hidden"><a
							href="userInfo.userBase.userBaseInfoSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="userBaseInfoBatch" name="menu212" class="hidden"><a
							href="userInfo.userBase.userBaseInfoBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息批量录入 </a> <b
							class="arrow"></b>
						</li>
						<!-- <li id="userBaseInfoBatchUpdateBySelectField" class="hidden"><a
							href="userInfo.userBase.userBaseInfoBatchUpdateBySelectField.do">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息批量修改 </a> <b
							class="arrow"></b>
						</li> -->
						<li id="userBaseInfoSearch" class="hidden"><a
							href="userInfo.userBase.userBaseInfoSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>人员基本信息查詢 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>

				<li id="growthFile" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>员工成长档案查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="individualGrowthFileSearch" class="hidden"><a
							href="userInfo.growthFile.individualGrowthFileSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>个人成长线路查询 </a> <b
							class="arrow"></b>
						</li>
						<li id="personnelGrowthFileSearch" class="hidden"><a
							href="userInfo.growthFile.personnelGrowthFileSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>人员阶段查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>

				<li id="changeHall" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>人员调厅记录查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="changeHallSearch" class="hidden"><a
							href="userInfo.changeHall.changeHallSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>人员调厅记录查询 </a> <b
							class="arrow"></b>
						</li>
						<li id="businessHallSearch" class="hidden"><a
							href="userInfo.changeHall.businessHallSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>营业厅信息查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>

				<li id="hallKeeperExam" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>店长测评、进阶查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="hallKeeperExamSearch" class="hidden"><a
							href="userInfo.hallKeeperExam.hallKeeperExamSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>店长测评查询 </a> <b
							class="arrow"></b>
						</li>
						<li id="hallKeeperForwardSearch" class="hidden"><a
							href="userInfo.hallKeeperExam.hallKeeperForwardSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>店长进阶查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>

				<li id="managerExam" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>值班经理测评、进阶查询
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="managerExamSearch" class="hidden"><a
							href="userInfo.managerExam.managerExamSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>值班经理测评查询 </a> <b
							class="arrow"></b>
						</li>
						<li id="managerForwardSearch" class="hidden"><a
							href="userInfo.managerExam.managerForwardSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>值班经理进阶查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>

				<li id="mountGuardCard" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>合作厅上岗证管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="mountGuardCardSingle" class="hidden"><a
							href="userInfo.mountGuardCard.mountGuardCardSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>合作厅上岗证单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="mountGuardCardBatch" class="hidden"><a
							href="userInfo.mountGuardCard.mountGuardCardBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>合作厅上岗批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="mountGuardCardSearch" class="hidden"><a
							href="userInfo.mountGuardCard.mountGuardCardSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>合作厅上岗证查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>
			</ul>
		</li>

		<li id="employeeTrainExam" class="hidden"><a href="#"
			class="dropdown-toggle"> <i class="menu-icon fa fa-pencil-square-o"></i>
				<span class="menu-text"> 员工培训/考试管理 </span> <b
				class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="monthExam" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>月度考核管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="monthExamSingle" class="hidden"><a
							href="employeeTrainExam.monthExam.monthExamSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>月度考试单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="monthExamBatch" class="hidden"><a
							href="employeeTrainExam.monthExam.monthExamBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>月度考试批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="monthExamSearch" class="hidden"><a
							href="employeeTrainExam.monthExam.monthExamSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>月度考试查詢 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>

				<li id="operationTrain" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>业务培训管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="operationTrainSingle" class="hidden"><a
							href="employeeTrainExam.operationTrain.operationTrainSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>业务培训单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="operationTrainBatch" class="hidden"><a
							href="employeeTrainExam.operationTrain.operationTrainBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>业务培训批量录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="operationTrainSearch" class="hidden"><a
							href="employeeTrainExam.operationTrain.operationTrainSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>业务培训查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>

				<li id="promoteTrain" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>进阶培训管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="promoteTrainSingle" class="hidden"><a
							href="employeeTrainExam.promoteTrain.promoteTrainSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>进阶培训单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="promoteTrainBatch" class="hidden"><a
							href="employeeTrainExam.promoteTrain.promoteTrainBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>进阶培训批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="promoteTrainSearch" class="hidden"><a
							href="employeeTrainExam.promoteTrain.promoteTrainSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>进阶培训查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>

				<li id="freshEmployeeExam" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>新员工/转正考核
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="freshEmployeeExamSingle" class="hidden"><a
							href="employeeTrainExam.freshEmployeeExam.freshEmployeeExamSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>新员工考核成绩单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="freshEmployeeExamBatch" class="hidden"><a
							href="employeeTrainExam.freshEmployeeExam.freshEmployeeExamBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>新员工考核成绩批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="freshEmployeeExamSearch" class="hidden"><a
							href="employeeTrainExam.freshEmployeeExam.freshEmployeeExamSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>新员工考核成绩查询 </a> <b
							class="arrow"></b>
						</li>
						<li id="becomeEmployeeSingle" class="hidden"><a
							href="employeeTrainExam.freshEmployeeExam.becomeEmployeeSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>转正考核成绩单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="becomeEmployeeBatch" class="hidden"><a
							href="employeeTrainExam.freshEmployeeExam.becomeEmployeeBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>转正考核成绩批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="becomeEmployeeSearch" class="hidden"><a
							href="employeeTrainExam.freshEmployeeExam.becomeEmployeeSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>转正考核成绩查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>
			</ul>
		</li>

		<li id="standardVisit" class="hidden"><a href="#"
			class="dropdown-toggle"> <i class="menu-icon fa fa-eye"></i>
				<span class="menu-text"> 标准化和暗访管理 </span> <b
				class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="standard" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="standardSingle" class="hidden"><a
							href="standardVisit.standard.standardSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="standardBatch" class="hidden"><a
							href="standardVisit.standard.standardBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="standardSearch" class="hidden"><a
							href="standardVisit.standard.standardSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>标准化检查成绩查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>

				<li id="monitor" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>监控检查成绩管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="monitorSingle" class="hidden"><a
							href="standardVisit.monitor.monitorSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>监控检查成绩单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="monitorBatch" class="hidden"><a
							href="standardVisit.monitor.monitorBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>监控检查成绩批量录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="monitorSearch" class="hidden"><a
							href="standardVisit.monitor.monitorSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>监控检查成绩查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>

				<li id="visit" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="visitSingle" class="hidden"><a
							href="standardVisit.visit.visitSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="visitBatch" class="hidden"><a
							href="standardVisit.visit.visitBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="visitSearch" class="hidden"><a
							href="standardVisit.visit.visitSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>暗访检查成绩查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>

				<li id="operationMistake" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="operationMistakeSingle" class="hidden"><a
							href="standardVisit.operationMistake.operationMistakeSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="operationMistakeBatch" class="hidden"><a
							href="standardVisit.operationMistake.operationMistakeBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="operationMistakeSearch" class="hidden"><a
							href="standardVisit.operationMistake.operationMistakeSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>业务差错检查成绩查询 </a> <b
							class="arrow"></b>
						</li>

					</ul>
				</li>
			</ul>
		</li>

		<li id="integral" class="hidden"><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-cube"></i> <span class="menu-text">
					积分管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>

			<ul class="submenu">
				<li id="integralBatch" class="hidden"><a
					href="integral.null.integralBatch.do">
						<i class="menu-icon fa fa-caret-right"></i>积分批量导入 </a> <b
					class="arrow"></b>
				</li>
				<li id="integralSearch" class="hidden"><a
					href="integral.null.integralSearch.do">
						<i class="menu-icon fa fa-caret-right"></i>积分查询 </a> <b class="arrow"></b>
				</li>
			</ul>
		</li>

		<li id="innovation" class="hidden"><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-flask"></i> <span class="menu-text">
					创新管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>

			<ul class="submenu">
				<li id="innovationSingle" class="hidden"><a
					href="innovation.null.innovationSingle.do">
						<i class="menu-icon fa fa-caret-right"></i>创新提案单条录入 </a> <b
					class="arrow"></b>
				</li>
				<li id="innovationBatch" class="hidden"><a
					href="innovation.null.innovationBatch.do">
						<i class="menu-icon fa fa-caret-right"></i>创新提案批量导入 </a> <b
					class="arrow"></b>
				</li>
				<li id="innovationSearch" class="hidden"><a
					href="innovation.null.innovationSearch.do">
						<i class="menu-icon fa fa-caret-right"></i>创新提案查询 </a> <b
					class="arrow"></b>
				</li>
			</ul>
		</li>

		<li id="praiseCriticism" class="hidden"><a href="#"
			class="dropdown-toggle"> <i class="menu-icon fa fa-thumbs-up"></i>
				<span class="menu-text"> 奖惩管理 </span> <b
				class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>
			<ul class="submenu">
				<li id="employee" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-list-alt"></i>员工奖惩信息管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="employeePraiseCriticismSingle" class="hidden"><a
							href="praiseCriticism.employee.employeePraiseCriticismSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>员工奖惩信息管理单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="employeePraiseCriticismBatch" class="hidden"><a
							href="praiseCriticism.employee.employeePraiseCriticismBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>员工奖惩信息管理批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="employeePraiseCriticismSearch" class="hidden"><a
							href="praiseCriticism.employee.employeePraiseCriticismSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>员工奖惩信息管理查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>
				<li id="businessHall" class="hidden"><a href="#"
					class="dropdown-toggle"> <i class="menu-icon fa fa-list-alt"></i>营业厅奖惩信息管理
						<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="businessHallPraiseCriticismSingle" class="hidden"><a
							href="praiseCriticism.businessHall.businessHallPraiseCriticismSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>营业厅奖惩信息单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="businessHallPraiseCriticismBatch" class="hidden"><a
							href="praiseCriticism.businessHall.businessHallPraiseCriticismBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>营业厅奖惩信息批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="businessHallPraiseCriticismSearch" class="hidden"><a
							href="praiseCriticism.businessHall.businessHallPraiseCriticismSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>营业厅奖惩信息查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>
			</ul>
		</li>

		<li id="performance" class="hidden"><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-line-chart"></i> <span class="menu-text">
					绩效管理 </span> <b class="arrow fa fa-angle-down"></b> </a> <b cite="arrow"></b>
			<ul class="submenu">
				<li id="month" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-list-alt"></i>月度绩效管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<!-- <li id="monthPerformanceRemind" class="hidden"><a
							href="performance.month.monthPerformanceRemind.do">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效未提交事项提醒 </a> <b
							class="arrow"></b>
						</li> -->
						<li id="monthPerformanceOpen" class="hidden"><a
							href="performance.month.monthPerformanceOpen.do">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效上传功能开通 </a> <b
							class="arrow"></b>
						</li>
						<li id="monthPerformanceSingle" class="hidden"><a
							href="performance.month.monthPerformanceSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="monthPerformanceBatch" class="hidden"><a
							href="performance.month.monthPerformanceBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="monthPerformanceSearch" class="hidden"><a
							href="performance.month.monthPerformanceSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>月度绩效查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>
				<li id="year" class="hidden"><a href="#" class="dropdown-toggle">
						<i class="menu-icon fa fa-list-alt"></i>年度绩效管理 <b
						class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

					<ul class="submenu">
						<li id="yearPerformanceSingle" class="hidden"><a
							href="performance.year.yearPerformanceSingle.do">
								<i class="menu-icon fa fa-caret-right"></i>年度绩效单条录入 </a> <b
							class="arrow"></b>
						</li>
						<li id="yearPerformanceBatch" class="hidden"><a
							href="performance.year.yearPerformanceBatch.do">
								<i class="menu-icon fa fa-caret-right"></i>年度绩效批量导入 </a> <b
							class="arrow"></b>
						</li>
						<li id="yearPerformanceSearch" class="hidden"><a
							href="performance.year.yearPerformanceSearch.do">
								<i class="menu-icon fa fa-caret-right"></i>年度绩效查询 </a> <b
							class="arrow"></b>
						</li>
					</ul>
				</li>
			</ul>
		</li>

		<li id="other" class="hidden"><a href="#" class="dropdown-toggle">
				<i class="menu-icon fa fa-file"></i> <span class="menu-text">其他</span>

				<b class="arrow fa fa-angle-down"></b> </a> <b class="arrow"></b>

			<ul class="submenu">
				<li id="batchImportTempletList" class="hidden"><a
					href="other.null.batchImportTempletList.do">
						<i class="menu-icon fa fa-caret-right"></i>批量导入模板下载 </a> <b
					class="arrow"></b>
				</li>
				<!-- <li id="otherSystemSetting" class="hidden"><a
					href="other.null.otherSystemSetting.do">
						<i class="menu-icon fa fa-caret-right"></i>系统设定 </a> <b class="arrow"></b>
				</li> -->
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
		try {
			ace.settings.check('sidebar', 'collapsed')
		} catch (e) {
		}
	</script>
	
</div>


<!-- /section:basics/sidebar -->
