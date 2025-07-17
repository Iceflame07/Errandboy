package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;
import walkingcompiler.data.models.Rating;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto {

    @Id
    private String ratingExperience;
    private List<Rating> ratings;
}
