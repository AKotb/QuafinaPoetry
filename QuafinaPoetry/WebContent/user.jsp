<?xml version="1.0" encoding="windows-1256" ?>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256" />
<title>User Management</title>
</head>
<body>
	<h1>User Management Page</h1>
	<form action="<%=request.getContextPath()%>/user/login" method="post">
		Name:<input type="text" name="userName" />
		<br/> 
		Password:<input type="password" name="userPass" />
		<br/> 
		<input type="submit" value="login" />
	</form>
</body>
</html>