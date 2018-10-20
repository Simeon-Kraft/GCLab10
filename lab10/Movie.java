package lab10;



public class Movie {

	
	private  String title;
	private String genre;
	private String director;
	
	public Movie() {}
	
	public Movie(String title, String genre, String director) {
		 this.title = title;
		 this.genre = genre;
		 this.director = director;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return title + "! A fine " + genre + " film by " + director + "!";
	}
}
