import java.util.HashSet;
import java.util.List;

public interface VideoStoreDAO {

    void addMovie(Movie movie);

    void removeMovie(Movie movie);

    HashSet<Movie> getAllMovies();

    HashSet<Movie> getAvailableMovies();

}
