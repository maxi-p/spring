package dev.maxpetrushin.web.bean_scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private final LoggedUserManagementService loggedUserManagementService;

    @Autowired
    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login(String username, String password) {
        boolean loginRequest;
        if ("max".equals(username) && "asd".equals(password)) {
            loginRequest = true;
            loggedUserManagementService.username = username;
        } else {
            loginRequest = false;
        }
        return loginRequest;
    }
}