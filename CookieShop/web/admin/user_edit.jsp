<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>客户修改</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<div class="container-fluid">

	<jsp:include page="/admin/header.jsp"></jsp:include>

	<br><br>

	<form class="form-horizontal" action="/admin/user_edit" method="post">
		<input type="hidden" name="id" value="${u.id }">
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">用户名</label>
			<div class="col-sm-5">${u.username }</div>
		</div>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">邮箱</label>
			<div class="col-sm-5">${u.email }</div>
		</div>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">收件人</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="name" value="${u.name }">
			</div>
		</div>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">电话</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="phone" value="${u.phone }">
			</div>
		</div>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">地址</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="address" value="${u.address }">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-1 col-sm-10">
				<button type="submit" class="btn btn-success">提交修改</button>
			</div>
		</div>
	</form>

	<span style="color:red;"></span>

</div>
</body>
</html>