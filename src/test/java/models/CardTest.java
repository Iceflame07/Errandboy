package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Card;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class CardTest {

    @Test
    public void testForCardFeatures() {
        Card card = new Card();
        card.setCardLength(card.getCardLength() + 16);
        card.setMasterCard("");
        card.setVisaCard("");
        card.setCardType("");
        Assertions.assertEquals("", card.getMasterCard());
        Assertions.assertEquals("", card.getVisaCard());
        Assertions.assertEquals("", card.getCardType());
    }
}
