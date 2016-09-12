package moivefinder.dto;

public class Movie {

	private String title;
	private String year;
	
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + "]";
	}
	
	
	
	
	
}
