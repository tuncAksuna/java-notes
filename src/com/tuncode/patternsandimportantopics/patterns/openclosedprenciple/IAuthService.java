package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple;

public interface IAuthService {

    void authLogin();

    void authLogout();

    /*
        * Bu özelliðe her kullanýcý tipi sahip olamayabilir. Bu interface'yi implemente eden her class bu özelliði boþuna override etmek zorunda kalabilir !
        * Bu sorunu ortadan kaldýrmak için Interface Seggregation uygulanabilir..
    void suspendAccount();
    */
}
