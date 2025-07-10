package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Vendor;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class VendorTest {

    @Test
    public void testForAvailableVendor() {
        Vendor v = new Vendor();
        v.setVendorId("");
        v.setVendorName("");
        v.setVendorAddress("");
        v.setVendorPassword("");
        v.setVendorStoreName("");
        v.setVendorStoreNumber("");
        v.setVendorContact("");
        v.setVendorCity("");
        v.setVendorBankName("");
        v.setVendorAccountName("");
        v.setVendorAccountNumber("");
        v.setVendorAccountType("");
        Assertions.assertEquals("", v.getVendorAddress());
        Assertions.assertEquals("", v.getVendorPassword());
        Assertions.assertEquals("", v.getVendorStoreName());
        Assertions.assertEquals("", v.getVendorStoreNumber());
        Assertions.assertEquals("", v.getVendorContact());
        Assertions.assertEquals("", v.getVendorCity());
        Assertions.assertEquals("", v.getVendorBankName());
        Assertions.assertEquals("", v.getVendorAccountName());
        Assertions.assertEquals("", v.getVendorAccountNumber());
        Assertions.assertEquals("", v.getVendorAccountType());
        Assertions.assertEquals("", v.getVendorCity());
        Assertions.assertEquals("", v.getVendorAccountName());
    }
}
