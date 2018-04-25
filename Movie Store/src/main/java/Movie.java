
public class Movie {

    private String nameOfMovie;
    private String category;
    private int yearOfMovie;

    public Movie(String nameOfMovie, String category, int yearOfMovie) {
        super();
        this.nameOfMovie = nameOfMovie;
        this.category = category;
        this.yearOfMovie = yearOfMovie;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYearOfMovie() {
        return yearOfMovie;
    }

    public void setYearOfMovie(int yearOfMovie) {
        this.yearOfMovie = yearOfMovie;
    }


}
