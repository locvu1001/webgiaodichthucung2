<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
    <!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">PET SHOP</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <c:if test="${not empty ACCOUNTMODEL}">
              <li class="nav-item">
                <a class="nav-link" href='#'>Xin chào, ${ACCOUNTMODEL.tenkhachhang}</a>
              </li>
              <li class="nav-item">
              <a class="nav-link" href='<c:url value="/dang-tin?action=dangtin"/>'>Đăng tin</a>
            </li>
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Thoát</a>
              </li>
            </c:if>
            <c:if test="${empty  ACCOUNTMODEL}">
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/dang-nhap?action=login"/>'>Đăng nhập</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/dang-ky?action=register"/>'>Đăng ký</a>
              </li>
            </c:if>
          </ul>
        </div>
      </div>
</nav>