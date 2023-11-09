package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class EngineerAuth implements IAuthService, ISuspendAccountService {

    @Override
    public void authLogin() {
        System.out.println("Engineer login..");
    }

    @Override
    public void authLogout() {
        System.out.println("Engineer logout..");
    }

    @Override
    public void suspendAccount() {
        System.out.println("Suspend  engineer account !");
    }
}
