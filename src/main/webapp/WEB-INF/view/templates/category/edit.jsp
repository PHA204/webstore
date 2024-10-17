<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form:form method="post"  modelAttribute="o">   
        <label for="name">Name</label>   
        <form:input type="text" name="name" id="name" value="${o.name}" path="name"/>
               
        <div>
        <button>Save Changes</button>
        </div>
       </form:form>
</body>
</html>