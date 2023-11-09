package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public class Main {

    public static void main(String[] args) {

        AuthService authService = new AuthService();

        SoftwareDeveloperAuth softwareDeveloperAuth = new SoftwareDeveloperAuth();
        authService.login(softwareDeveloperAuth);

        EngineerAuth engineerAuth = new EngineerAuth();
        authService.logout(engineerAuth);
    }
}
