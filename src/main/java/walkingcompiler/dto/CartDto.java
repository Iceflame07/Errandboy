package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {

    @Id
    private String cartId;
}
