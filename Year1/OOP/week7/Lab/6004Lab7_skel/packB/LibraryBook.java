package packB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryBook extends Book implements BorrowAble {
    private int id;
    private PrintType type; 
    private boolean availableForBorrow = true;
    private LocalDate dateBorrow;
    public LibraryBook(int id, String title, String author, String publisher, int year, int numberOfPages, PrintType t) {
        // next version --> isbn
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.type = t;
    } 
    public void setBookAvailableFalse() {
        availableForBorrow = false;
    }
    public void setBookAvailableTrue() {
        availableForBorrow = true;
    }
    public boolean isAvailable() {
        return availableForBorrow;
    }
    @Override
    public String toString() {
        return "LibraryBook [id=" + id + ", title=" + title + ", type=" + type + ", avail=" + availableForBorrow + "]";
    }
    public boolean checkoutItem(int yy, int mm, int dd) { 
        if (this.type == PrintType.PRINT && availableForBorrow) {
            setBookAvailableFalse(); 
            dateBorrow = LocalDate.of(yy ,mm, dd);
            return true;
        }
        return false;
    }
    public int returnItem(int yy, int mm, int dd) {
        LocalDate today = LocalDate.of(yy ,mm, dd);
        long daysBetween = ChronoUnit.DAYS.between(this.dateBorrow, today);
        if (daysBetween > 7 && !availableForBorrow){
            setBookAvailableTrue();
            return (int)daysBetween-7;
        }
        return 0;
    }
}
