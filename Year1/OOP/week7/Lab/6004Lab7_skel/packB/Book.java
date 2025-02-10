package packB;
public abstract class Book {
    // protected String isbn;
    protected String title;
    protected String author;
    protected String publisher;
    protected int year;
    protected int numberOfPages;
    private int currentPageNumber;
    public void turnPageForward() {
        if (currentPageNumber < numberOfPages)
            currentPageNumber++;
    }
    public void turePageBackward() {
        if (currentPageNumber > 0)
            currentPageNumber--;
    }
    public int nowAtPage() {
        return currentPageNumber;
    }
    public String getTitle() {
        return title;
    }
}