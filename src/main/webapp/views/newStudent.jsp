<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 09/05/2024
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new student</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/studentController/create" method="post">
    <label for="studentName">Student Name</label>
    <input type="text" id="studentName" name="studentName"/><br>
    <label for="age">Age</label>
    <input type="number" id="age" name="age"/><br>
    <label for="active">Status</label>
    <input type="radio" id="active" name="status" value="true" checked/><label for="active">Đang học</label>
    <input type="radio" id="inActive" name="status" value="false"/><label for="inActive">Nghỉ học</label><br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
