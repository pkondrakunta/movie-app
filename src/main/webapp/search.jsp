<%-- 
    Document   : search
    Created on : Feb 7, 2020, 6:11:34 PM
    Author     : YSF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search Courses Offered in Spring 2024</h1>
        <form method='post' action='course.htm?action=search'>
            Enter Course Name or Code: <input type='text' name='q'/><br/>
            <input type="submit" value="Search Courses" />
        </form>
    </body>
</html>
