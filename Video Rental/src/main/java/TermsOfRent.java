public class TermsOfRent {

    private static final int TO_15_DAYS = 5;
    private static final int MORE_THAN_15_DAYS = 15;

    private Person person;
    private Movie movie;
    private int days;
    private double price;

    public TermsOfRent(Person person, Movie movie, int days) {
        this.person = person;
        this.movie = movie;
        this.days = days;
        this.price = calculateTheRent();
    }

    public Person getPerson() {
        return person;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDays() {
        return days;
    }

    public double getPrice() {
        return price;
    }

    private double calculateTheRent() {
        if (days <= 15) {
            this.price = days * 1 + TO_15_DAYS;
        } else {
            this.price = days * 1 + MORE_THAN_15_DAYS;
        }
        return this.price;
    }
}
