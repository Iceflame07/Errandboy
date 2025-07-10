package walkingcompiler.utils;
import walkingcompiler.data.models.User;
import walkingcompiler.dto.UserDto;

public class UserMapper {

    public static User MapToUser(UserDto user) {
        return new User(
                user.getUserId(),
                user.getFirstName(),
                user.getLastName(),
                user.getUsername(),
                user.getEmail(),
                user.getContact(),
                String.valueOf(user.getPassword().hashCode()),
                user.getBankName(),
                user.getBankAccountNumber(),
                user.getBankAccountType(),
                user.getBankAccountName()
        );
    }

    public static UserDto MapToUserDto(User user) {
        return new UserDto(
                user.getUserId(),
                user.getFirstName(),
                user.getLastName(),
                user.getUsername(),
                user.getEmail(),
                user.getContact(),
                user.getPassword(),
                user.getBankName(),
                user.getBankAccountNumber(),
                user.getBankAccountType(),
                user.getBankAccountName()
        );
    }
}
