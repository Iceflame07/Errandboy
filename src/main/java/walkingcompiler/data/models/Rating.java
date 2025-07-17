package walkingcompiler.data.models;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    private String ratingExperience;
    private List<Rating> ratings;
}
