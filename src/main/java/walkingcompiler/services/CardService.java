package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Card;

@Service
public interface CardService {

    Card findByVisaCard(String visaCard);
    Card findByMasterCard(String masterCard);
    Card findByCardLength(String cardLength);
    Card findCardType(Card card);
}
