 package moviefinder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import moivefinder.dto.Movie;
import moviefinder.client.MovieFinderClient;


@SpringBootApplication
public class MoviefinderApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MoviefinderApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MoviefinderApplication.class, args);
	}

	@Autowired
	private MovieFinderClient movieFinderClient;
	
	@Override
	public void run(String... arg0) throws Exception {

		Movie movie = movieFinderClient.getMovie("indiana+jones");
		
		logger.info("Response: ", movie);	
	}
}
