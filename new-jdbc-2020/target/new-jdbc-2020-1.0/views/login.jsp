<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Đăng nhập</title>
</head>
<body>
	<div id="login">
		<div class="container">
			<div id="login-row" class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<c:if test="${not empty message}">
                    	<div class="alert alert-${alert}">
                        	${message}
                    	</div>
					</c:if>
					<div id="login-box" class="col-md-12">
						<form action="<c:url value='/dang-nhap'/>" id="formLogin" method="post">
							<h3 class="text-center text-info">Đăng nhập</h3>
							<div class="form-group">
								<label for="username" class="text-info">Tên tài khoản:</label><br>
								<input type="text" name="tentaikhoan" id="tentaikhoan"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Mật khẩu:</label><br>
								<input type="password" name="matkhau" id="matkhau"
									class="form-control">
							</div>
							<label for="remember-me" class="text-info"><span>Nhớ tài khoản</span> <span>
							<input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
							<input type="hidden" value="login" name="action"/>
							<button type="submit" class="btn btn-info btn-md" >Đăng nhập</button>
							<div id="register-link" class="text-right">
								<a href="#" class="text-info">Đăng kí tài khoản</a>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>