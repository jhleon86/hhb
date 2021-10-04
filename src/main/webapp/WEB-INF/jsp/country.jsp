<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application with JSP</title>
</head>
<body> 
<p>form submit</p>
<form action="/countries" method="post">
나라이름:<input name="COUNTRY_NAME" type="text"> 
<button type="submit">조회</button>
</form>

<table>
	<c:forEach items="${list}" var="country">
		<tr>
			<th>${country.regionId}</th>
			<th>${country.countryId}</th>
			<th>${country.countryName}</th>
		</tr>
	</c:forEach>
</table>

삭제 : <input name="COUNTRY_ID" type="text"/> <button type="button"> 삭 제</button>


<p>ajax</p>
<form action="/ajax/countries" method="get">
 나라이름:<input name="COUNTRY_NAME" type="text"> 
<button type="submit">조회</button>
</form>

 
</body>
</html> 