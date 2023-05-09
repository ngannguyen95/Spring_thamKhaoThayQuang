<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023/05/07
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Sex</th>
        <th>Birthdate</th>
        <th>Address</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${liststudent}" var="st">
        <tr>
            <td>${st.id}</td>
            <td>${st.name}</td>
            <td>${st.age}</td>
            <td>${st.sex?"Nam":"Nữ"}</td>
            <td><fmt:formatDate value="${st.birthDate}" pattern="dd/MM/yyyy"/></td>
            <td>${st.address}</td>
            <td>${st.status?"đang học":"nghỉ học"}</td>
            <td>
                <a href="<%=request.getContextPath()%>/studentController/initUpdate?id=${st.id}">Update</a>
                <a href="<%=request.getContextPath()%>/studentController/delete?id=${st.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="<%=request.getContextPath()%>/studentController/initCreate">Create Student</a>
</body>
</html>
