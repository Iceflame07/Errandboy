package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Vendor;
import walkingcompiler.data.repository.VendorRepository;
import walkingcompiler.exceptions.VendorNotFoundException;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public Vendor findByVendorName(String vendorName) {
        return vendorRepository.findByVendorName(vendorName);
    }

    @Override
    public Vendor findByVendorContact(String vendorContact) {
        return vendorRepository.findByVendorContact(vendorContact);
    }

    @Override
    public Vendor findByVendorStoreName(String vendorStoreName) {
        return vendorRepository.findByVendorStoreName(vendorStoreName);
    }

    @Override
    public Vendor findByVendorStoreNumber(String vendorStoreNumber) {
        return vendorRepository.findByVendorStoreNumber(vendorStoreNumber);
    }

    @Override
    public Vendor findByVendorAddress(String vendorAddress) {
        return vendorRepository.findByVendorAddress(vendorAddress);
    }

    @Override
    public Vendor findByVendorCity(String vendorCity) {
        return vendorRepository.findByVendorCity(vendorCity);
    }

    @Override
    public Vendor findByAccountNumber(String accountNumber) {
        return vendorRepository.findByVendorAccountNumber(accountNumber);
    }

    @Override
    public Vendor findByAccountName(String accountName) {
        return vendorRepository.findByVendorAccountName(accountName);
    }

    @Override
    public Vendor findByAccountType(String accountType) {
        return vendorRepository.findByVendorAccountType(accountType);
    }

    @Override
    public Vendor findByBankName(String bankName) {
        return vendorRepository.findByVendorBankName(bankName);
    }

    @Override
    public Vendor findVendor(Vendor vendor) {
        return vendorRepository.findById(vendor.getVendorId()).orElseThrow(()->
                new VendorNotFoundException("vendor Not found"));
    }
}
