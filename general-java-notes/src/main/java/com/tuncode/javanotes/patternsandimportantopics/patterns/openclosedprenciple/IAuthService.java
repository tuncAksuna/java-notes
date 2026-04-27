package com.tuncode.javanotes.patternsandimportantopics.patterns.openclosedprenciple;

public interface IAuthService {

    void authLogin();

    void authLogout();
    /*
        * Bu �zelli�e her kullan�c� tipi sahip olamayabilir. Bu interface'yi implemente eden her class bu �zelli�i bo�una override etmek zorunda kalabilir !
        * Bu sorunu ortadan kald�rmak i�in Interface Seggregation uygulanabilir..
    void suspendAccount();
   */
}
