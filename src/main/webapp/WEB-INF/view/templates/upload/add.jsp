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
                    <form:form enctype="multipart/form-data" method="post" action="/upload/add"
                        modelAttribute="uploadForm">
                        <div>
                            <label for="f">Image</label>
                            <div>
                                <form:input type="file" id="f" name="f" accept="image/*" path="f" />
                            </div>
                        </div>
                        <div>
                            <button>Upload</button>
                        </div>
                    </form:form>

                </body>

                </html>