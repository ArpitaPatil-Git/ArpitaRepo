import java.util.Optional;

public class LoginService {
    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);

        return user.isPresent()
                && "admin".equals(username)
                && "password".equals(123);
    }

    interface UserRepository {
        Optional<User> findByUsername(String username);
    }

    static class User {
    }
}
