package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Cart;
import java.util.List;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

    Cart findCartByCartId(String cartId);
}
