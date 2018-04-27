import java.util.Scanner;

public class MovieStore {

    public static void main(String[] args) {

        LibraryOfMovies horrorMovies = new LibraryOfMovies();
        horrorMovies.addMovie(new Movie("The Conjuring", "horror", 2013));
        horrorMovies.addMovie(new Movie("The Silence of the Lambs", "horror", 1991));
        horrorMovies.addMovie(new Movie("The Descent", "horror", 2005));

        LibraryOfMovies thrillerMovies = new LibraryOfMovies();
        thrillerMovies.addMovie(new Movie("The Sixth Sense", "thriller", 1999));
        thrillerMovies.addMovie(new Movie("The Others", "thriller", 2001));
        thrillerMovies.addMovie(new Movie("Fight Club", "thriller", 1999));

        LibraryOfMovies animation = new LibraryOfMovies();
        animation.addMovie(new Movie("Loving Vincent", "animation", 2017));
        animation.addMovie(new Movie("Katedra", "animation", 2002));
        animation.addMovie(new Movie("The Lion King", "animation", 1994));

    }
}
