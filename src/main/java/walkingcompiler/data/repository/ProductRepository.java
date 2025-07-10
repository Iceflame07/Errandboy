package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    Product findByName(String name);
    Product findByDescription(String description);
    Product findByCategory(String category);
    Product findByPrice(double price);
}
