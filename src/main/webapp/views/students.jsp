<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 09/05/2024
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
<h3>Danh sách sinh viên</h3>
<table border="1">
    <thead>
    <tr>
        <th>Student Id</th>
        <th>Student Name</th>
        <th>Age</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listStudent}" var="student">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.studentName}</td>
            <td>${student.age}</td>
            <td>${student.status?"Đang học":"Nghỉ học"}</td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="<%=request.getContextPath()%>/studentController/initCreate">Create new student</a>
</body>
</html>
