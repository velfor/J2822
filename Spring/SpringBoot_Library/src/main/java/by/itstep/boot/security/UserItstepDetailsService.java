package by.itstep.boot.security;

import by.itstep.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserItstepDetailsService implements UserDetailsService {
    @Autowired
    private ItstepUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUserByLogin(s);

        if (user == null) {
            throw new UsernameNotFoundException("Пользователь не найден");
        }

        return null;
    }
}
