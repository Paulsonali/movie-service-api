package com.newgen.entertainment.service;

import com.newgen.entertainment.model.MovieData;

public class MovieService {
	
	UserService userService;
	MovieData[] movieData;
	public MovieService(UserService userService) {
		this.userService=userService;
		 movieData = userService.getAllMovie();
		
	}



	
	
	public void displayMovieDetail() {
		
		for(int i=0;i<movieData.length;i++) {
			//System.out.println(movieData[i]);
			System.out.println(movieData[i].getId());
			System.out.println("title :"+movieData[i].getTitle());
			System.out.println("date :"+movieData[i].getDate());
			
			System.out.println("Cast");
			for(String cast:movieData[i].getCast()) {
				System.out.print(cast+",");
				
			}
			System.out.println();
			System.out.println("Director :"+movieData[i].getDirectorName());
			System.out.println("Review");
			for(String review:movieData[i].getReviews()) {
				System.out.print(review+",");
				
				
			}
			System.out.println();
			System.out.println("Rating :" +movieData[i].getRatings());
			System.out.println("______________________________________________________________________________________________________");
			
		}
	}	
		
}