package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.User;

@Service
public interface UserService {

    User findByFirstName(String firstName);
    User findUser(User login);

}
