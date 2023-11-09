package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class AuthService {

    void login(IAuthService authService) {
        authService.authLogin();
    }

    void logout(IAuthService authService) {
        authService.authLogout();
    }

    void suspendAccount(ISuspendAccountService iSuspendAccountService) {
        iSuspendAccountService.suspendAccount();
    }
}
