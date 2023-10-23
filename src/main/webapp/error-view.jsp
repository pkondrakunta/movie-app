<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!--Bootstrap StyleSheet-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    </head>
    <body>
        
        <h3>Sorry, while processing your request, an error occurred. </h3>
        
        <p>Error Details:</p>
        <p>${requestScope.errorInfo}</p>
        
        <a href="movie.htm?action=view">View All Movies</a><br/>
        <a href="search-movie.jsp">Search Movies</a><br/>
        <a href="add.jsp">Add a Movie</a><br/>
        
    </body>
</html>
