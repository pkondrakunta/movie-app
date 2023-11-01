/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package edu.northeastern.app.controller;

import edu.northeastern.app.model.Movie;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "MovieController", urlPatterns = {"/movie.htm"})
public class MovieController extends HttpServlet {

    public void init() {
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        // Connection Initialisation 
        Connection conn = null;

        String my_db_user = "csye_user";
        String my_db_pwd = "csye6220";

        if (action.equalsIgnoreCase("view")) {
            try {
                // Load the JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost/movies_db", my_db_user, my_db_pwd);

                // Create the statement
                Statement statement = conn.createStatement();

                // 
                String sql = "SELECT * FROM movies";
                ResultSet resultSet = statement.executeQuery(sql);

                List<Movie> movieList = new ArrayList<Movie>();

                while (resultSet.next()) {
                    Movie movieObj = new Movie();

                    movieObj.setMovieID(resultSet.getInt("MovieID"));
                    movieObj.setTitle(resultSet.getString("Title"));
                    movieObj.setMaleLead(resultSet.getString("MaleLead"));
                    movieObj.setFemaleLead(resultSet.getString("FemaleLead"));
                    movieObj.setReleaseYear(resultSet.getInt("ReleaseYear"));
                    movieObj.setGenre(resultSet.getString("Genre"));

                    movieList.add(movieObj);
                }

                request.setAttribute("movieList", movieList);

            } catch (Exception ex) {
                // handle any errors
            }

            RequestDispatcher rd = request.getRequestDispatcher("/view-all-movies.jsp");
            rd.forward(request, response);

        } else if (action.equalsIgnoreCase("add")) {
            //get the movie details 

            try {
                // Load the JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost/movies_db", my_db_user, my_db_pwd);

                // Create the statement
                Statement statement = conn.createStatement();

                String valueString = "(" + request.getParameter("movieID") + ", '" + request.getParameter("title") + "', '" + request.getParameter("maleLead") + "', '" + request.getParameter("femaleLead") + "', " + request.getParameter("releaseYear") + ", '" + request.getParameter("genre") + "')";

                String sql = "INSERT INTO movies VALUES " + valueString;
                statement.executeUpdate(sql);
                
            } catch (Exception ex) {
                // handle any errors
            }

            RequestDispatcher rd = request.getRequestDispatcher("/add-movie-confirmation.jsp");
            rd.forward(request, response);
        } else if (action.equalsIgnoreCase("viewmycourses")) {
            RequestDispatcher rd = request.getRequestDispatcher("/view-registration.jsp");
            rd.forward(request, response);
        } else if (action.equalsIgnoreCase("search")) {
            RequestDispatcher rd = request.getRequestDispatcher("/search-results.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
