package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class EngineerAuth implements IAuthService {

    @Override
    public void authLogin() {
        System.out.println("Engineer login..");
    }

    @Override
    public void authLogout() {
        System.out.println("Engineer logout..");
    }
}
