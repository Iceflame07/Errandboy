package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Cart;
import walkingcompiler.dto.CartDto;
import walkingcompiler.services.CartService;
import walkingcompiler.utils.CartMapper;


@RestController("/api")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/cart")
    public ResponseEntity<CartDto> cartId(@RequestBody CartDto cart) {
        Cart carrier = cartService.findByCartId(String.valueOf(cart));
        return new ResponseEntity<>(CartMapper.mapToCartDto(carrier), HttpStatus.CREATED);
    }

    @PostMapping("/valuable")
    public ResponseEntity<CartDto> valuable(@RequestBody CartDto valuable) {
        Cart found = CartMapper.mapToCart(valuable);
        Cart cart = cartService.findCart(found);
        return new ResponseEntity<>(CartMapper.mapToCartDto(cart), HttpStatus.OK);
    }
}
