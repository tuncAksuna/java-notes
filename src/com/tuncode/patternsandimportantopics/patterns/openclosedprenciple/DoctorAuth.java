package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class DoctorAuth implements IAuthService {

    @Override
    public void authLogin() {
        System.out.println("Login doctor..");
    }

    @Override
    public void authLogout() {
        System.out.println("Logout doctor..");
    }

/*
     // DoctorAuth nesnesi ISuspendAccountService interfacesini implemente ettiği için bu metodu override edemez !
    @Override
    public void suspendAccount() {
        System.out.println("...");
    }
 */

}
