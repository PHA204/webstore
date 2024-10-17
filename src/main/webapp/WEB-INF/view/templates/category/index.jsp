<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <a href="/category/add">Add</a>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Command</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${list}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>
                        <a href="/category/edit/${item.id}">Edit</a>
                        <a href="/category/delete/${item.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            
        </tbody>
    </table>
</body>

</html>