package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.User;
import walkingcompiler.dto.UserDto;
import walkingcompiler.services.UserService;
import walkingcompiler.utils.UserMapper;

@RestController("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/Signup")
    public ResponseEntity<UserDto> signUp(@RequestBody UserDto signup) {
        User user = userService.findByFirstName(String.valueOf(signup));
        return new ResponseEntity<>(UserMapper.MapToUserDto(user), HttpStatus.CREATED);
    }

    @PostMapping("/Login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto login) {
        User found = UserMapper.MapToUser(login);
        User user = userService.findUser(found);
        return new ResponseEntity<>(UserMapper.MapToUserDto(user), HttpStatus.OK);
    }
}
