<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Language" content="en-us" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<base target="main" />
<link rel="stylesheet" type="text/css" href="../../css/frontmiddle.css" />
<script language="javascript">	
</script>
<script src="../../js/Calendar.js" type="text/javascript"></script>
</head>

<body>
	<form name="form1">
		<table  cellspacing="0" cellpadding="0" class="tablewk" align="center">
			<tr>
				<td >
					<br />
					<table cellpadding="0" cellspacing="0" width="95%" style="height: 30px" align="center">
						<tr>
							<td class=" titlebold">创新提案批量导入结果</td>
						</tr>
					</table>
					<table cellpadding="0" cellspacing="0" width="95%"  align="center">
						<tr>
							<td class="line"></td>
						</tr>
					</table>
					<br />					
					<table cellpadding="0" cellspacing="0" class="tablelist" align="center">
						<tr>
							<td align="center" colspan="16">共上传5条数据，成功3条，失败2条！</td>
						</tr>
						<tr>
							<th>序号</th>
							<th>工号</th>
							<th>姓名</th>
							<th>身份证号</th>
							<th>营业厅编码</th>
							<th>营业厅名称</th>
							<th>创新方案</th>
							<th>创新类型</th>
							<th nowrap="nowrap">评定时间</th>
							<th>部门核定结果</th>
							<th>层级</th>
							<th>奖励方式</th>
							<th>上传结果</th>
							<th>失败原因</th>
						</tr>
						<tr>
							<td>1</td>
							<td>100980</td>
							<td nowrap="nowrap">张三</td>
							<td>320681117302210611</td>
							<td>A001</td>
							<td>湖南路营业员厅</td>
							<td>关于GPRS计费方式的建议</td>
							<td>团队创新</td>
							<td nowrap="nowrap">2007-01-02</td>
							<td>2007年一季度创新奖</td>	
							<td>部门</td>
							<td>个人成长档案加分</td>		
							<td><font color=red>失败</font></td>
							<td><font color=red>身份证号不正确！</font></td>
						</tr>
						<tr>
							<td>2</td>
							<td>100981</td>
							<td nowrap="nowrap">王五</td>
							<td>320684567302210611</td>
							<td>A002</td>
							<td>中山北路营业员厅</td>
							<td>关于动感地带的短信包月</td>
							<td>团队创新</td>
							<td nowrap="nowrap">2007-02-05</td>
							<td>2007年一季度创新奖</td>
							<td>区域</td>
							<td>个人月度绩效</td>		
							<td><font color=red>失败</font></td>
							<td><font color="red">身份证号不正确！</font></td>
						</tr>
						<tr>
							<td>3</td>
							<td>100982</td>
							<td nowrap="nowrap">陈园</td>
							<td>320612397302210611</td>
							<td>A003</td>
							<td>山西路营业员厅</td>
							<td>关于全球通入网</td>
							<td>个人创新</td>
							<td nowrap="nowrap">2007-03-16</td>
							<td>2007年一季度创新奖</td>	
							<td>部门</td>
							<td>经费奖励</td>	
							<td>成功</td>
							<td>&nbsp;</td>
						</tr>	
						<tr>
							<td>4</td>
							<td>100983</td>
							<td nowrap="nowrap">李小民</td>
							<td>320687897302210611</td>
							<td>A004</td>
							<td>大桥南路营业员厅</td>
							<td>关于GRPS下载</td>
							<td>个人创新</td>
							<td nowrap="nowrap">2007-04-17</td>
							<td>2007年二季度创新奖</td>
							<td>部门</td>
							<td>个人成长档案加分/个人月度绩效</td>		
							<td>成功</td>
							<td>&nbsp;</td>
						</tr>		
						<tr>
							<td>5</td>
							<td>100984</td>
							<td nowrap="nowrap">赵紫阳</td>
							<td>320684137302210611</td>
							<td>A005</td>
							<td>桥北路营业员厅</td>
							<td>关于手机销售</td>
							<td>个人创新</td>
							<td nowrap="nowrap">2007-05-18</td>
							<td>2007年二季度创新奖</td>	
							<td>部门</td>
							<td>个人月度绩效/经费奖励</td>	
							<td>成功</td>
							<td>&nbsp;</td>
						</tr>		
					</table>
					<br />
					<table cellpadding="0" cellspacing="0" width="95%" align="center">
						<tr>
							<td align="center" >
								<input type="button" name="goContinueButton" value="继续导入" class="btn_5" onclick="location.href='innovationBatch.html'"/>
								<input type="button" name="goSearchButton" value="转至查询" class="btn_5" onclick="location.href='innovationSearch.html'"/>
							</td>
						</tr>
					</table>
				</form>
				<br />
			</td>
		</tr>
	</table>
</body>
</html>