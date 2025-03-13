import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Lab10_MovieCounter {
	ArrayList<CSMovie> mList = new ArrayList<>();
	Set<String> uniqueTitle = new HashSet<>();
	
	private static MovieCounter data = new MovieCounter();
	// 7512 
	
	// avg score
	private static void q1() { 
		// DoubleSummaryStatistics avg = data.mList.stream().mapToDouble(CSMovie::getScore).summaryStatistics();
		double avg = data.mList.stream().mapToDouble(CSMovie::getScore).average().getAsDouble(); // how to get avg normal way ? 
		System.out.println("---q1---");
		System.out.println("Avg: " + avg);
	}

	// movie votes > 1_900_000
	private static void q2() {
		List<CSMovie> d = data.mList.stream().filter(x -> x.getVotes() > 1_900_000).collect(Collectors.toList());
		System.out.println("---q2---");
		d.stream().map(CSMovie::getTitle).forEach(System.out::println);
	}
 
	private static void q3() {
		System.out.println("---q3---");
		Optional<CSMovie> maxza = data.mList.stream().max(Comparator.comparingDouble(CSMovie::getGross));
		maxza.ifPresent(movie -> System.out.println(movie.getTitle()));
	}
	
	private static void q4() {
		System.out.println("---q4---");
		Map<String,List<CSMovie>> ans = data.mList.stream()
                                                .collect(Collectors.groupingBy(CSMovie::getGenre));
        ans.keySet().stream().forEach(System.out::println);
	}

	private static void q5() {
		List<String> result = data.mList.stream()
			.filter(e -> e.getRuntime() > 0)
			.sorted(Comparator.comparingInt(CSMovie::getRuntime))
			.limit(5)
			.map(e -> String.format("%-55s --> %s", e.getTitle(), e.getRuntime()))
			.collect(Collectors.toList());
		System.out.println("---q5---");
		result.forEach(System.out::println);
	}

	private static void q6() {
		Optional<CSMovie> min = data.mList.stream().filter(c -> c.getBudget() > 0).min(Comparator.comparingDouble(CSMovie::getBudget));
		Optional<CSMovie> max = data.mList.stream().max(Comparator.comparingDouble(CSMovie::getBudget));
		System.out.println("---q6---");
		min.ifPresent(movie -> System.out.println("Min Budget: " + movie.getTitle() + " --> " + movie.getBudget()));
		max.ifPresent(movie -> System.out.println("Max Budget: " + movie.getTitle() + " --> " + movie.getBudget()));
	}
	
	private static void q7(String genre) {
		List<CSMovie> top3Movies = data.mList.stream()
			.filter(movie -> movie.getGenre().equalsIgnoreCase(genre)) // ignore case <3
			.sorted(Comparator.comparingDouble(CSMovie::getScore).reversed())
			.limit(3)
			.collect(Collectors.toList());
		System.out.println("---q7---");
		top3Movies.forEach(movie -> System.out.println(movie.getTitle() + " --> " + movie.getScore()));
	} 

	private static void q8() {
		List<CSMovie> top3ActionMovies = data.mList.stream()
			.filter(movie -> movie.getGenre().equals("Action"))
			.sorted(Comparator.comparingDouble(CSMovie::getScore).reversed()
					.thenComparing(CSMovie::getTitle))
			.limit(3)
			.collect(Collectors.toList());
		System.out.println("---q8---");
		top3ActionMovies.forEach(movie -> System.out.println(movie.getTitle() + " --> " + movie.getScore()));
	}

	private static void q9() { 
		Map<String, Long> grossByGenre = data.mList.stream()
			.collect(Collectors.groupingBy(CSMovie::getGenre, Collectors.summingLong(CSMovie::getGross)));
		System.out.println("---q9---");
		grossByGenre.forEach((genre, totalGross) -> System.out.println(genre + " --> " + totalGross));
	}

	private static void q10() {
		Function<String, Integer> numW = entry -> {
			int c = 0;
			String[] tokens = entry.split(" ");
			for (String s : tokens) {
				if (s.charAt(0) == 'a') { 
					c ++;
				}
			}
			return c;
		};

		Optional<String> most = data.mList.stream().map(e -> e.getTitle()).max(Comparator.comparing(numW));
		System.out.println("---q10---");
		System.out.println(most.get());
	}

	public static void main(String[] args) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7("Adventure"); 
		q8();
		q9();
		q10();
	}
};