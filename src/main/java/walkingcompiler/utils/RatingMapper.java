package walkingcompiler.utils;
import walkingcompiler.data.models.Rating;
import walkingcompiler.dto.RatingDto;


public class RatingMapper {

    public static Rating mapToRating(RatingDto rate) {
        return new Rating(
                rate.getRatingExperience(),
                rate.getRatings()
        );
    }

    public static RatingDto mapToRatingDto(Rating rating) {
        return new RatingDto(
                rating.getRatingExperience(),
                rating.getRatings()
        );
    }
}
