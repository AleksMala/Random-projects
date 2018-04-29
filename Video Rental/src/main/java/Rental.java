import java.util.List;
import java.util.stream.Collectors;

public class Rental implements RentalDAO {

    private TermsOfRent termsOfRent;

    public Rental(TermsOfRent termsOfRent) {
        this.termsOfRent = termsOfRent;
    }

    public TermsOfRent getTermsOfRent() {
        return termsOfRent;
    }

    @Override
    public void rentMovie(Person person, Movie movie, int days) {
        if(movie.isAvailable()){
            TermsOfRent newTermsOfRent = new TermsOfRent(person, movie, days);
        }
    }
}
