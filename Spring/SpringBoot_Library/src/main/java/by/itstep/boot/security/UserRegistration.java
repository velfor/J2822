package by.itstep.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.net.Authenticator;

@Service
public class UserRegistration {

    @Autowired
    private ItstepUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    public void addNewUser() {

    }

    public ContactConfirmResponse login(ContactConfirmPayload payload) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(payload.getContact())
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        ContactConfirmResponse response = new ContactConfirmResponse();
        response.setResult(true);
        return response;
    }

    public Object getCurrentUser() {
        ItstepUserDetails userDetails = (ItstepUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getUser();
    }
}
