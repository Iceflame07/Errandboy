package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Product;

@Service
public interface ProductService {

    Product findByName(String name);
    Product findByDescription(String description);
    Product findByCategory(String category);
    Product findByPrice(double price);
    Product findProduct(Product product);
}
