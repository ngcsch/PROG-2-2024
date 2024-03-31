package prog2.spring2024.exercise2;

public enum BookDetails {

    Book1("001", "Carrie", "Stephen King", 272, "Horror", 3.98, "Wings", 1974, 14.0),
    Book2("002", " The Firm ", "Robin Waterfield / John Grisham", 448, "Thriller", 4.01, "Addison Wesley Publishing Company", 1991, 25.0),
    Book3("003", " Slaughterhouse-Five ", "Kurt Vonnegut Jr.", 275, "Sci-Fi", 4.1, "Dial Press", 1969, 18.0),
    Book4("004", " The Great Gatsby ", "F. Scott Fitzgerald", 188, "Classic", 3.91, "Scribner", 1925, 8.0),
    Book5("005", " American Gods ", "Neil Gaiman", 635, "Fantasy", 4.11, "Harper Collins", 2001, 4.11);

    private final String bookID;
    private final String bookName;
    private final String bookAuthor;
    private final int bookPages;
    private final String bookGenre;
    private final double bookRating;
    private final String bookPublisher;
    private final int bookPublishedYear;
    private final double bookPrice;
    private static final double bookRent = 5.0;

    BookDetails(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating,
            String bookPublisher, int bookPublishedYear, double bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookGenre = bookGenre;
        this.bookRating = bookRating;
        this.bookPublisher = bookPublisher;
        this.bookPublishedYear = bookPublishedYear;
        this.bookPrice = bookPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public double getBookRating() {
        return bookRating;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public static double getBookRent() {
        return bookRent;
    }
}