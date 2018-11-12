<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	欢迎 
	<c:if test="${sessionScope.user.role == 'admin' }">
		超级管理员
	</c:if>
	:
	${sessionScope.user.userName}	
	<br><br>

	<center>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>员工编号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>薪资</td>
				<td>邮箱</td>
				<td>部门</td>
			</tr>
			<c:forEach items="${requestScope.emps }" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.empName }</td>
					<td>${emp.gender == 0 ? '女' : '男' }</td>
					<td>${emp.salary }</td>
					<td>${emp.email }</td>
					<td>${emp.dept.deptName }</td>
					<td>${emp.empName }</td>
				</tr>
			</c:forEach>
		</table>
	</center>

</body>
</html>