package service;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Product;

@Getter
@Setter
@Accessors(chain = true)
public class ProductServiceTest {

    @Test
    void shouldCreateNewUserWhenEmailDoesNotExist() {
        String name = "Product name";
        String description = "Product description";
        String price = "Product price";
        String category = "Product category";
        Product expectedProduct = new Product();
        expectedProduct.setName(name);
        expectedProduct.setDescription(description);
        expectedProduct.setPrice(0.00);
        expectedProduct.setCategory(category);
        Assertions.assertEquals("", expectedProduct.getName());
        Assertions.assertEquals("", expectedProduct.getDescription());
        Assertions.assertEquals("", expectedProduct.getCategory());
        Assertions.assertEquals("", expectedProduct.getPrice());
    }

    @Test
    void shouldThrowExceptionWhenEmailAlreadyExists() {
        String name = "Existing product name";
    }
}