package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Product;

@Getter
@Setter
@AllArgsConstructor
public class ProductTest {

    @Test
    public void testAddProductDetails() {
       Product p = new Product();
       p.setName("");
       p.setDescription("");
       p.setPrice(0.0);
       p.setCategory("");
       Assertions.assertEquals("", p.getName());
       Assertions.assertEquals("", p.getDescription());
       Assertions.assertEquals(0.0, p.getPrice());
       Assertions.assertEquals("", p.getCategory());
    }
}