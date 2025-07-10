package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Rider;
import walkingcompiler.dto.RiderDto;
import walkingcompiler.services.RiderService;
import walkingcompiler.utils.RiderMapper;


@RestController("/api")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/rider")
    public ResponseEntity<RiderDto> rider(@RequestBody RiderDto rider) {
        Rider ride = riderService.findByFirstName(String.valueOf(rider));
        return new ResponseEntity<>(RiderMapper.mapToRiderDto(ride), HttpStatus.CREATED);
    }

    @PostMapping("/ride")
    public ResponseEntity<Rider> ride(@RequestBody Rider ride) {
        Rider found = RiderMapper.mapToRider(ride);
        Rider user = riderService.findByFirstName(found.getFirstName());
        return new ResponseEntity<>(RiderMapper.mapToRider(user), HttpStatus.OK);
    }
}
