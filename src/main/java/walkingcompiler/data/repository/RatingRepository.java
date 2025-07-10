package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    Rating readRatingBy(String ratingExperience);
}
