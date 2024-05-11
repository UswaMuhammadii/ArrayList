import java.util.Objects;

public class Movie {
    String Name;
    int rating;
    String genre;
    int yearOfRelease;

    public Movie(String name, int rating, String genre, int yearOfRelease) {
        Name = name;
        this.rating = rating;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie() {

    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + Name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }




    public String getName() {
        return Name;
    }

    public int getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return rating == movie.rating && Objects.equals(Name, movie.Name);
    }

}

