package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Card;
import walkingcompiler.data.repository.CardRepository;
import walkingcompiler.exceptions.CardNotFoundException;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card findByCardLength(String cardLength) {
        return cardRepository.findByCardLength(cardLength);
    }

    @Override
    public Card findByCardType(Card card) {
        return cardRepository.findById(card.getCardType()).orElseThrow(()->
                new CardNotFoundException("card Not found"));
    }
}
