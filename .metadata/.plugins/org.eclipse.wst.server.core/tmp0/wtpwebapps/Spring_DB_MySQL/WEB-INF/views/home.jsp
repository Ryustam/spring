<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/app.js"></script>
 <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" >
 
<html>
<head>
	<title>Home</title>
</head>
<body>
	<div id="wrap">
		<div id="header">
			
		</div>
		<div id="side">
 			<a href="test">click!</a>
		</div>
		<div id="main">
           <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td>${member.name}</td>
                    <td>${member.height}</td>
                    <td>${member.weight}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
		</div>
	</div>
</body>
</html>