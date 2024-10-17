<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>

            <body>
                <a href="/upload/add">Add</a>
                <table>
                    <tbody>
                        <c:forEach var="item" items="${list}">
                            <tr>
                                <td>${item.id}</td>
                                <td>
                                    <img src="${item.url}" width="80">
                                </td>

                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </body>

            </html>