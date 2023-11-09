package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class Main {

    public static void main(String[] args) {

        AuthService authService = new AuthService();

        SoftwareDeveloperAuth softwareDeveloperAuth = new SoftwareDeveloperAuth();
        authService.login(softwareDeveloperAuth);

        EngineerAuth engineerAuth = new EngineerAuth();
        authService.logout(engineerAuth);

        DoctorAuth doctorAuth = new DoctorAuth();
        authService.login(doctorAuth);


        authService.suspendAccount(softwareDeveloperAuth);
        authService.suspendAccount(engineerAuth);
        // authService.suspendAccount(doctorAuth); DoctoAuth classý ISuspendAccountService interfacesini implemente etmediðini için bu iþlemi yapamaz !
    }
}
