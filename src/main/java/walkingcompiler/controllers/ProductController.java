package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Product;
import walkingcompiler.dto.ProductDto;
import walkingcompiler.services.ProductService;
import walkingcompiler.utils.ProductMapper;

@RequiredArgsConstructor
@RestController("/api")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<ProductDto> product(@RequestParam ProductDto name) {
        Product product = productService.findByName(String.valueOf(name));
        return new ResponseEntity<>(ProductMapper.mapToProductDto(product), HttpStatus.CREATED);
    }

    @PostMapping("/describe")
    public ResponseEntity<ProductDto> findByDescription(@RequestBody ProductDto describe) {
        Product found = productService.findByName(describe.getDescription());
        Product use = productService.findByName(found.getDescription());
        return new ResponseEntity<>(ProductMapper.mapToProductDto(use), HttpStatus.OK);
    }
}
