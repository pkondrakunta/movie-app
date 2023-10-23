## Setting up the MySQL Server

1. Downloaded MySQL 8.1 Configurator and used the default settings to start the server
2. Connected the server on MySQL Workbench

> To check if your MySQL server is running, you can type "Services" on Start and review the list of services running on your Windows PC.

## Connecting to the MySQL Server and retrieving data
Add the dependency to your project:

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.1.0</version>
</dependency>
```

### 1. Load the JDBC

```java
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException ex) {
    Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
}
```
### 2. Estalish a connection

```java 
Connection conn = null;
String my_db = "movies_db";
String my_db_user = "csye_user";
String my_db_pwd = "csye6220";

try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost/movies_db", my_db_user, my_db_pwd);

} catch (SQLException ex) {
    // handle any errors
}
```
### 3. Create a statement

```java
Statement statement = conn.createStatement();
```

### 4. Using the statement and retrieving the ResultSet
```java
String sql = "SELECT * FROM movies";
ResultSet resultSet = statement.executeQuery(sql);

// Loop through the ResultSet
List<Movie> movieList = new ArrayList<Movie>();

while (resultSet.next()) {
    // Create your loop

    // Movie movieObj = new Movie();

    // movieObj.setMovieID(resultSet.getInt("MovieID"));
    // movieObj.setTitle(resultSet.getString("Title"));
    // movieObj.setMaleLead(resultSet.getString("MaleLead"));
    // movieObj.setFemaleLead(resultSet.getString("FemaleLead"));
    // movieObj.setReleaseYear(resultSet.getInt("ReleaseYear"));
    // movieObj.setGenre(resultSet.getString("Genre"));

    // movieList.add(movieObj);
}
```

> You can pass the List<Object> to your JSP using scopes. 

Refer to official [MySQL Docs](https://dev.mysql.com/doc/connector-j/8.1/en/connector-j-usagenotes-connect-drivermanager.html)

[//]: # (Some info about connecting to SQL servers using JDBC)

## Notes about connecting to the DB

The most important members of the java.sql package are as follows:
- `DriverManager` class\
    The DriverManager class provides static methods for managing JDBC drivers. Each JDBC driver you want to use must be registered with the DriverManager.
- `Driver` interface\
 The Driver interface is implemented by every JDBC driver class.
 The driver class itself is loaded and registered with the DriverManager, and the
DriverManager can manage multiple drivers for any given connection request.
- `Connection` interface\
 The Connection interface represents a connection to the database. An instance of the Connection interface is obtained from the getConnection method of the DriverManager class.
- `Statement` interface\
 You use the statement interface method to execute an SQL statement and obtain the results that are produced.
- `ResultSet` interface\
 The ResultSet interface represents a table-like database result set.
- `PreparedStatement` interface\
 The PreparedStatement interface extends the Statement interface and represents a
precompiled SQL statement.You use an instance of this interface to execute efficiently an SQL statement multiple times.
- `ResultSetMetaData` interface\
 The ResultSetMetaData interface represents the meta data of a ResultSet object