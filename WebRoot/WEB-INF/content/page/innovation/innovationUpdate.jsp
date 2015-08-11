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
	function doConfirm()
	{
		if(confirm("确定修改的信息正确吗？"))
		{
			location.href="innovationSearch.html";
		}
		return;
	}

	function doDisable(objNameDisabled , objNameEnabled)
	{
		var objBtnDisabled = document.all[objNameDisabled];
		var objBtnEnabled = document.all[objNameEnabled]; 
		objBtnDisabled.disabled = true ;
		objBtnEnabled.disabled = false ;
	}

	function doSelectSingleBusinessHall()
	{
		window.open('../selectSingleBusinessHall.html', 'newwindow', 'height=600, width=1000, top=200, left=200, toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	}
	function doSelectSingleEmployee()
	{
		window.open('../selectSingleEmployee.html', 'newwindow', 'height=600, width=1000, top=200, left=200, toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	}
</script>
<script src="../../js/Calendar.js" type="text/javascript"></script>
</head>
<body>
<form name="form1">
  <table  cellspacing="0" cellpadding="0" class="tablewk" align="center">
    <tr>
      <td ><br />
        <table cellpadding="0" cellspacing="0" width="95%" style="height: 30px" align="center">
          <tr>
            <td class=" titlebold">创新提案修改</td>
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
            <td><br />
              <table cellpadding="0" cellspacing="0"  align="center" style="width:95%">
                <tr>
                  <td class="tablelist_title" align="right" >创新类型：</td>
                  <td style="width: 959px" >个人创新</td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" style="width:10%">区域：</td>
                  <td style="height: 29px; width: 959px;" ><input name="areaName" type="text" disabled class="inputdisabled">
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" style="width:10%">营业厅编码：</td>
                  <td style="height: 29px; width: 959px;" ><input type="text" name="hallName" disabled="disabled" class="inputdisabled" /></td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" style="width:10%">营业厅名称：</td>
                  <td style="height: 29px; width: 959px;" ><input type="text" name="employeeName" disabled class="inputdisabled">
                    <input type="button" value="选择营业厅" class="btn_select_5" onclick="javascript:doSelectSingleBusinessHall();" disabled=true id="btnHall" />
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" style="width:10%">员工：</td>
                  <td style="height: 29px; width: 959px;" ><input name="employeeName" type="text" disabled class="inputdisabled" value="王小二">
                    <input type="button" value="选择员工" class="btn_select_4" onclick="javascript:doSelectSingleEmployee();" id="btnPerson" />
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title"  align="right">工号：</td>
                  <td style="width: 959px" ><input name="companyNum" type="text" disabled class="inputdisabled" value="100898"/>
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title"  align="right">身份证号：</td>
                  <td style="width: 959px" ><input name="idNum" type="text" disabled class="inputdisabled" value="320684197203210611"/>
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" >创新方案：</td>
                  <td style="width: 959px" ><textarea name="textarea" rows="5" style="width:150px">关于GPRS计费方式的建议

</textarea>
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right">评定时间：</td>
                  <td style="width: 959px" ><input name="examTime" type="text" onclick="getDayString(this)" value="2007-12-03" readonly/>
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" >部门核定结果：</td>
                  <td style="width: 959px" ><input name="grade" type="text" value="2008年一季度创新奖"/>
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" >层级：</td>
                  <td style="width: 959px" ><select name="ss" >
                      <option value="部门">部门</option>
                      <option value="区域">区域</option>
                    </select >
                  </td>
                </tr>
                <tr>
                  <td class="tablelist_title" align="right" >奖励方式：</td>
                  <td style="width: 959px" >
				  		<input type="checkbox" name="checkbox" value="checkbox" />
						个人成长档案加分<br />
                      	<input type="checkbox" name="checkbox2" value="checkbox" />
                      	个人月度绩效<br />
           		  		<input type="checkbox" name="checkbox3" value="checkbox" />
           		  		经费奖励
				  </td>
                </tr>
                <tr>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp; </td>
                  <td style="width: 959px"><input type="button" name="goConfirmButton" value="确定" onclick="javascript:doConfirm();" class="btn_2"/>
                    <input type="reset" value="重置" class="btn_2"/>
                    <input type="button" name="doSingleButton" value="返回" class="btn_2" onclick="location.href='innovationSearch.html'"/>
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
</body>
</html>
