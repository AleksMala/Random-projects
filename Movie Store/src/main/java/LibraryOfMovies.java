import java.util.HashSet;

public class LibraryOfMovies {

    private HashSet<Movie> typesOfMovies = new HashSet<>();

    public LibraryOfMovies(HashSet<Movie> typesOfMovies) {
        super();
        this.typesOfMovies = typesOfMovies;
    }

    public HashSet<Movie> getTypesOfMovies() {
        return typesOfMovies;
    }

    public void setTypesOfMovies(HashSet<Movie> typesOfMovies) {
        this.typesOfMovies = typesOfMovies;
    }

    public HashSet addMovie(Movie movie) {
        return new HashSet<Movie>();
    }
}
