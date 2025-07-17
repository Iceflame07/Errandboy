package walkingcompiler.utils;
import walkingcompiler.data.models.Card;
import walkingcompiler.data.models.CardDto;

public class CardMapper {

    public static Card mapToCard(Card card) {
        return new Card(
                card.getCardType(),
                card.getCardNumber()
        );
    }

    public static CardDto mapToCardDto(Card card) {
        return new CardDto(
                card.getCardType(),
                card.getCardNumber()
        );
    }
}