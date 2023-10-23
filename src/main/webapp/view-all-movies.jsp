<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!--Bootstrap StyleSheet-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    </head>
    <body>

        <br/>
        <!--<form action="movie.htm?action=register" method="post">-->

        <div class="container">
            <h2>View all movies</h2>

            <table  class="table">
                <tr>
                    <th>ID</th>                
                    <th>Title</th>                
                    <th>Male Lead</th>
                    <th>Female Lead</th>
                    <th>Release Year</th>
                    <th>Genre</th>
                </tr>

                <c:forEach items="${requestScope.movieList}" var="movie">
                    <tr>
                        <td>${movie.movieID}</td>
                        <td>${movie.title}</td>
                        <td>${movie.maleLead}</td>
                        <td>${movie.femaleLead}</td>
                        <td>${movie.releaseYear}</td>
                        <td>${movie.genre}</td>
                    </tr>
                </c:forEach>

            </table>
        </div>

        <!--<input type="submit" value="Register Selected Courses" />-->
        <!--</form>-->
    </body>
</html>
