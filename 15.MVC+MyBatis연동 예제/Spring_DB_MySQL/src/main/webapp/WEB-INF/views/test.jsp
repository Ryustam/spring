<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/app.js"></script>
 <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" >
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>test</title>
</head>
<body>
<p>test</p>
<c:forEach items="${memberList}" var="member">
                <tr>
                    <td>${member.name}</td>
                    <td>${member.height}</td>
                    <td>${member.weight}</td>
                </tr>
</c:forEach>
</body>
</html>