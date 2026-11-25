package th.ac.cdti.rottenpotatoes.domain;

import java.util.List;
import java.util.Optional;

public List<Movie> byRating(Rating rating) {
return movies.stream()
.filter(movie -> movie.rating() == rating)
.sorted().toList(); // ใช compareTo ของ Movie
}
public List<String> titlesSorted() {
return movies.stream().sorted().map(Movie::title).toList();
}
public List<Movie> newestFirst(int limit) {
return movies.stream()
.sorted(Comparator.comparing(Movie::releaseDate).reversed())
.limit(limit).toList();
}
public Optional<Movie> findByTitle(String title) {
return movies.stream()
.filter(movie -> movie.title().equalsIgnoreCase(title))
.findFirst();
}