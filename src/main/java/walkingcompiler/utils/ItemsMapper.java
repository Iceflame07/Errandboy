package walkingcompiler.utils;
import walkingcompiler.data.models.Items;
import walkingcompiler.dto.ItemsDto;

public class ItemsMapper {

     public static Items mapToItems(ItemsDto item) {
         return new Items(
                 item.getItemsId(),
                 item.getItemName(),
                 item.getItemDescription(),
                 item.getItemPrice(),
                 item.getItemUnits(),
                 item.getItemCategory()
         );
     }

     public static ItemsDto mapToItemsDto(Items items) {
         return new ItemsDto(
                 items.getItemsId(),
                 items.getItemName(),
                 items.getItemDescription(),
                 items.getItemUnits(),
                 items.getItemPrice(),
                 items.getItemCategory()
         );
     }
}