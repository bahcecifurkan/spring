<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Form</h1>

		<form:form method="POST" modelAttribute="person" commandName="person"
			class="form-horizontal">

			<div class="row">
				<form:input type="text" path="name" id="name" />
			</div>

			<div class="row">
				<form:input type="text" path="surname" id="surname" />
			</div>

			<div class="row">
				<input type="submit" value="Action">
			</div>
			
		</form:form>
		<h1>GET form</h1>
		<form:form method="GET" modelAttribute="person" commandName="person" action="success"
			class="form-horizontal">

			<div class="row">
				<form:input type="text" path="name" id="name" />
			</div>

			<div class="row">
				<form:input type="text" path="surname" id="surname" />
			</div>

			<div class="row">
				<input type="submit" value="Action">
			</div>
			
		</form:form>
	</div>
</body>
</html>