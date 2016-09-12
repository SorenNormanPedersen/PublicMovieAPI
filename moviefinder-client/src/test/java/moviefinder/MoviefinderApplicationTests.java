package moviefinder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviefinderApplicationTests {

	@Test
	public void test() {
		
		String url = "http://www.omdbapi.com/?t=indiana+jones&y=&plot=full&r=json";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
				
		System.out.println(response);
		
	}

}
