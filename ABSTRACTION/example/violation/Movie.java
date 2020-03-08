package ABSTRACTION.example.violation;

import java.time.Year;

public class Movie {

  private final String name;
  private final Year yearOfRelease;
  private final String director;

  public Movie(String name, Year yearOfRelease, String director) {
    this.name = name;
    this.yearOfRelease = yearOfRelease;
    this.director = director;
  }

  public String getName() {
    return name;
  }

  public Year getYearOfRelease() {
    return yearOfRelease;
  }

  public String getDirector() {
    return director;
  }
}
