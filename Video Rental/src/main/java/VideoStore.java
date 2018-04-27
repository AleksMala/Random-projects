import java.util.HashSet;
import java.util.stream.Collectors;

public class VideoStore implements VideoStoreDAO {

    private HashSet<Movie> movies = new HashSet<>();

    @Override
    public void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }

    @Override
    public void removeMovie(Movie movie) {
        if (movies.contains(movie)) {
            movies.remove(movie);
        }
    }

    @Override
    public HashSet<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public HashSet<Movie> getAvailableMovies() {
        HashSet<Movie> availableMovies = new HashSet<>();
        for (Movie movie : movies) {
            if (movie.isAvailable())
                availableMovies.add(movie);
        }
        return availableMovies;
    }
}
