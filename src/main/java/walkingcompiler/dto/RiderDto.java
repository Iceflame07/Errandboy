package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RiderDto {

    @Id
    private String riderId;

    private String firstName;
    private String lastName;
    private String contact;
    private String password;
    private String plateNumber;
    private String bankName;
    private String accountName;
    private String accountType;
    private String accountNumber;
}
