package com.newgen.entertainment.client;

import com.newgen.entertainment.model.MovieData;
import com.newgen.entertainment.service.UserService;

public class UserServiceClient {

	public static void main(String[] args) {
		UserService userService=new UserService(6);
		MovieData movieData1=new MovieData( "AAA","Comedy", "2021",new String[] {"Raj","sayali"}, "Mr.Peter",
				new String[]{"Nice","Average"}, "**");
		userService.addMovie(movieData1);
		MovieData movieData2=new MovieData("BBB","Family", "2024",new String[] {"Raj","sayali"}, "Mr.Peter",
				new String[] {"Nice","Average"}, "****");
		userService.addMovie(movieData2);
		MovieData movieData3=new MovieData("CCC","Action", "2025",new String[] {"Raj","sayali"}, "Mr.Peter",
				new String[] {"Nice","Average"}, "***");
		userService.addMovie(movieData3); 
	System.out.println("____________________________________________________");
	MovieData[] movieData = userService.getAllMovie();
	MovieData originalString=movieData[3];
	originalString.setTitle("Black");
	userService.updateMovie(originalString);
	userService.getAllMovie();
	for(MovieData m:movieData) {
		System.out.println(m);
	}
	
	System.out.println("____________________________________________________________________________________________________________");
	userService.deleteMovie(4);
	userService.getAllMovie();
	for(MovieData m:movieData) {
		System.out.println(m);
	}
	
	System.out.println("__________________________________________________________________________________________________________");
	
	System.out.println("searching by Title ");
	userService.searchMovieByTitle("Venom");
	
	System.out.println("_________________________________________________________________________________________________________");
	System.out.println("searching by Gener ");
	userService.searchMovieByGener("Action");
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println("searching by Date ");
	userService.searchMovieByYear("2024");
		
	}

}
