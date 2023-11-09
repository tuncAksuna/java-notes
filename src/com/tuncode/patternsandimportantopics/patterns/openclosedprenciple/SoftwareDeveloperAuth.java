package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class SoftwareDeveloperAuth implements IAuthService {

    @Override
    public void authLogin() {
        System.out.println("Software Developer login..");
    }

    @Override
    public void authLogout() {
        System.out.println("Software Developer logout..");

    }
}
