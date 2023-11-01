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
        <title>MovieApp</title>

        <!--Bootstrap StyleSheet-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    </head>
    <body>
        <br/>
        
        <div class="container">
            <h2>Add a movie</h2><br/>
            
            
            <form method='post' action='movie.htm?action=add'>
                <div class="form-group">
                    <label for="movieID">Please enter Movie ID: </label>
                    <input class="form-control" type="number" name="movieID" placeholder="Movie ID" />
                    
                    <label for="title">Please enter the movie title: </label>
                    <input class="form-control" type="text" name="title" placeholder="Title" />
                    
                    <label for="maleLead">Please enter the movie's male lead: </label>                    
                    <input class="form-control" type="text" name="maleLead" placeholder="Male Lead" />
                    
                    <label for="femaleLead">Please enter the movie's female lead: </label>
                    <input class="form-control" type="text" name="femaleLead"  placeholder="Female Lead" />
                    
                    <label for="releaseYear">Please enter the movie release year: </label>
                    <input class="form-control" type="number" name="releaseYear" placeholder="Release Year" />
                    
                    <label for="genre">Please enter the movie genre: </label>
                    <select class="form-control" name="genre">
                        <option value="Thriller">Thriller</option>
                        <option value="Romance">Romance</option>
                        <option value="Comedy">Comedy</option>
                        <option value="Horror">Horror</option>
                    </select>
                </div>
                
                <input class="btn btn-outline-dark" type="submit" value="Add" />
            </form>

        </div>
    </body>
</html>
