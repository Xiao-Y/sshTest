<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<s:form action="employeeAction_saveOrUpdate.action">
	<s:hidden id="id" name="id"/>
		<table>
			<thead>添加/修改用户信息</thead>
			<tr><td>ID</td><td><s:textfield id="id" name="id" disabled="true"/> </td></tr>
			<tr><td>姓名</td><td><s:textfield id="name" name="name"/> </td></tr>
			<tr><td>年龄</td><td><s:textfield id="age" name="age"/> </td></tr>
			<tr><td>性别</td><td><s:textfield id="sex" name="sex"/> </td></tr>
			<tr><td><button type="submit">确定</button></td><td><button  type="reset">重置</button></td></tr>
		</table>
	</s:form>
	</center>
</body>
</html>