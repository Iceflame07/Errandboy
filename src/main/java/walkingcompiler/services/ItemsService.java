package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Items;

@Service
public interface ItemsService {

    Items findByItemsId(String item);
    Items findByItemName(String itemName);
    Items findByItemDescription(String itemDescription);
    Items findByItemCategory(String itemCategory);
    Items findByItemPrice(String itemPrice);
    Items findByItemUnits(String itemUnits);
    Items findItems(String items);
}
