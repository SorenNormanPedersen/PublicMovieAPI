package moviefinder.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import moviefinder.MoviefinderApplication;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MoviefinderApplication.class)
@WebIntegrationTest
public class MovieControllerTest {

	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void MovieReturnsCorrectHttpResponseAndPayLoad() throws Exception {
		String movieFinderUrl = "http://www.omdbapi.com/?t=indiana+jones&y=&plot=full&r=json";
		
		mockMvc.perform(get(movieFinderUrl))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andDo(print())
		.andReturn();
	}  
}
 