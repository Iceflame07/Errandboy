package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Items;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class ItemsTest {

    @Test
    public void testForItems() {
        Items items = new Items();
        items.setItemUnits("");
        items.setItemName("");
        items.setItemDescription("");
        items.setItemCategory("");
        items.setItemPrice("");
        Assertions.assertEquals("", items.getItemUnits());
        Assertions.assertEquals("", items.getItemName());
        Assertions.assertEquals("", items.getItemDescription());
        Assertions.assertEquals("", items.getItemCategory());
        Assertions.assertEquals("", items.getItemPrice());
    }
}
