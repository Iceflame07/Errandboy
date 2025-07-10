package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Vendor;

@Repository
public interface VendorRepository extends MongoRepository<Vendor, String> {

    Vendor findByVendorName(String vendorName);
    Vendor findByVendorContact(String vendorContact);
    Vendor findByVendorAddress(String vendorAddress);
    Vendor findByVendorStoreName(String vendorStoreName);
    Vendor findByVendorStoreNumber(String vendorStoreNumber);
    Vendor findByVendorCity(String vendorCity);
    Vendor findByVendorAccountName(String vendorAccountName);
    Vendor findByVendorAccountNumber(String vendorAccountNumber);
    Vendor findByVendorAccountType(String vendorAccountType);
    Vendor findByVendorBankName(String vendorBankName);
}
