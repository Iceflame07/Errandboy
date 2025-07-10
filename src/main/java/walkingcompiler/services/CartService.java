package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Cart;

@Service
public interface CartService {

    Cart findByCartId(String cartId);
    Cart findCart(Cart cart);
}
