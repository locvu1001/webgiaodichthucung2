<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title><dec:title default="Chi tiết thú cưng"/></title>

  <!-- css -->
  <link href="<c:url value='/template/item/vendor/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" type="text/css" media="all"/>
  <link href="<c:url value='/template/item/css/shop-item.css' />" rel="stylesheet" type="text/css" media="all"/>
  <link href="<c:url value='/template/item/js/gulpfile.js'/>">
</head>
<body>
<!-- header -->
<%@ include file="/common/web/header.jsp" %>
<!-- header -->

  <dec:body/>

<script type="text/javascript" src="<c:url value='/template/item/vendor/jquery/jquery.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/item/vendor/bootstrap/js/bootstrap.bundle.min.js' />"></script>

</body>
</html>