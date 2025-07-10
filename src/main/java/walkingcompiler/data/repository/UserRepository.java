package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByFirstName(String firstName);
}
