<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student List</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; }
        table { border-collapse: collapse; width: 70%; margin: 30px auto; background: #fff; }
        th, td { border: 1px solid #ccc; padding: 10px; text-align: center; }
        th { background-color: #007BFF; color: white; }
        h2 { text-align: center; color: #333; }
    </style>
</head>
<body>
    <h2>Student List</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Grade</th>
        </tr>

        <c:forEach var="student" items="${student}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.gender}</td>
                <td>${student.email}</td>
                <td>${student.phoneNumber}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
