package koalanoir.twauth.repository;

// UserRepository.java
import koalanoir.twauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
