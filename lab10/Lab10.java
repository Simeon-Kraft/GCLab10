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
				System.out.println("\nFilms by Title\n" + "==============\n");

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

		Movie gone = new Movie("Gone With the Wind", "drama", "Victor Fleming");

		Movie third = new Movie("The Third Man", "drama", "Orson Welles");

		Movie king = new Movie("The King's Speech", "drama", "Tom Hooper");

		Movie godfather = new Movie("The Godfather", "drama", "Francis Ford Coppola");

		Movie leben = new Movie("Das Leben der Anderen", "drama", "Florian Henckel von Donnersmarck");

		Movie snow = new Movie("Snowpiercer", "sci-fi", "Bong Joon-ho");

		Movie brazil = new Movie("Brazil", "sci-fi", "Terry Gilliam");

		Movie robot = new Movie("I, Robot", "sci-fi", "Alex Proyas");

		Movie primer = new Movie("Primer", "sci-fi", "Shane Carruth");

		Movie blade = new Movie("Blade Runner", "sci-fi", "Ridley Scott");

		Movie kiki = new Movie("Kiki's Delivery Service", "animated", "Hayao Miyazaki");

		Movie poppy = new Movie("From Up on Poppy Hill", "animated", "Hayao Miyazaki");

		Movie spirit = new Movie("Spirited Away", "animated", "Hayao Miyazaki");

		Movie porco = new Movie("Porco Rosso", "animated", "Hayao Miyazaki");

		Movie grave = new Movie("Grave of the Fireflies", "animated", "Hayao Miyazaki");

		Movie nos = new Movie("Nosferatu", "horror", "F.W. Murnau");

		Movie shining = new Movie("The Shining", "horror", "Stanley Kubrick");

		Movie psycho = new Movie("Psycho", "horror", "Alfred Hitchcock");

		Movie jaws = new Movie("Jaws", "horror", "Steven Spielberg");

		Movie birds = new Movie("The Birds", "horror", "Alfred Hitchcock");

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
