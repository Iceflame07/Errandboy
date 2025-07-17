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

    @PostMapping("/user")
    public ResponseEntity<Rider> user(@RequestBody Rider user) {
        Rider found = RiderMapper.mapToRider(user);
        Rider use = riderService.findByFirstName(found.getFirstName());
        return new ResponseEntity<>(RiderMapper.mapToRider(use), HttpStatus.OK);
    }
}
