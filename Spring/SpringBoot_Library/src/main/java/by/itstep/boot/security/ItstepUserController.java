package by.itstep.boot.security;

import by.itstep.boot.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ItstepUserController {
    @Autowired
    private UserRegistration userRegistration;

    @GetMapping("/signin")
    public String login() {
        return "signin";
    }

    @PostMapping("/login")
    public String login2() {

        return "signin";
    }
}
