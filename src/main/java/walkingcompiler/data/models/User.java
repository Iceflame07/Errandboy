package walkingcompiler.data.models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String userId;

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String contact;
    private String password;
    private String bankName;
    private String bankAccountNumber;
    private String bankAccountType;
    private String bankAccountName;
}
