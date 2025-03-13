public class CSMovie {
    private String title;
    private String rating;
    private String genre;
    private Integer year;
    private Double score;
    private Integer votes;
    private String director;
    private String star;
    private String country;
    private Integer budget;
    private Integer gross;
    private String company;
    private Integer runtime;

    public CSMovie(String title, String rating, String genre, Integer year, 
                  Double score, Integer votes, String director, String star, 
                  String country, Integer budget, Integer gross, 
                  String company, Integer runtime) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
        this.score = score;
        this.votes = votes;
        this.director = director;
        this.star = star;
        this.country = country;
        this.budget = budget;
        this.gross = gross;
        this.company = company;
        this.runtime = runtime;
    }
    public String getTitle() { 
        return title;
    }
    public Double getScore() {
        return score;
    }

    public Integer getVotes() {
        return votes;
    }

    public Integer getGross() {
        return gross;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Integer getBudget() {
        return budget;
    }

}