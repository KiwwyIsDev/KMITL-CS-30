package packB;

public class LibraryBookDemo extends Book  {
    private int id;
    private PrintType type;
    private boolean availForBorrow;
    public LibraryBookDemo(int id, String title, String author, String publisher, int year, int numberOfPages, PrintType t) {
        // next version --> isbn
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.type = t;
        this.availForBorrow = true;
    } 
    public void setBookAvailableFalse() {
        availForBorrow = false;
    }
    public void setBookAvailableTrue() {
        availForBorrow = true;
    }
    public boolean isAvailable() {
        return availForBorrow;
    }
    @Override
    public String toString() {
        return "LibraryBookDemo [id=" + id + ", title=" + title + ", type=" + type + ", avail=" + availForBorrow + "]";
    }

}
