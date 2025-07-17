package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Card;

@Service
public interface CardService {

    Card findByCardLength(String cardLength);
    Card findByCardType(Card card);
}
