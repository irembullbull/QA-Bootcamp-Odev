package org.example;

import Pages.MainPage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class Main extends BaseTest {

    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();

    @Test (description = "Başaralı Kullanıcı Girişi")
    public void Test2() {

        mainPage.girisYapIkon();
        mainPage.userNameDoldur("irembulbul99@outlook.com");
        mainPage.passwordDoldur("2509Irem.");
        mainPage.girisYap();

    }

    @Test (description = "Var Olan Kullaıcı İle Kayıt İşleminde Alınan Hata")
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


    @Test (description = "Arama Alanından Ürün Bulma")
    public void Test6() {

       mainPage.searchButton("Atkı");

    }

    @Test (description = "Ürün Kategorisinden Herhangi Bir Alanın Seçimi")
    public void Test11() {

        driver.findElement(By.cssSelector("[href=\"/tr-TR/outlet-c-573\"]")).click();

    }

    @Test (description = "Sepete Ürün ekleme")
    public void test16() {

        mainPage.searchButton("şapka");
        driver.findElement(By.cssSelector("[data-href='/p/beyaz-sapka-011249060425007_105'] > .icon-bag-add")).click();
        driver.findElement(By.cssSelector(".modal-body > div:nth-of-type(1) > div:nth-of-type(2) label:nth-of-type(1)")).click();
        driver.findElement(By.cssSelector(".modal-body div:nth-of-type(1) > button:nth-of-type(1)")).click();
        driver.findElement(By.cssSelector(".btn[href='/tr-TR/cart']")).click();

    }





}