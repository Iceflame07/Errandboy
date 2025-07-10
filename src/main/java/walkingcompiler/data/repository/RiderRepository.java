package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Rider;

@Repository
public interface RiderRepository extends MongoRepository<Rider, String> {

    Rider findByFirstName(String firstName);
    Rider findByLastName(String lastName);
    Rider findByContact(String contact);
    Rider findByPlateNumber(String plateNumber);
    Rider findByBankName(String bankName);
    Rider findByAccountName(String accountName);
    Rider findByAccountNumber(String accountNumber);
    Rider findByAccountType(String accountType);
}
