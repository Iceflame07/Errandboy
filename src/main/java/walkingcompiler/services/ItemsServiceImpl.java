package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Items;
import walkingcompiler.data.repository.ItemsRepository;
import walkingcompiler.exceptions.ItemOutOfStockException;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public Items findByItemsId(String item) {
        return itemsRepository.findByItemsId(item);
    }

    @Override
    public Items findByItemName(String itemName) {
        return itemsRepository.findByItemName(itemName);
    }

    @Override
    public Items findByItemDescription(String itemDescription) {
        return itemsRepository.findByItemDescription(itemDescription);
    }

    @Override
    public Items findByItemCategory(String itemCategory) {
        return itemsRepository.findByItemCategory(itemCategory);
    }

    @Override
    public Items findByItemPrice(String itemPrice) {
        return itemsRepository.findByItemPrice(itemPrice);
    }

    @Override
    public Items findByItemUnits(String itemUnits) {
        return itemsRepository.findByItemUnits(itemUnits);
    }

    @Override
    public Items findItems(String items) {
        return itemsRepository.findById(items.toString()).orElseThrow(()->
                new ItemOutOfStockException("item Not Available"));
    }
}
