package com.newgen.entertainment.service;

import com.newgen.entertainment.model.MovieData;

public class UserService {
	MovieData[] movieData;
	int count;
	

	public UserService(int size) {

		movieData = new MovieData[size];
		intilizeMovieDetail();

	}

	private void intilizeMovieDetail() {
		movieData[0] = new MovieData("Venom", "Action", "2024",
				new String[] { "Tom Harady", "Juno Temple", "Andy Serkis" }, "Kelly Marcel",
				new String[] { "It is a nice you should watch ",
						"Venom is an action packed scintic film that takes audiences on a wild ride filled with thrills humor and an iconic ." },
				"***");
		count++;
		movieData[1] = new MovieData( "pushpa 2", "Action", "2025",
				new String[] { "Allu Arjun", "Rashmika Mandanna" }, "Sukumar",
				new String[] { "nice movie", "story is better" }, "****");
		count++;
		movieData[2] = new MovieData("Avenger:End Game", "Action", "2019",
				new String[] { "Robert Downey Jr.", "Chris Hemsworth", "Chris Evans" }, "Anthony Russo",
				new String[] { "Endgame is all payoff",
						"Avengers: Endgame\" is a cinematic masterpiece that flawlessly concludes the Marvel "
								+ "Cinematic Universe's epic Infinity Saga." },
				"*****");
		count++;
	}

	public void addMovie(MovieData movieDatas) {
		movieData[count] = movieDatas;
		count++;
		//System.out.println(current);
		System.out.println("added");

	}

	public void deleteMovie(int id) {
		for (int i = 0; i < movieData.length; i++) {
			if (movieData[i].getId() == id) {
				movieData[i] = null;
				break;
			}
		}
	}

	public void updateMovie(MovieData data) {
		int id = data.getId();
		for (int i = 0; i < movieData.length; i++) {
			if (id == movieData[i].getId()) {
				movieData[i] = data;
			}
		}
	}

	public void searchMovieByTitle(String s) {
		for (int i = 0; i < movieData.length; i++) {
			if (movieData[i] != null) {
				if (movieData[i].getTitle().equals(s)) {
					System.out.println(movieData[i]);
				}
			}
		}

	}

	public MovieData[] searchMovieByGener(String s) {
		MovieData[] data=null;
		for (int i = 0; i < movieData.length; i++) {
			if (movieData[i] != null) {
				if (movieData[i].getGenre().equals(s)) {
					data=movieData;
					System.out.println(data[i]);
				}
			}
		}
		return data;
	}

	public void searchMovieByYear(String s) {
		for (int i = 0; i < movieData.length; i++) {
			if (movieData[i] != null) {
				if (movieData[i].getDate().equals(s)) {
					System.out.println(movieData[i]);
				}
			}
		}
	}

	public MovieData[] getAllMovie() {
		return movieData;

	}

}
