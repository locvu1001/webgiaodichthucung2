<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng nhập</title>
</head>
<body>
	<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Đăng nhập</h3>
			</div>
			<div class="card-body">
			<div class="main-div">
				<c:if test="${not empty message}">
					<div class="alert alert-${alert}">
							${message}
					</div>
				</c:if>
				<form action="<c:url value='/dang-nhap'/>" id="formLogin" method="POST">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" id="tentaikhoan" name="tentaikhoan" 
							placeholder="Tài khoản">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" id="matkhau" name="matkhau"
						 	placeholder="Mật khẩu">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Nhớ mật khẩu
					</div>
					<div class="form-group">
						<input type="hidden" value="login" name="action"/>
						<button type="submit" class="btn float-right login_btn" >Đăng nhập</button>
					</div>
				</form>
				</div>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Bạn chưa có tài khoản<a href='<c:url value="/dang-ky?action=register"/>'>Đăng ký</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Quên mật khẩu</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>