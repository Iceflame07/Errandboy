package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Cart;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class CartTest {

    @Test
    public void testForCart() {
        Cart cart = new Cart();
        cart.setCartId("");
        Assertions.assertEquals("", cart.getCartId());
    }
}
