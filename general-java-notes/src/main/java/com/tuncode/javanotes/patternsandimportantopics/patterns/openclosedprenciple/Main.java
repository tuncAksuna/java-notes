package com.tuncode.javanotes.patternsandimportantopics.patterns.openclosedprenciple;

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
        // authService.suspendAccount(doctorAuth); DoctoAuth class� ISuspendAccountService interfacesini implemente etmedi�ini i�in bu i�lemi yapamaz !
    }
}
