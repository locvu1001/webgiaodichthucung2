<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng tin</title>
</head>
<body>
	<div class="container register">
		<div class="row">
			<div class="col-md-3 register-left">
				<img src="https://image.ibb.co/n7oTvU/logo_white.png" alt="" />
				<h3>Chào mừng bạn đến với thế giới thú cưng</h3>
				<input type="submit" name="" value="Trang chủ" /><br />
			</div>
			<div class="col-md-9 register-right">
				<div class="tab-content" id="myTabContent">
					<div class="tab-pane fade show active" id="home" role="tabpanel"
						aria-labelledby="home-tab">
						<form action="<c:url value='/dang-tin'/>" id="formDangtin" method="post">
							<h3 class="register-heading">Đăng tin</h3>
							<div class="row register-form">
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Tiêu đề *" value="" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Tên *" value="" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="tuổi *" value="" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="giới tính *" value="" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="giống *" value="" />
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Tiêm chủng *" value="" />
									</div>
									<div class="form-group">
										<input type="text" minlength="10" maxlength="10"
											name="txtEmpPhone" class="form-control"
											placeholder="Bảo hành sức khỏe *" value="" />
									</div>
									<div class="form-group">
										<input type="text" minlength="10" maxlength="10"
											name="txtEmpPhone" class="form-control"
											placeholder="Số điện thoại *" value="" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Địa chỉ *" value="" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="giá *" value="" />
									</div>
									<input type="hidden" value="dangtin" name="action"/>
									<input type="submit" class="btnDangtin" value="Đăng tin" />
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>