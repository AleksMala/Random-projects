import org.junit.Assert;
import org.junit.Test;

public class VideoRentalTestSuite {

    private Rental rental;
    private TermsOfRent terms;
    private VideoStore videoStore = new VideoStore();

    @Test
    public void videoIsAvailable() {

        //Given
        Person person = new Person("John", "Leemon");
        Person person1 = new Person("Alex", "Milky");

        Movie movie = new Movie("The Conjuring", MovieCategory.HORROR, true);
        Movie movie1 = new Movie("Loving Vincent", MovieCategory.ANIMATION, false);
        Movie movie2 = new Movie("The Others", MovieCategory.THRILLER, true);
        Movie movie3 = new Movie("Collateral Beauty", MovieCategory.DRAMA, true);
        Movie movie4 = new Movie("The Silence of the Lambs", MovieCategory.HORROR, false);

        //When
        videoStore.addMovie(movie);
        videoStore.addMovie(movie1);
        videoStore.addMovie(movie2);
        videoStore.addMovie(movie3);
        videoStore.addMovie(movie4);

        int size = videoStore.getAvailableMovies().size();
        //Then
        Assert.assertEquals(3, size);
    }

    @Test
    public void videNotAvailable(){

        //Given
        Person person = new Person("John", "Leemon");
        Person person1 = new Person("Alex", "Milky");

        Movie movie = new Movie("The Conjuring", MovieCategory.HORROR, true);
        Movie movie1 = new Movie("Loving Vincent", MovieCategory.ANIMATION, false);
        Movie movie2 = new Movie("The Others", MovieCategory.THRILLER, true);
        Movie movie3 = new Movie("Collateral Beauty", MovieCategory.DRAMA, true);
        Movie movie4 = new Movie("The Silence of the Lambs", MovieCategory.HORROR, false);

        //When
        rental.rentMovie(person, movie1, 2);

        //Then
        Assert.assertTrue(false);
    }
}
