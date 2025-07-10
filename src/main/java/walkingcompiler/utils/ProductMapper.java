package walkingcompiler.utils;
import walkingcompiler.data.models.Product;
import walkingcompiler.dto.ProductDto;

public class ProductMapper {

    public static Product mapToProduct(ProductDto product) {
        return new Product(
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory()
        );
    }

    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory()
        );
    }
}