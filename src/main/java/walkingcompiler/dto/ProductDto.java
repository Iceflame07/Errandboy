package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    @Id
    private String name;
    private String description;
    private double price;
    private String category;
}
