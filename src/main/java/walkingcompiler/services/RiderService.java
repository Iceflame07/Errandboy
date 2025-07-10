package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rider;

@Service
public interface RiderService {

    Object findById(String id);
    Rider findByFirstName(String firstName);
    Rider findByLastName(String lastName);
    Rider findByContact(String contact);
    Rider findByPlateNumber(String plateNumber);
    Rider findByBankName(String bankName);
    Rider findByAccountName(String accountName);
    Rider findByAccountNumber(String accountNumber);
    Rider findByAccountType(String accountType);
    Rider findRider(Rider rider);
}
