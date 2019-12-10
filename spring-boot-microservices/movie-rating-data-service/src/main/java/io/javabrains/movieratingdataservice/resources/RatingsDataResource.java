package io.javabrains.movieratingdataservice.resources;

import io.javabrains.movieratingdataservice.models.Rating;
import io.javabrains.movieratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

        @RequestMapping("/{movieId}")
        public Rating getRating(@PathVariable("movieId") String movieId){

            return new Rating(movieId, 4);
        }

        @RequestMapping("users/{userId}")
        public UserRating getUserRating(@PathVariable("userId") String userId){

            List<Rating> ratings = Arrays.asList(

                    new Rating("1234",4),
                    new Rating("5678",2)
            );

            UserRating userRating = new UserRating();
            userRating.setUserRating(ratings);
            return userRating;

           // return ratings;
        }

}
