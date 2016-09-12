package moviefinder.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import moivefinder.dto.Movie;


@Component
public class MovieFinderClient {

	@Autowired
	private RestOperations restOperations;
	
	private final String url;
	
	@Autowired
	public MovieFinderClient(@Value("${moviefinder.url}") final String url) {
		this.url =url;
	}
	
	public Movie getMovie(final String searchString) {
		return restOperations.getForObject(url, Movie.class, searchString);
	}
}
