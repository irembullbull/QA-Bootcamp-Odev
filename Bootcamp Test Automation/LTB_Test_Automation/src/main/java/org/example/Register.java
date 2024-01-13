package org.example;

import Pages.MainPage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class Register extends BaseTest {
    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();



    @Test(description = "Var Olan Kullaıcı İle Kayıt İşleminde Alınan Hata")
    public void Test3() {

        mainPage.girisYapIkon();
        mainPage.registerButton();
        registerPage.genderChoosing();
        registerPage.day("25");
        registerPage.month("9");
        registerPage.year("1999");
        registerPage.name("İrem");
        registerPage.phone("05055555555");
        registerPage.email("irembulbul99@outlook.com");
        registerPage.password("2509Irem.");
        registerPage.checkPassword("2509Irem.");
        registerPage.registerButton2();
        registerPage.errorMessageContoller("Bu e-posta adresiyle zaten bir hesap oluşturulmuş.");

    }
}
