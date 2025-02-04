package com.newgen.entertainment.model;

import java.util.Arrays;

public class MovieData extends AutoId{
	
	private int id;
	private String title;
	private String genre;
	private String date;
	private String[] cast;
	private String directorName;
	private String[] reviews;
	private String ratings;
	public MovieData(int id, String title, String genre, String date, String[] cast, String directorName, String[] reviews,
			String ratings) {
		super();
		this.id=id;
		this.title = title;
		this.genre = genre;
		this.date = date;
		this.cast = cast;
		this.directorName = directorName;
		this.reviews = reviews;
		this.ratings = ratings;
	}
	
	
	public MovieData(String title, String genre, String date, String[] cast, String directorName, String[] reviews,
			String ratings) {
		super();
		id=count++;
		this.title = title;
		this.genre = genre;
		this.date = date;
		this.cast = cast;
		this.directorName = directorName;
		this.reviews = reviews;
		this.ratings = ratings;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String[] getReviews() {
		return reviews;
	}
	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "MovieData [id=" + id + ", title=" + title + ", genre=" + genre + ", date=" + date + ", cast="
				+ Arrays.toString(cast) + ", directorName=" + directorName + ", reviews=" + Arrays.toString(reviews)
				+ ", ratings=" + ratings + "]";
	}
	
	
	

}
