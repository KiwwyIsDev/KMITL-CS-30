import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class MovieCounter {
	ArrayList<CSMovie> mList = new ArrayList<>();
	Set<String> uniqueTitle = new HashSet<>();

	public MovieCounter() {
		String row;
		int rowCount = 1;
		int incompleteCount = 0;
		String title;
		String rating;
		String genre;
		Integer year;
		String skipped_released;
		Double score;
		Integer votes;
		String director;
		String skipped_writer;
		String star;
		String country;
		Integer budget;
		Integer gross;
		String company;
		Integer runtime;

		try (Scanner input = new Scanner(Paths.get("movies.csv"))) {
			input.nextLine(); // skip header row
			while (input.hasNext()) {
				row = input.nextLine();
				String[] tokens = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				if (tokens.length < 15) {
					incompleteCount++;
					System.out.println(rowCount + " " + incompleteCount + " is incompleted");
					continue;

				}
				title = tokens[0];
				rating = tokens[1];
				genre = tokens[2];
				year = Integer.parseInt(tokens[3]);
				score = Double.parseDouble(parseDouble(tokens[5]));
				votes = (int) (Double.parseDouble(parseDouble(tokens[6])));
				director = tokens[7];
				star = tokens[9];
				country = tokens[10];
				budget = (int) (Double.parseDouble(parseDouble(tokens[11])));
				gross = (int) (Double.parseDouble(parseDouble(tokens[12])));
				company = tokens[13];
				runtime = (int) (Double.parseDouble(parseDouble(tokens[14])));
				if (!uniqueTitle.contains(title)) {
					mList.add(new CSMovie(title, rating, genre, year, score, votes, director, star, country, budget,
							gross, company, runtime));

				}

				uniqueTitle.add(title);
			}
			System.out.println(uniqueTitle.size());
			System.out.println(mList.size());
		} catch (IOException e) {
			System.out.println("from IO error");
			e.printStackTrace();
		}
	}
	private static String parseDouble(String str) {
		if (str.isEmpty())
			return ".0";
		return str;
	}

};