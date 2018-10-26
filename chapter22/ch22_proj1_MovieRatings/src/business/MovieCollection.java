package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	private List<Movie> movies;

	public MovieCollection() {
		movies = new ArrayList<>();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public void add(Movie m) {
		movies.add(m);
	}

	public List<Movie> filterMovies(Predicate<Movie> condition) {
		List<Movie> filteredMovies = new ArrayList<>();

		for (Movie m : movies) {
			if (condition.test(m))
				filteredMovies.add(m);
		}
		return filteredMovies;
		
	//	return movies.stream().filter(condition).collect(Colector.)
	}

	public double getLowestRating() {
		double lr = 5.0;
		
		for (Movie m: movies) {
			lr = Math.min(lr,  m.getRating());
		}

	public double getHighesRating() {
		double hr = 5.0;
			
			for (Movie m: movies) {
				hr = Math.min(hr,  m.getRating());
			}
	}
	public String getAverageRating() {
		double sum = movies.stream()
				.map(r -> r.getRating())
				.reduce(0.0, (a,b) ->(a+b));
		
				
		return nf.format(sum/movies.size());
	}

	public double getSize() {
		return movies.size();
	}

}
