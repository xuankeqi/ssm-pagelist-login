<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<center>
		<font color="red">${sessionScope.loginError }</font>
		
		<!-- 实际上调用的是session对象中的destroy方法，也就是说你下次要再使用session，得再重新创建。 简单的说，就是没了，而不是值为null
		某一个用户调用的，比如说S1这个用户，调用了这个方法，那么，就只有s1用户的session 被删除，其他用户的session，跟s1没关系 -->
		<%
			session.invalidate();
		%>
	
		<form action="${pageContext.request.contextPath }/login" method="post">
			<table>
				<tr>
					<td>用户名</td>
					<td><input type="text" name="userName"/></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr align="center">
					<td colspan="10">
						&nbsp;&nbsp;
						<input type="reset" value="重置"/>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="submit" name="登录"/>
						&nbsp;&nbsp;
					</td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>