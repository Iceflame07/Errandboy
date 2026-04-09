package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Payment;

@Repository
public interface PaymentRepository extends MongoRepository <Payment, String> {

    Payment findByCardType(String cardType);
    Payment findByCardLength(String cardLength);
    Payment findByCompanyAccount(String companyAccount);
}