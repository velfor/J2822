package by.itstep.boot.security;

import by.itstep.boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItstepUserRepository extends JpaRepository<User, Long> {
    User findUserByLogin(String login);
}
