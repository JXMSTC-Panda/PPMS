<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<link rel="stylesheet" type="text/css" href="../css/frontmiddle.css" />
<script language="javascript">
	function doOpenDetail()
	{
		window.open('userInfo/userBaseInfo/userBaseInfoDetail.html', 'detailwindow', 'height=600, width=1000, top=200, left=200, toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	}
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
						<td class=" titlebold">员工查询</td>
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
						<td align="center" >
							<table  cellpadding="0" cellspacing="0" width="95%">								
								<tr>
									<td align="right">区域：</td>
									<td align="left">
										<select name="area" style="width:80px;">
											<option value="0"></option>
											<option value="1">东区</option>
											<option value="2">南区</option>
											<option value="3">西区</option>
											<option value="4">北区</option>
										</select>
									</td>
									<td align="right">片区：</td>
									<td align="left">
										<select name="area" style="width:156px;">
											<option value="0"></option>
											<option value="1">鼓楼区</option>
											<option value="2">下关区</option>
											<option value="3">浦口区</option>
										</select>
									</td>	
									<td align="right">营业厅名称：</td>
									<td align="left"><input type="text" name="businessHall"></td>
								</tr>
								<tr>									
									<td align="right">进公司时间：</td>
									<td align="left">
										<input type="text" name="comeInTimeBegin" onclick="getDayString(this)" readonly style="width:80px">
										～

										<input type="text" name="comeInTimeEnd" onclick="getDayString(this)" readonly style="width:80px">
									</td>								
									<td align="right">姓名：</td>
									<td align="left"><input type="text" name="employeeName"></td>
									<td align="right">工号：</td>
									<td align="left">
										<input type="text" name="companyNum">
									</td>
								</tr>
								<tr>
									<td align="right">性别：</td>
									<td align="left">
										<input type="radio" name="sex" value="0" checked>全部
										<input type="radio" name="sex" value="0" >男

										<input type="radio" name="sex" value="1">女

									</td>
									<td align="right">身份证号：</td>
									<td align="left"><input type="text" name="idNum"></td>
									<td align="right">联系电话：</td>
									<td align="left"><input type="text" name="tel"></td>
								</tr>
								<tr>
									<td align="right">居住地址：</td>
									<td align="left"><input type="text" name="address" style="width:210px"></td>	
									<td align="right">长号：</td>
									<td align="left"><input type="text" name="longNum"></td>
									<td align="right">短号：</td>
									<td align="left"><input type="text" name="shortNum"></td>
								</tr>
								<tr>
									<td align="right">岗职：</td>
									<td align="left">
										<select name="area" style="width:160px;">
											<option value="0"></option>
											<option value="1">营业员</option>
											<option value="2">值班经理</option>
											<option value="3">店长</option>
											<option value="4">营销经理助理</option>
										</select>
									</td>
									<td align="right">岗位：</td>
									<td align="left">
										<select name="area" style="width:156px;">
											<option value="0"></option>
											<option value="1">营业员</option>
											<option value="2">熟练营业员</option>
											<option value="3">投诉处理</option>
											<option value="4">帐务稽核</option>
											<option value="5">实习值班经理</option>
										</select>
									</td>
									<td align="right">人员类别：</td>
									<td align="left">
										<select name="employeeType" style="width:156px;">
											<option value="0"></option>
											<option value="1">普通员工</option>
											<option value="2">炼金生</option>
											<option value="3">储备店长</option>
											<option value="4">客服代表</option>
										</select>
									</td>
								</tr>
								<tr>
									<td colspan="6">
										<input name="Button1" type="button" value="查询" class="btn_2" />&nbsp;
										<input name="Button2" type="reset" value="重置" class="btn_2" />
									</td>
								</tr>
							</table>							
						</td>
					</tr>
				</table>
				</form>
				<br />
				<table cellpadding="0" cellspacing="0" class="tablelist" align="center">
					<tr>
						<th>&nbsp;</th>
						<th>序号</th>
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
					<tr>
						<td><input type="radio" name="selectEmployee" value="0" checked></td>
						<td>1</td>
						<td>0011</td>
						<td><a href="javascript:doOpenDetail();">张三</a></td>
						<td>123456789012345678</td>
						<td>东区</td>
						<td>12345</td>
						<td>鼓楼营业厅</td>
						<td>男</td>
						<td>1981年07月</td>
						<td>营业员</td>
						<td>熟练营业员</td>
					</tr>	
					<tr>
						<td><input type="radio" name="selectEmployee" value="1"></td>
						<td>2</td>
						<td>0011</td>
						<td><a href="javascript:doOpenDetail();">张三</a></td>
						<td>123456789012345678</td>
						<td>东区</td>
						<td>12345</td>
						<td>鼓楼营业厅</td>
						<td>男</td>
						<td>1981年07月</td>
						<td>营业员</td>
						<td>熟练营业员</td>
					</tr>	
					<tr>
						<td><input type="radio" name="selectEmployee" value="2"></td>
						<td>3</td>
						<td>0011</td>
						<td><a href="javascript:doOpenDetail();">张三</a></td>
						<td>123456789012345678</td>
						<td>东区</td>
						<td>12345</td>
						<td>鼓楼营业厅</td>
						<td>男</td>
						<td>1981年07月</td>
						<td>营业员</td>
						<td>熟练营业员</td>
					</tr>	
					<tr>
						<td><input type="radio" name="selectEmployee" value="3"></td>
						<td>4</td>
						<td>0011</td>
						<td><a href="javascript:doOpenDetail();">张三</a></td>
						<td>123456789012345678</td>
						<td>东区</td>
						<td>12345</td>
						<td>鼓楼营业厅</td>
						<td>男</td>
						<td>1981年07月</td>
						<td>营业员</td>
						<td>熟练营业员</td>
					</tr>	
					<tr>
						<td><input type="radio" name="selectEmployee" value="4"></td>
						<td>5</td>
						<td>0011</td>
						<td><a href="javascript:doOpenDetail();">张三</a></td>
						<td>123456789012345678</td>
						<td>东区</td>
						<td>12345</td>
						<td>鼓楼营业厅</td>
						<td>男</td>
						<td>1981年07月</td>
						<td>营业员</td>
						<td>熟练营业员</td>
					</tr>	
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
							<input type="button" name="doSelectButton" value="确定" class="btn_2" onclick="window.close();"/>
							<input type="button" name="doCloseButton" value="关闭" class="btn_2" onclick="window.close();"/>
						</td>
					</tr>
				</table>
				<br />
			</td>
		</tr>
	</table>
</body>
</html>