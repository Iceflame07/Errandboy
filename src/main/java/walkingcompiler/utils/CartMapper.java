package walkingcompiler.utils;
import walkingcompiler.data.models.Cart;
import walkingcompiler.dto.CartDto;

public class CartMapper {

    public static Cart mapToCart(CartDto cart) {
        return new Cart(
                cart.getCartId()
        );
    }

    public static CartDto mapToCartDto(Cart cart) {
        return new CartDto(
                cart.getCartId()
        );
    }
}