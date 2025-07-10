package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.User;
import walkingcompiler.data.repository.UserRepository;
import walkingcompiler.exceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @Override
    public User findUser(User user) {
        return userRepository.findById(user.getUserId()).orElseThrow(()->
                new UserNotFoundException("User Not found"));
    }

}
