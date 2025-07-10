package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Rating;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class RatingTest {

    @Test
    public void testForRatingExperience() {
        Rating rate = new Rating();
        rate.setRatingExperience("");
        Assertions.assertEquals("", rate.getRatingExperience());
    }
}
