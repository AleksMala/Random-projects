public class IfAvailable {

    private Movie movie;
    private ManageVideo manageVideo;

    public boolean ifAvailable(LibraryOfMovies libraryOfMovies){
        return libraryOfMovies.getTypesOfMovies().contains(movie);
    }
}