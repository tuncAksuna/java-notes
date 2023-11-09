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
    // DoctorAuth nesnesi bu �zelli�e sahip olmamas�na ra�men gereksiz yere bu metodu override etmi�tir !
    @Override
    public void suspendAccount() {
        System.out.println("...");
    }
 */

}
