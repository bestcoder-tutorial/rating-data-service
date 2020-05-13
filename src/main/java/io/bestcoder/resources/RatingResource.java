package io.bestcoder.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ratings")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId")String ratingId) {
		return new Rating(ratingId, 4);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId")String userId) {
		return new UserRating(userId,Arrays.asList(new Rating("1", 2)));
	}
	
}
