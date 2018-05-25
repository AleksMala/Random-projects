class Book{
    private String titleOfBook;
    private String author;
    private int yearOfPublication;

    public Book(String titleOfBook, String author, int yearOfPublication){
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public int hashCode(){
        return getYearOfPublication() * 100;
    }

    @Override
    public boolean equals (Object o){
        Book l = (Book) o;
        return (titleOfBook.equals(l.getTitleOfBook())) && (author.equals(l.getAuthor())) && (this.yearOfPublication == l.getYearOfPublication());
    }

    @Override
    public String toString(){
        return "Book titled \""+titleOfBook+"\"" + " by " + author + " was published in: " + yearOfPublication;
    }

    public String getTitleOfBook(){
        return titleOfBook;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }
}