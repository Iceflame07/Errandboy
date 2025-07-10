package walkingcompiler.dto;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendorDto {

    @Id
    private String vendorId;

    private String vendorName;
    private String vendorAddress;
    private String vendorContact;
    private String vendorPassword;
    private String vendorStoreNumber;
    private String vendorStoreName;
    private String vendorCity;
    private String vendorAccountName;
    private String vendorAccountNumber;
    private String vendorAccountType;
    private String vendorBankName;
}
