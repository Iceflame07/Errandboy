package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Rider;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class RiderTest {

    @Test
    public void testForAvailableRider() {
        Rider ride = new Rider();
        ride.setRiderId("");
        ride.setBankName("");
        ride.setAccountNumber("");
        ride.setPassword("");
        ride.setPlateNumber("");
        ride.setContact("");
        ride.setFirstName("");
        ride.setLastName("");
        ride.setAccountName("");
        ride.setAccountType("");
        Assertions.assertEquals("", ride.getRiderId());
        Assertions.assertEquals("", ride.getBankName());
        Assertions.assertEquals("", ride.getAccountNumber());
        Assertions.assertEquals("", ride.getPassword());
        Assertions.assertEquals("", ride.getPlateNumber());
        Assertions.assertEquals("", ride.getContact());
        Assertions.assertEquals("", ride.getFirstName());
        Assertions.assertEquals("", ride.getLastName());
        Assertions.assertEquals("", ride.getAccountName());
        Assertions.assertEquals("", ride.getAccountType());
    }
}
