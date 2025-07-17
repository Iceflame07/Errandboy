package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rating;

import java.util.List;

@Service
public interface RatingService {

    Rating findByRatingExperience(String ratingExperience);
    List<Rating> findAll();
}
