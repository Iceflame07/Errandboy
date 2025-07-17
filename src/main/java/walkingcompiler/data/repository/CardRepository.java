package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Card;

@Repository
public interface CardRepository extends MongoRepository <Card, String> {

    Card findByCardType(String cardType);
    Card findByCardLength(String cardLength);
}