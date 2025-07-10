package walkingcompiler.utils;
import walkingcompiler.data.models.Vendor;
import walkingcompiler.dto.VendorDto;

public class VendorMapper {

    public static Vendor mapToVendor(VendorDto vendor) {
        return new Vendor(
                vendor.getVendorId(),
                vendor.getVendorName(),
                vendor.getVendorAddress(),
                vendor.getVendorContact(),
                vendor.getVendorStoreName(),
                vendor.getVendorStoreNumber(),
                String.valueOf(vendor.getVendorPassword().hashCode()),
                vendor.getVendorCity(),
                vendor.getVendorAccountName(),
                vendor.getVendorAccountType(),
                vendor.getVendorAccountNumber(),
                vendor.getVendorBankName()
        );
    }

    public static VendorDto mapToVendorDto(Vendor vendor) {
        return new VendorDto(
                vendor.getVendorId(),
                vendor.getVendorName(),
                vendor.getVendorContact(),
                vendor.getVendorStoreName(),
                vendor.getVendorStoreNumber(),
                vendor.getVendorAddress(),
                vendor.getVendorPassword(),
                vendor.getVendorCity(),
                vendor.getVendorAccountName(),
                vendor.getVendorAccountNumber(),
                vendor.getVendorAccountType(),
                vendor.getVendorBankName()
        );
    }
}