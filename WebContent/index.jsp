
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--スクリプトレット--%>
<%--
	//なんのファイル形式で返すか
  	response.setContentType("text/html; charset=UTF-8");
	//String textareaValue=request.getParameter("body");
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" >
</head>
<body align="center"class="body1">
	<form action="/ColorTile/ColorTile" method="post">
		<select name="cellselect">
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select><br>
		<input type="submit" value="開始">
	</form>
</body>
</html>