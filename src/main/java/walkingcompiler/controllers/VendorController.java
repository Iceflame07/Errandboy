package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Vendor;
import walkingcompiler.dto.VendorDto;
import walkingcompiler.services.VendorService;
import walkingcompiler.utils.VendorMapper;

@RestController("/api")
@RequiredArgsConstructor
public class VendorController {

    private final VendorService vendorService;

    @PostMapping("/create")
    public ResponseEntity<VendorDto> create(@RequestBody VendorDto vendorDto) {
        Vendor vendor = vendorService.findByVendorName(vendorDto.getVendorName());
        return new ResponseEntity<>(VendorMapper.mapToVendorDto(vendor), HttpStatus.CREATED);
    }

    @PostMapping("/vendor")
    public ResponseEntity<VendorDto> vendor(@RequestBody VendorDto vendor) {
        Vendor found = VendorMapper.mapToVendor(vendor);
        Vendor seller = vendorService.findVendor(found);
        return new ResponseEntity<>(VendorMapper.mapToVendorDto(seller), HttpStatus.OK);
    }
}