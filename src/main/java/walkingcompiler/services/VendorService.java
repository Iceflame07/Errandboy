package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Vendor;

@Service
public interface VendorService {

    Vendor findByVendorName(String vendorName);
    Vendor findByVendorContact(String vendorContact);
    Vendor findByVendorStoreName(String vendorStoreName);
    Vendor findByVendorStoreNumber(String vendorStoreNumber);
    Vendor findByVendorAddress(String vendorAddress);
    Vendor findByVendorCity(String vendorCity);
    Vendor findVendor(Vendor vendor);
    Vendor findByAccountNumber(String accountNumber);
    Vendor findByAccountName(String accountName);
    Vendor findByAccountType(String accountType);
    Vendor findByBankName(String bankName);
}
