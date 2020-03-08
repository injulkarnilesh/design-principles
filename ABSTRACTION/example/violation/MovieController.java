package ABSTRACTION.example.violation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class MovieController {

  /*
  Ohh, this class knows a lot and does a lot.
  There is not abstraction, everything is open wide.
   */
  public List<Movie> moviesOfYear(Year year) throws Exception {
    DriverManager.registerDriver(null);
    Connection connection = DriverManager.getConnection("");
    Statement st = connection.createStatement();
    ResultSet resultSet = st.executeQuery("SELECt name, year, director From my_movies where year = " + year.toString());
    List<Movie> movies = Arrays.asList();
    while (resultSet.next()) {
      String name = resultSet.getString(0);
      Year movieYear = Year.of(resultSet.getInt(1));
      String director = resultSet.getString(2);
      movies.add(new Movie(name, movieYear, director));
    }
    return movies;
  }

}
