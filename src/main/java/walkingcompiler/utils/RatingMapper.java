package walkingcompiler.utils;
import walkingcompiler.data.models.Rating;
import walkingcompiler.dto.RatingDto;

public class RatingMapper {

    public static Rating mapToRating(RatingDto rating) {
        return new Rating(
                rating.getRatingExperience()
        );
    }

    public static RatingDto mapToRatingDto(Rating rating) {
        return new RatingDto(
                rating.getRatingExperience()
        );
    }
}
