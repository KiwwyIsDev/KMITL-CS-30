import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class MovieCounter_670200 {
    ArrayList<Movie> availableList;
    ArrayList<Movie> checkOutList;

    public MovieCounter_670200() {
        availableList = new ArrayList<>();
        checkOutList = new ArrayList<>();
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] data = line.split(",(?=(?:[^\"]*  \"[^\"]*\")*[^\"]*$)", -1);
                try {
                    int year = Integer.parseInt(data[1]);
                    double rating = Double.parseDouble(data[2]);
                    Movie a = new Movie(data[0], year, rating);
                    availableList.add(a);
                } catch (NumberFormatException e) {
                    System.out.println("skip row");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAvailableList() {
        System.out.println("available titles");
        for (Movie a : availableList) {
            System.out.println(a);
        }
    }

    public void showCheckOutList() {
        System.out.println("checked out titles");
        for (Movie a : checkOutList) {
            System.out.println(a);
        }

    }

    public void checkOut(int index) {
        checkOutList.add(availableList.remove(index));
    }

    public static void main(String[] args) {
        MovieCounter_670200 mc = new MovieCounter_670200();
        mc.showAvailableList();
        mc.checkOut(0);
        mc.showAvailableList();
        mc.showCheckOutList();
    }
}
