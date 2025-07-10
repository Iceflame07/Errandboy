package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto {

    @Id
    private String ratingExperience;
}
