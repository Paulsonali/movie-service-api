package com.newgen.entertainment.client;

import com.newgen.entertainment.service.MovieService;
import com.newgen.entertainment.service.UserService;

public class MovieServiceClient {

	public static void main(String[] args) {
		
		UserService userService=new UserService(3);
		MovieService movieService=new MovieService(userService);
		movieService.displayMovieDetail();
		
				
	}

}
