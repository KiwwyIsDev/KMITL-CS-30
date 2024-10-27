public class Movie {
    String title;
    int year;
    double rating;

    Movie(String title, int releasedYear, double rating) {
        this.title = title;
        this.year = releasedYear;
        this.rating = rating;
    }

    public String toString() {
        return title + "(" + year + "," + rating + ")";
    }

}
