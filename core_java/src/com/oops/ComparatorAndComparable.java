package com.oops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * <h3>This program represents sorting movie list by rating , by year and by
 * name..</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 10-04-2024
 */
class Movie implements Comparable<Movie> {

	private double rating;
	private String name;
	private int year;

	public Movie(double rating, String name, int year) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public int compareTo(Movie movie) {
		return this.year - movie.year;
	}

	public int getyear() {
		return year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

}

class CompareRate implements Comparator<Movie> {

	public int compare(Movie object1, Movie object2) {
		if (object1.getRating() < object2.getRating()) {
			return -1;
		}
		if (object1.getRating() > object2.getRating()) {
			return 1;
		} else {
			return 0;
		}
	}

}

class CompareName implements Comparator<Movie> {

	public int compare(Movie firstObject, Movie secondObject) {
		return firstObject.getName().compareTo(secondObject.getName());
	}

}

public class ComparatorAndComparable {

	public static void main(String[] args) {
		ArrayList<Movie> movie = new ArrayList<Movie>();
		movie.add(new Movie(5, "Hellaro", 2022));
		movie.add(new Movie(4.5, "Reva", 2021));
		movie.add(new Movie(4.5, "Brahmastra", 2020));
		movie.add(new Movie(2, "Adipurush", 2024));

		System.out.println("Sort by rating. ASC ");
		CompareRate rating = new CompareRate();
		Collections.sort(movie, rating);
		for (Movie rate : movie) {
			System.out.println(rate.getName() + "-" + rate.getRating() + "-" + rate.getyear());
		}

		System.out.println();
		System.out.println("Sort by name.");
		CompareName name = new CompareName();
		Collections.sort(movie, name);
		for (Movie movieName : movie) {
			System.out.println(movieName.getName() + "-" + movieName.getyear() + "-" + movieName.getRating());
		}

		System.out.println();
		System.out.println("Sort by year.");
		Collections.sort(movie);
		for (Movie year : movie) {
			System.out.println(year.getRating() + "-" + year.getName() + "-" + year.getyear());
		}
	}

}