package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab10 {

	static List<Movie> movies = new ArrayList<>();
	static List<String> directors = new ArrayList<>();
	static List<String> genres = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String goAgain = null;
		movieInit();

		System.out.println("Welcome to a weird film database.\n");

		do {
			System.out.println(
					"Would you like to browse by title, genre, or director? (enter title, genre, or director)");
			String userSelect = browseChoice(scnr.nextLine().toLowerCase(), scnr);
			System.out.println(userSelect);

			if (userSelect.equals("title")) {
				System.out.println("\nFilms by Title\n" + "==============\n"
			);
				
				browseByTitle(scnr);
			}

			if (userSelect.equals("genre")) {
				System.out.println("\nFilms by Genre\n" + "===============\n");
				for (String type : genres) {
					System.out.println(type);
				}
				browseByGenre(scnr);
			}
			
			if (userSelect.equals("director")) {
				System.out.println("\nFilms by Director\n" + "=================\n");
				for (String dir : directors) {
					System.out.println(dir);
				}
				browseByDirector(scnr);
			}

			
			
			
			
			System.out.println("Do you want to continue browsing? (y/n)");
			goAgain = scnr.nextLine();
		} while (goAgain.equalsIgnoreCase("y"));

		System.out.println("Goodbye.");

	}
	
	public static void browseByDirector(Scanner scnr) {
		
		System.out.println("\nChoose a director (Enter full name): ");
		String userInput = scnr.nextLine();
		
		boolean directorExists = false;
		for (Movie film : movies) {
			if (film.getDirector().equalsIgnoreCase(userInput)) {
				directorExists = true;
				
				System.out.println(film.getTitle());
				
			}
		}
		if (!directorExists) {
			System.out.println("It seems we have no films by that director. Try again.\n");
			browseByDirector(scnr);
		}
		
		System.out.println("Enter a film title to learn about it: \n");
		String userTitle = scnr.nextLine();

		for (Movie film : movies) {
			if (film.getTitle().equalsIgnoreCase(userTitle)) {
				System.out.println(film);
				return;
			}
		}
		
		System.out.println("This database has no films by that name.");

	}
		
		
		


	public static void browseByGenre(Scanner scnr) {

		System.out.println("Which genre interests you?");
		String userSelect = scnr.nextLine().toLowerCase();

		if ((!userSelect.equals("drama")) && (!userSelect.equals("horror")) && (!userSelect.equals("animated"))
				&& (!userSelect.equals("sci-fi"))) {
			System.out.println("We have no films of that variety.");
			browseByGenre(scnr);
		}

		System.out.println("Films by Genre");
		System.out.println("==============");

		for (Movie types : movies) {
			if (types.getGenre().equals(userSelect)) {
				System.out.println(types.getTitle() + "\n");
			}
		}

		System.out.println("Enter a film title to learn about it: \n");
		String userTitle = scnr.nextLine();

		for (Movie film : movies) {
			if (film.getTitle().equalsIgnoreCase(userTitle)) {
				System.out.println(film);
				return;
			}
		}
		
		System.out.println("This database has no films by that name.");
		
		
	}

	public static void browseByTitle(Scanner scnr) {

		for (Movie film : movies) {
			System.out.println(film.getTitle());

		}

		System.out.println("\n");
		System.out.println("Enter a film title to learn about it: \n");
		String userTitle = scnr.nextLine();

		for (Movie film : movies) {
			if (film.getTitle().equalsIgnoreCase(userTitle)) {
				System.out.println(film);
				return;
			}
		}
		
		System.out.println("This database has no films by that name.");

	}

	public static String browseChoice(String str, Scanner scnr) {

		if (str.equals("title")) {
			return str;
		} else if (str.equals("genre")) {
			return str;
		} else if (str.equals("director")) {
			return str;
		}

		else {
			System.out.println("Please choose either title, genre, or director: ");
		}

		String newStr = browseChoice(scnr.nextLine().toLowerCase(), scnr);
		return newStr;

	}

	public static void movieInit() {
		
		genres.add("Horror");
		genres.add("Drama");
		genres.add("Animated");
		genres.add("Sci-fi");
		
		Movie gone = new Movie();
		gone.setTitle("Gone With the Wind");
		gone.setGenre("drama");
		gone.setDirector("Victor Fleming");

		Movie third = new Movie();
		third.setTitle("The Third Man");
		third.setGenre("drama");
		third.setDirector("Orson Welles");

		Movie king = new Movie();
		king.setTitle("The King's Speech");
		king.setGenre("drama");
		king.setDirector("Tom Hooper");

		Movie godfather = new Movie();
		godfather.setTitle("The Godfather");
		godfather.setGenre("drama");
		godfather.setDirector("Francis Ford Coppola");

		Movie leben = new Movie();
		leben.setTitle("Das Leben der Anderen");
		leben.setGenre("drama");
		leben.setDirector("Florian Henckel von Donnersmarck");

		Movie snow = new Movie();
		snow.setTitle("Snowpiercer");
		snow.setGenre("sci-fi");
		snow.setDirector("Bong Joon-ho");

		Movie brazil = new Movie();
		brazil.setTitle("Brazil");
		brazil.setGenre("sci-fi");
		brazil.setDirector("Terry Gilliam");

		Movie robot = new Movie();
		robot.setTitle("I, Robot");
		robot.setGenre("sci-fi");
		robot.setDirector("Alex Proyas");

		Movie primer = new Movie();
		primer.setTitle("Primer");
		primer.setGenre("sci-fi");
		primer.setDirector("Shane Carruth");

		Movie blade = new Movie();
		blade.setTitle("Blade Runner");
		blade.setGenre("sci-fi");
		blade.setDirector("Ridley Scott");

		Movie kiki = new Movie();
		kiki.setTitle("Kiki's Delivery Service");
		kiki.setGenre("animated");
		kiki.setDirector("Hayao Miyazaki");

		Movie poppy = new Movie();
		poppy.setTitle("From Up on Poppy Hill");
		poppy.setGenre("animated");
		poppy.setDirector("Hayao Miyazaki");

		Movie spirit = new Movie();
		spirit.setTitle("Spirited Away");
		spirit.setGenre("animated");
		spirit.setDirector("Hayao Miyazaki");

		Movie porco = new Movie();
		porco.setTitle("Porco Rosso");
		porco.setGenre("animated");
		porco.setDirector("Hayao Miyazaki");

		Movie grave = new Movie();
		grave.setTitle("Grave of the Fireflies");
		grave.setGenre("animated");
		grave.setDirector("Hayao Miyazaki");

		Movie nos = new Movie();
		nos.setTitle("Nosferatu");
		nos.setGenre("horror");
		nos.setDirector("F.W. Murnau");

		Movie shining = new Movie();
		shining.setTitle("The Shining");
		shining.setGenre("horror");
		shining.setDirector("Stanley Kubrick");

		Movie psycho = new Movie();
		psycho.setTitle("Psycho");
		psycho.setGenre("horror");
		psycho.setDirector("Alfred Hitchcock");

		Movie jaws = new Movie();
		jaws.setTitle("Jaws");
		jaws.setGenre("horror");
		jaws.setDirector("Steven Spielberg");

		Movie birds = new Movie();
		birds.setTitle("The Birds");
		birds.setGenre("horror");
		birds.setDirector("Alfred Hitchcock");

		movies.add(primer);
		movies.add(godfather);
		movies.add(gone);
		movies.add(robot);
		movies.add(brazil);
		movies.add(snow);
		movies.add(king);
		movies.add(third);
		movies.add(blade);
		movies.add(leben);
		movies.add(kiki);
		movies.add(poppy);
		movies.add(spirit);
		movies.add(porco);
		movies.add(grave);
		movies.add(birds);
		movies.add(jaws);
		movies.add(psycho);
		movies.add(shining);
		movies.add(nos);
		
		directors.add("Alfred Hitchcock");
		directors.add("Steven Spielberg");
		directors.add("Stanley Kubrick");
		directors.add("F.W. Murnau");
		directors.add("Hayao Miyazaki");
		directors.add("Ridley Scott");
		directors.add("Shane Carruth");
		directors.add("Alex Proyas");
		directors.add("Terry Gilliam");
		directors.add("Bong Joon-ho");
		directors.add("Florian Henckel von Donnersmarck");
		directors.add("Francis Ford Coppola");
		directors.add("Bong Joon-ho");
		directors.add("Tom Hooper");
		directors.add("Orson Welles");
		directors.add("Victor Fleming");

	}

}
