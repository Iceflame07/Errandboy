package walkingcompiler.utils;
import walkingcompiler.data.models.Card;
import walkingcompiler.dto.CardDto;

public class CardMapper {

    public static Card mapToCard(CardDto card) {
        return new Card(
                card.getCardType(),
                card.getMasterCard(),
                card.getVisaCard(),
                card.getCardLength()
        );
    }

    public static CardDto mapToCardDto(Card card) {
        return new CardDto(
                card.getCardType(),
                card.getVisaCard(),
                card.getMasterCard(),
                card.getCardLength()
        );
    }
}