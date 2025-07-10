package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Rider;
import walkingcompiler.data.repository.RiderRepository;
import walkingcompiler.exceptions.RiderNotFoundException;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RiderRepository riderRepository;

    @Override
    public Rider findById(String id) {
        return riderRepository.findById(id).get();
    }

    @Override
    public Rider findByFirstName(String firstName) {
        return riderRepository.findByFirstName(firstName);
    }

    @Override
    public Rider findByLastName(String lastName) {
        return riderRepository.findByLastName(lastName);
    }

    @Override
    public Rider findByContact(String contact) {
        return riderRepository.findByContact(contact);
    }

    @Override
    public Rider findByPlateNumber(String plateNumber) {
        return riderRepository.findByPlateNumber(plateNumber);
    }

    @Override
    public Rider findByBankName(String bankName) {
        return riderRepository.findByBankName(bankName);
    }

    @Override
    public Rider findByAccountName(String accountName) {
        return riderRepository.findByAccountName(accountName);
    }

    @Override
    public Rider findByAccountNumber(String accountNumber) {
        return riderRepository.findByAccountNumber(accountNumber);
    }

    @Override
    public Rider findByAccountType(String accountType) {
        return riderRepository.findByAccountType(accountType);
    }

    @Override
    public Rider findRider(Rider rider) {
        return riderRepository.findById(rider.getRiderId()).orElseThrow(()->
                new RiderNotFoundException("Rider Not found"));
    }
}
