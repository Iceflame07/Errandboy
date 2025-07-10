package walkingcompiler.data.models;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    @Id
    private String itemsId;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemUnits;
    private String itemCategory;

}
