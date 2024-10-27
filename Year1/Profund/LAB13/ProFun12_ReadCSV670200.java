import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ProFun12_ReadCSV670200 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
    }

    static void demo1() {
        try (Scanner input = new Scanner(Paths.get("movies.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                String[] data = row.split(",");
                int year = Integer.parseInt(data[1]);
                double rating = Double.parseDouble(data[2]);
                System.out.println(data[0] + ", " + year + ", " + rating);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void demo2() {
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                try {
                    String[] data = row.split(",(?=(?:[^\"]*  \"[^\"]*\")*[^\"]*$)", -1);
                    int year = Integer.parseInt(data[1]);
                    double rating = Double.parseDouble(data[2]);
                    System.out.println(data[0] + ", " + year + ", " + rating);

                } catch (NumberFormatException e) {
                    System.out.println("skip row");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void demo3() {
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                String[] data = row.split(",(?=(?:[^\"]*  \"[^\"]*\")*[^\"]*$)", -1);
                try {
                    int year = Integer.parseInt(data[1]);
                    double rating = Double.parseDouble(data[2]);
                    // System.out.println(data[0] + ", " + year + ", " + rating);
                    Movie a = new Movie(data[0], year, rating);
                    System.out.println(a);
                } catch (NumberFormatException e) {
                    System.out.println("skip row");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void demo4() {
        ArrayList<Movie> movies = new ArrayList<>();
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                String[] data = row.split(",(?=(?:[^\"]*  \"[^\"]*\")*[^\"]*$)", -1);

                try {
                    int year = Integer.parseInt(data[1]);
                    double rating = Double.parseDouble(data[2]);
                    // System.out.println(data[0] + ", " + year + ", " + rating);
                    Movie a = new Movie(data[0], year, rating);
                    movies.add(a);
                } catch (NumberFormatException e) {
                    System.out.println("skip row");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Movie a : movies) {
            System.out.println(a);
        }

    }
}