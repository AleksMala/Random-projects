
public class Movie {

    private String nameOfMovie;
    private MovieCategory category;
    private boolean availability;

    public Movie(String nameOfMovie, MovieCategory category, Boolean availability) {
        this.nameOfMovie = nameOfMovie;
        this.category = category;
        this.availability = availability;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public Boolean isAvailable() {
        return availability;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
