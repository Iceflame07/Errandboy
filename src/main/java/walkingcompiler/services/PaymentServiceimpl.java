package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Payment;
import walkingcompiler.data.repository.PaymentRepository;
import walkingcompiler.exceptions.PaymentNotFoundException;

@Service
public class PaymentServiceimpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment findByCardType(String cardType) {
        return paymentRepository.findByCardType(cardType);
    }

    @Override
    public Payment findByCardLength(String cardLength) {
        return paymentRepository.findByCardLength(cardLength);
    }

    @Override
    public Payment findByCompanyAccount(String companyAccount) {
        if (companyAccount == null || companyAccount.trim().isEmpty()) {
            throw new PaymentNotFoundException("Company account number not found");
        } else {
            return paymentRepository.findByCompanyAccount(companyAccount);
        }
    }
}
