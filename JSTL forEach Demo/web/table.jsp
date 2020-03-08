<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2/3/2020
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<html>
<head>
    <title>ForEachDemo</title>
</head>
<body>
<table>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
