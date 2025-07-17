package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rating;
import walkingcompiler.data.repository.RatingRepository;
import java.util.List;


@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating findByRatingExperience(String ratingExperience) {
        return ratingRepository.readRatingBy(ratingExperience);
    }

    @Override
    public List<Rating> findAll() {
        return List.of();
    }
}
