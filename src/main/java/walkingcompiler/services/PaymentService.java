package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Payment;

@Service
public interface PaymentService {

    Payment findByCardType(String cardType);
    Payment findByCardLength(String cardLength);
    Payment findByCompanyAccount(String companyAccount);
}
