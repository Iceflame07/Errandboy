package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.User;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class UserTest {

    @Test
    public void testForUser() {
        User use = new User();
        use.setFirstName("John");
        use.setLastName("Doe");
        use.setEmail("john@doe.com");
        use.setPassword("password");
        use.setUserId("");
        use.setContact("");
        use.setBankAccountName("");
        use.setBankAccountNumber("");
        use.setBankAccountType("");
        use.setBankName("");
        use.setUsername("");
        Assertions.assertEquals("John", use.getFirstName());
        Assertions.assertEquals("Doe", use.getLastName());
        Assertions.assertEquals("john@doe.com", use.getEmail());
        Assertions.assertEquals("password", use.getPassword());
        Assertions.assertEquals("", use.getUserId());
        Assertions.assertEquals("", use.getContact());
        Assertions.assertEquals("", use.getBankAccountName());
        Assertions.assertEquals("", use.getBankAccountNumber());
        Assertions.assertEquals("", use.getBankAccountType());
        Assertions.assertEquals("", use.getBankName());
        Assertions.assertEquals("", use.getUsername());
    }
}
