package packB;

public class ArchiveMaterial extends Book {
    private int id;
    private Status status;
    public ArchiveMaterial(int id, String title, String author, String publisher, int year, int numberOfPages, Status s) {
        // next version --> isbn
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.status = s;
    } 
    @Override
    public String toString() {
        return "ArchiveMaterial [id=" + id + ", title=" + title + ", status=" + status + " message=" + status.sayHi();
    }
}
