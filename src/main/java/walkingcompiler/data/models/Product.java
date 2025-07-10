package walkingcompiler.data.models;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String name;
    private String description;
    private double price;
    private String category;
}
