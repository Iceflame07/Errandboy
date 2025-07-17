package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Rating;
import walkingcompiler.dto.RatingDto;
import walkingcompiler.services.RatingService;
import walkingcompiler.utils.RatingMapper;

@RestController("/api")
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    @PostMapping("/rating")
    public ResponseEntity<RatingDto> listOfRating(@RequestBody Rating listOfRating) {
        Rating rate = ratingService.findByRatingExperience(listOfRating.getRatings().toString());
        return new ResponseEntity<>(RatingMapper.mapToRatingDto(rate), HttpStatus.CREATED);
    }

    @PostMapping("/Rate")
    public ResponseEntity<RatingDto> Rate(@RequestBody Rating rate) {
        Rating rating = ratingService.findByRatingExperience(rate.getRatingExperience());
        Rating found = ratingService.findByRatingExperience(rating.getRatingExperience());
        return new ResponseEntity<>(RatingMapper.mapToRatingDto(found), HttpStatus.OK);
    }
}
