package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Cart;
import walkingcompiler.data.repository.CartRepository;
import walkingcompiler.exceptions.CartNotFoundException;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart findByCartId(String cartId) {
        return cartRepository.findCartByCartId(cartId);
    }

    @Override
    public Cart findCart(Cart cart) {
        return cartRepository.findById(cart.getCartId()).orElseThrow(()->
                new CartNotFoundException("Cart Not found"));
    }
}
