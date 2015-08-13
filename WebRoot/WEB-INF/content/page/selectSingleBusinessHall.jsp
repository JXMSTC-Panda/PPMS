<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Language" content="en-us" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<base target="main" />
<link rel="stylesheet" type="text/css" href="../css/frontmiddle.css" />
<script language="javascript">
</script>
<script src="../js/Calendar.js" type="text/javascript"></script>
</head>

<body>
	<table  cellspacing="0" cellpadding="0" class="tablewk" align="center">
		<tr>
			<td >
				<br />
				<table cellpadding="0" cellspacing="0" width="95%" style="height: 30px" align="center">
					<tr>
						<td class=" titlebold">营业厅查询</td>
					</tr>
				</table>
				<table cellpadding="0" cellspacing="0" width="95%"  align="center">
					<tr>
						<td class="line"></td>
					</tr>
				</table>
				<br />
				<form name="form1">
					<table cellpadding="0" cellspacing="0" width="95%"  align="center" class="tableserch">
						<tr>
							<td align="right">区域：</td>
							<td align="left">
								<select name="select" style="width:155px;">
									<option value="0"></option>
									<option value="1">城东</option>
									<option value="2">城南</option>
									<option value="3">城西</option>
									<option value="4">城北</option>
								</select>
							</td>
							<td align="right">片区：</td>
							<td align="left">
								<select name="select2" style="width:155px;">
									<option value="0"></option>
									<option value="1">鼓楼区</option>
									<option value="2">白下区</option>
									<option value="3">下关区</option>
									<option value="4">鼓楼区</option>
								</select>
							</td>
						</tr>
						<tr>
							<td align="right">营业厅编码：</td>
							<td align="left"><input type="text" name="businessHallCode" /></td>
							<td align="right">营业厅名称：</td>
							<td align="left"><input type="text" name="businessHallName" /></td>
						</tr>
						<tr>
							<td colspan="4" align="center">
								<input name="Button1" type="button" value="查询" class="btn_2" />
								<input name="Button2" type="reset" value="重置" class="btn_2" />
							</td>
						</tr>
					</table>
				</form>
				<form name="form1" action="praiseCriticism.businessHall.businessHallPraiseCriticismSingle.do" method="post">
				<br />
				<table cellpadding="0" cellspacing="0" class="tablelist" align="center">
					<tr>
						<th>&nbsp;</th>
						<th>序号</th>
						<th>营业厅编码</th>
						<th>营业厅名称</th>
						<th>区域</th>
						<th>片区</th>
					</tr>	
				<c:forEach items="${requestScope.organizationNjInfor}" var="organizationNj">
					<tr>
							<td><input type="radio" name="selectBusinessHall" value="${organizationNj.orgid}" checked></td>
							<td>1</td>
                        	<td>${organizationNj.orgid}</td>
							<td>${organizationNj.org_Name}</td>
							<td>${requestScope.areadesc}</td>
							<td>${requestScope.subareaDesc}</td>
					</tr>	
				</c:forEach>
				</table>
				<table style="width: 95%" cellspacing="0" cellpadding="0" align="center">
					<tr>
						<td  class="page" >
							&nbsp;共5页 当前第1页 
							<a href="#">首页</a> 
							<a href="#">上一页</a> 
							<a href="#">下一页</a> 
							<a href="#">末页</a>
						</td>
					</tr>
				</table>
				<br />
				<table cellpadding="0" cellspacing="0" width="95%" align="center">
					<tr>
						<td align="center" >
							<input type="submit" name="doSelectButton" value="确定" class="btn_2" />
							<input type="button" name="doCloseButton" value="关闭" class="btn_2" onclick="window.close();"/>
						</td>
					</tr>
				</table>
				<br />
				</form>
			</td>
		</tr>
	</table>
</body>
</html>
