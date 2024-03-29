package RedditClone.Repositories;

import RedditClone.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findUserByName(String username);
    Optional<User>findUserById(Long userId);
}
