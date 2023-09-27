<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body { font-family:Fantasy;}
</style>
</head>
<body>
${ vo.hour }시 ${ vo.minute }분에 당첨 실패!! 아쉽아쉽<br><br>
<img src="./images/sady.jpg" height="300px"><hr>
<a href="${ header.referer }">로또 응모 링크</a>
</body>
</html>