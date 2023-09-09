package com.example.todowebapp.login;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;


@Controller
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticationService authenticationService;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /*
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }*/

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value="login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid username or password");
        return "login";
    }
}
