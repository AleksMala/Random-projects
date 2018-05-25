import java.util.HashSet;
import java.util.Set;

class Library {

    public static void booksPublishedBefore(Set<Book> bookInfo, int published) {
        for (Book books : bookInfo) {
            if (books.getYearOfPublication() < published) {
                System.out.println(books);
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {

        Set<Book> bookInfo = new HashSet<>();

        bookInfo.add(new Book("Ciemność płonie", "Jakub Ćwiek", 2008));
        bookInfo.add(new Book("Zbieracz Burz", "Maja Lidia Kossakowska", 2010));
        bookInfo.add(new Book("Achaja", "Andrzej Ziemiański", 2003));
        bookInfo.add(new Book("The Millenium", "Stieg Larsson", 2008));
        bookInfo.add(new Book("Ginekolodzy", "Jürgen Thorwald", 2016));

        Library.booksPublishedBefore(bookInfo, 2010);
    }
}

