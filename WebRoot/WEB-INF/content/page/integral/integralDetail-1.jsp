<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
		
		<script language="javascript">	
	function doDelete()
	{
		if(confirm("确定要删除吗？"))
		{
			location.href="integralSearch.html";
		}
		return;
	}
</script>
<script src="${pageContext.request.contextPath}/assets/js/Calendar.js" type="text/javascript"></script>
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
							<form name="form1">
  <table  cellspacing="0" cellpadding="0" class="tablewk" align="center">
  <tr>
    <td ><br />
      <table cellpadding="0" cellspacing="0" width="95%" style="height: 30px" align="center">
        <tr>
          <td class=" titlebold">积分(主厅)明细</td>
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
          <th>区域</th>
          <th>工号</th>
          <th>姓名</th>
          <th>营业厅编码</th>
          <th>营业厅名称</th>
          <th>岗位</th>
          <th>月份</th>
          <th>积分</th>
          <th>营业员绩效</th>
          <th>营业厅绩效</th>
          <th>调整后积分</th>
          <th>排名</th>
          <th>奖励金额</th>
          <th>税金</th>
          <th>税后金额</th>
        </tr>
        <tr>
          <td>城东区</td>
          <td>100980</td>
          <td>张三</td>
          <td>A001</td>
          <td>南京新华书店沟通100服务</td>
          <td>熟练营业员</td>
          <td>2007-01</td>
          <td>100</td>
          <td>10</td>
          <td>8</td>
          <td>90</td>
          <td>1</td>
          <td>100</td>
          <td>10</td>
          <td>90</td>
        </tr>
      </table>
      <br />
      <table cellpadding="0" cellspacing="0" class="tablelist" align="center">
        <tr>
          <th>全球通入网</th>
          <th>动感地带入网</th>
          <th>神州行入网(含各子产品)</th>
          <th>开通5元彩信套餐</th>
          <th>2元彩铃换歌</th>
        </tr>
        <tr>
          <td><div align="center">10</div></td>
          <td><div align="center">15</div></td>
          <td><div align="center">20</div></td>
          <td><div align="center">25</div></td>
          <td><div align="center">30</div></td>
        </tr>
        <tr>
          <th>开通15元彩信套餐</th>
          <th>开通5元GPRS套餐</th>
          <th>开通20元GPRS套餐</th>
          <th>秘书管家</th>
          <th>开5元手机邮箱个人版</th>
        </tr>
        <tr>
          <td><div align="center">2</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
        </tr>
        <tr>
          <th>短信代码升级换卡</th>
          <th>交通秘书</th>
          <th>无线高级会员</th>
          <th>凤凰时事评论</th>
          <th>无界篮球</th>
        </tr>
        <tr>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
        </tr>
        <tr>
          <th>瑞丽</th>
          <th>短信回执</th>
          <th>短信连连发</th>
          <th>密码复位</th>
          <th>开通100元GPRS套餐（除随e行外）</th>
        </tr>
        <tr>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
        </tr>
        <tr>
          <th>开通200元GPRS套餐（除随e行外）</th>
          <th>手机零售</th>
          <th>手机类捆绑营销活动受理</th>
          <th>全球通品牌整合（充600送500礼品券）</th>
          <th>移动改变生活充50元送50元礼品券营销案</th>
        </tr>
        <tr>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
          <td><div align="center">0</div></td>
        </tr>
      </table>
      <br />
      <table cellpadding="0" cellspacing="0" width="95%" align="center">
        <tr>
          <td align="center" ><input type="button" name="goContinueButton" value="关闭" class="btn_2" onclick="javascript:window.close();"/></td>
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