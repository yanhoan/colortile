<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
	//なんのファイル形式で返すか
  	response.setContentType("text/html; charset=UTF-8");
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title><%= request.getParameter("cellselect")%></title>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/bezierCurve.js"></script>

		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" >
	</head>
	<body>
		<%= request.getParameter("cellselect")%>
		<%--ここで得た値をjavascript側にもっていきたい --%>

		<canvas id="canvas" >
			<!-- ブラウザ非対応時の表示 -->
			使用中のブラウザはcanvasに対応していません
		</canvas>
	</body>
</html>