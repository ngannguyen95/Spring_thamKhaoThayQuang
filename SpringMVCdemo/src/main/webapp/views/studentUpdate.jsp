<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023/05/09
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Update</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/studentController/update" method="post">
    <table>
        <tr>
            <td>Student Id</td>
            <td><input type="text" name="id" readonly  value="${stUpdate.id}"></td>
        </tr>
        <tr>
            <td>Student Name</td>
            <td><input type="text" name="name" value="${stUpdate.name}"></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><input type="text" name="age" value="${stUpdate.age}"></td>
        </tr>
        <tr>
            <td>Sex</td>
            <td>
                <input type="radio" name="sex" id="male" checked="${stUpdate.sex?"checked":""}" >
                <lable for="male">Male</lable>
                <input type="radio" name="sex" id="female" checked="${stUpdate.sex?"":"checked"}">
                <lable for="female">Female</lable>
            </td>
        </tr>
        <tr>
            <td>BirthDate</td>
            <td><input type="date" name="birthDate" value="${stUpdate.birthDate}"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address" value="${stUpdate.address}"></td>
        </tr>
        <tr>
            <td>Status</td>
            <td>
                <select name="status" >
                    <option value="true" ${stUpdate.status?"selected":""}>Hoạt động</option>
                    <option value="false" ${stUpdate.status?"":"selected"}>Không hoạt động</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="">
                <input type="submit" value="Update">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
