package PROGRAMMING_TO_INTERFACES.example.violation;

import java.util.List;

public class Movie {

  private String name;
  private String yearOfRelease;
  private String director;
  private List<String> genres;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYearOfRelease() {
    return yearOfRelease;
  }

  public void setYearOfRelease(String yearOfRelease) {
    this.yearOfRelease = yearOfRelease;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }
}
