<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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

<script language="javascript">
	function doConfirm()
	{
		if(confirm("确定修改的信息正确吗？"))
		{
			location.href="integralSearch.html";
		}
		return;
	}
	function doSelectSingleBusinessHall()
	{
		window.open('../selectSingleBusinessHall.html', 'newwindow', 'height=600, width=1000, top=200, left=200, toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	}
	
	function doSelectSingleEmployee()
	{
		window.open('../SelectSingleEmployee.html', 'newwindow', 'height=600, width=1000, top=200, left=200, toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	}
</script>

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
							<form name="form1">
		<table  cellspacing="0" cellpadding="0" class="tablewk" align="center">
			<tr>
				<td >
					<br />
					<table cellpadding="0" cellspacing="0" width="95%" style="height: 30px" align="center">
						<tr>
							<td class=" titlebold">积分修改</td>
						</tr>
					</table>
					<table cellpadding="0" cellspacing="0" width="95%"  align="center">
						<tr>
							<td class="line"></td>
						</tr>
					</table>
					<br />
					<table cellpadding="0" cellspacing="0" class="tableserch" align="center" style="width:95%">
						<tr>
							<td>
								<br />
								<table cellpadding="0" cellspacing="0"  align="center" style="width:95%">
									<tr>
										<td class="tablelist_title" align="right" style="width:10%">区域：</td>
										<td style="height: 29px; width: 959px;" >
											<input type="text" name="areaName" disabled class="inputdisabled" value="城东" />
										</td>
									</tr>
									<tr>
										<td class="tablelist_title" align="right" style="width:10%">营业厅编码：</td>
										<td style="height: 29px; width: 959px;" >
											<input type="text" name="hallName" disabled class="inputdisabled" value="A001" />
										</td>
									</tr>
									<tr>
										<td class="tablelist_title" align="right" style="width:10%">营业厅名称：</td>
									  <td style="height: 29px; width: 959px;" >
										<input type="text" name="employeeName" disabled class="inputdisabled" value="中山北路营业厅" /></td>
									</tr>
									<tr>
										<td class="tablelist_title" align="right" style="width:10%">员工：</td>
										<td style="height: 29px; width: 959px;" >
											<input type="text" name="employeeName" disabled class="inputdisabled" value="陈园园" />
											<input type="button" value="选择员工" class="btn_select_4" onclick="javascript:doSelectSingleEmployee();"/>
										</td>
									</tr>
									<tr>
										<td class="tablelist_title"  align="right">操作工号：</td>
										<td style="width: 959px" >
											<input type="text" name="companyNum" disabled class="inputdisabled" value="100898"/>
										</td>
									</tr>
									<tr>
										<td class="tablelist_title"  align="right">身份证号：</td>
										<td style="width: 959px" >
											<input type="text" name="idNum" disabled class="inputdisabled" value="320598481202210611"/>
										</td>
									</tr>									
									<tr>
										<td class="tablelist_title" align="right">操作日期：</td>
										<td style="width: 959px" >
											<input type="text" name="examTime" value="2007-02-01" readonly onclick="getDayString(this)"/>
										</td>
									</tr>
									<tr>
										<td class="tablelist_title" align="right" >用户手机号：</td>
										<td style="width: 959px" >
											<input type="text" name="grade" value="13057061234" />
										</td>
									</tr>
									<tr>
										<td class="tablelist_title" align="right" >业务类型：</td>
										<td style="width: 959px" >
											<input type="text" name="grade" value="神州行入网" />
										</td>
									</tr>
									<tr>
										<td class="tablelist_title" align="right" >处罚结果：</td>
										<td style="width: 959px" ><textarea name="textarea" rows="5">扣5分</textarea></td>
									</tr>
									<tr>
										<td>&nbsp;&nbsp;&nbsp;&nbsp; </td>
										<td style="width: 959px">
											<input type="button" name="goConfirmButton" value="确定" onclick="javascript:doConfirm();" class="btn_2"/>
											<input type="reset" value="重置" class="btn_2"/>
											<input type="button" name="doSingleButton" value="返回" class="btn_2" onclick="location.href='integralSearch.html'"/>
										</td>
									</tr>
								</table>
								<br />
							</td>
						</tr>
					</table>
					<br />
					<br />
				</td>
			</tr>
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
	
	<!-- inline scripts related to this page -->
	<script>
		
	</script>
</body>
</html>