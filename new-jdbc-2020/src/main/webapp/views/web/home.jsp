<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
</head>
<body>
	<div class="row">

		<div class="col-lg-3">

			<h1 class="my-4">Mục nổi bật</h1>
			<div class="list-group">
				<a href="#" class="list-group-item"><h5>Mèo</h5></a> <a href="#"
					class="list-group-item"><h5>Cá cảnh</h5></a> <a href="#"
					class="list-group-item"><h5>Chim cảnh</h5></a> <a href="#"
					class="list-group-item"><h5>Gặm nhấm</h5></a> <a href="#"
					class="list-group-item"><h5>Bò sát</h5></a>
			</div>

		</div>
		<!-- /.col-lg-3 -->

		<div class="col-lg-9">

			<div id="carouselExampleIndicators" class="carousel slide my-4"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
					<div class="carousel-item active">
						<img class="d-block img-fluid"
							src="<c:url value='/template/web/img/slide.jpg' />" alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block img-fluid"
							src="<c:url value='/template/web/img/slide.jpg' />"
							alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block img-fluid"
							src="<c:url value='/template/web/img/slide.jpg' />" alt="Third slide">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>

			<div class="row">

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href='<c:url value= '/views/web/item.jsp'/>'><img class="card-img-top"
							src="https://chobaove.com/wp-content/uploads/2018/07/husky-1.jpg" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value= '/views/web/item.jsp'/>'>Chó Husky ngáo ngơ</a>
							</h4>
						</div>
						<div class="card-footer">
							<p class="card-text">7.000.000 VNĐ</p>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Bé golden alaska</a>
							</h4>
						</div>
						<div class="card-footer">
							<p class="card-text">1.000.000 VNĐ</p>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Mèo anh lông ngắn</a>
							</h4>
						</div>
						<div class="card-footer">
							<p class="card-text">1.400.000 VNĐ</p>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Bé poodle 2 tháng tuổi</a>
							</h4>
						</div>
						<div class="card-footer">
							<p class="card-text">2.000.000 VNĐ</p>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Bé mèo mướp mới đẻ</a>
							</h4>
						</div>
						<div class="card-footer">
							<p class="card-text">600.000 VNĐ</p>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Bé corgi lông vàng</a>
							</h4>
						</div>
						<div class="card-footer">
							<p class="card-text">2.000.000 VNĐ</p>
						</div>
					</div>
				</div>

			</div>
			<!-- /.row -->

		</div>
		<!-- /.col-lg-9 -->

	</div>
	<!-- /.row -->
</body>
</html>