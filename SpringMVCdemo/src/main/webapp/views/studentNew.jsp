<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023/05/07
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Student</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/studentController/create" method="post">
    <table>
        <tr>
            <td>Student Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>Sex</td>
            <td>
                <input type="radio" name="sex" id="male" checked>
                <lable for="male">Male</lable>
                <input type="radio" name="sex" id="female" checked>
                <lable for="female">Female</lable>
            </td>
        </tr>
        <tr>
            <td>BirthDate</td>
            <td><input type="date" name="birthDate"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>Status</td>
            <td>
                <select name="status" >
                    <option value="true">Hoạt động</option>
                    <option value="false">Không hoạt động</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="">
                <input type="submit" value="Create">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
