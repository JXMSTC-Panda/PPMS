<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>User Register Page</title>  
</head>  
<body>  
  
    <s:form action="register"  namespace="/">  
        <s:textfield name="user.username" label="用户名"></s:textfield>  
        <s:password name="user.password" label="密码"></s:password>  
        <s:radio list="#{'1':'老师','0':'学生'}" name="user.type"></s:radio>
        <s:submit value="注册"></s:submit> 
    </s:form>  
  
</body>  
</html>  