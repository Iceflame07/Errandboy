package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Items;

@Repository
public interface ItemsRepository extends MongoRepository<Items, String> {

    Items findByItemsId(String itemsId);
    Items findByItemName(String itemName);
    Items findByItemDescription(String itemDescription);
    Items findByItemCategory(String itemCategory);
    Items findByItemPrice(String itemPrice);
    Items findByItemUnits(String itemUnits);
}
