package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rating;

@Service
public interface RatingService {

    Rating findByRatingExperience(String ratingExperience);
}
