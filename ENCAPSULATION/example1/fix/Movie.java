package ENCAPSULATION.example1.fix;

import java.time.Year;

public class Movie {

  private final String name;
  /*
  Database column can be mapped to integer.
  But in code a better representation `Year` can be used.
   */
  private final int releaseYear;
  private final String director;

  public Movie(String name, Year releaseYear, String director) {
    this.name = name;
    this.releaseYear = releaseYear.getValue();
    this.director = director;
  }

  public String getName() {
    return name;
  }

  public Year getReleaseYear() {
    return Year.of(releaseYear);
  }

  public String getDirector() {
    return director;
  }

  /*
  If the way last name is to be extracted from name ever changes,
  this the single and better place to make that change.
  That also be done without client code knowing about it.
   */
  public String getDirectorLastName() {
    return director.split(" ")[1];
  }
}
