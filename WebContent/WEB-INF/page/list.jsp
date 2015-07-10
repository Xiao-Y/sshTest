<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<br><br><br>
	<table>
	<thead>员工列表</thead>
	<tr>
		<th>ID</th><th>姓名</th><th>年龄</th><th>性别</th><th>操作</th>
		<td><a href="${pageContext.request.contextPath }/employeeAction_edit.action">添加</a></td>
	</tr>
		<s:if test="%{#request.employees != null && #request.employees.size() > 0 }">
			<s:iterator var="employee" value="%{#request.employees}">
				<tr>
					<td>${employee.id }</td>
					<td>${employee.name }</td>
					<td>${employee.age }</td>
					<td>${employee.sex }</td>
					<td><a href="${pageContext.request.contextPath }/employeeAction_delete.action?id=${employee.id }">删除</a></td>
					<td><a href="${pageContext.request.contextPath }/employeeAction_edit.action?id=${employee.id }">编辑</a></td>
				</tr>
			</s:iterator>
		</s:if>
		<s:else>
			<tr><td colspan="4">没有更多数据...</td></tr>
		</s:else>
	</table>
</center>
</body>
</html>