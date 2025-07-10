package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemsDto {

    @Id
    private String itemsId;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemUnits;
    private String itemCategory;

}
