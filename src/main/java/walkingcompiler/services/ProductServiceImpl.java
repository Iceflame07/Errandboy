package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Product;
import walkingcompiler.data.repository.ProductRepository;
import walkingcompiler.exceptions.ProductNotFoundException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product findByDescription(String description) {
        return productRepository.findByDescription(description);
    }

    @Override
    public Product findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product findByPrice(double price) {
        return productRepository.findByPrice(price);
    }

    @Override
    public Product findProduct(Product product) {
        Optional<Product> foundProductOptional = Optional.ofNullable(productRepository.findByName(product.getDescription()));
        return foundProductOptional.orElseThrow(() -> new ProductNotFoundException("Product not found with description: " + product.getDescription()));
    }
}
