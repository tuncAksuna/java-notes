package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class SoftwareDeveloperAuth implements IAuthService,ISuspendAccountService {

    @Override
    public void authLogin() {
        System.out.println("Software Developer login..");
    }

    @Override
    public void authLogout() {
        System.out.println("Software Developer logout..");

    }

    @Override
    public void suspendAccount() {
        System.out.println("Suspend software developer account !");
    }
}
