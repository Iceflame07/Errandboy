package walkingcompiler.utils;
import walkingcompiler.data.models.Rider;
import walkingcompiler.dto.RiderDto;

public class RiderMapper {

    public static Rider mapToRider(RiderDto rider) {
        return new Rider(
                rider.getFirstName(),
                rider.getLastName(),
                rider.getContact(),
                rider.getBankName(),
                rider.getPlateNumber(),
                String.valueOf(rider.getPassword().hashCode()),
                rider.getAccountName(),
                rider.getRiderId(),
                rider.getAccountNumber(),
                rider.getAccountType()
        );
    }

    public static RiderDto mapToRiderDto(Rider rider) {
        return new RiderDto(
                rider.getRiderId(),
                rider.getFirstName(),
                rider.getLastName(),
                rider.getContact(),
                rider.getBankName(),
                rider.getAccountNumber(),
                rider.getAccountType(),
                rider.getPlateNumber(),
                rider.getPassword(),
                rider.getAccountName()
        );
    }
}