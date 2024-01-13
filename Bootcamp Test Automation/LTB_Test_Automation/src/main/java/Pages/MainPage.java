package Pages;

import io.qameta.allure.Step;
import org.example.BaseTest;
import org.example.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class MainPage extends BaseTest {
    @Step("Kullanıcı adı doldurulur")
    public void userNameDoldur(String text) {
        driver.findElement(By.cssSelector("[name=\"j_username\"]")).sendKeys(text);
    }

    @Step("Şifre alanı doldurulur")
    public void passwordDoldur(String text) {
        driver.findElement(By.cssSelector("[name=\"j_password\"]")).sendKeys(text);
    }

    @Step("Giriş yapa tıklanır")
    public void girisYap() {
        driver.findElement(By.cssSelector("[class=\"btn-login h50 btn btn-primary w-100\"]"));
    }

    @Step("Giriş yap ikonuna tıklanır")
    public void girisYapIkon() {
        driver.findElement(By.cssSelector("[class=\"header-icon account-area\"]")).click();
    }


    @Step("Kayıt ol tuşuna basıılır")
    public void registerButton() {
        driver.findElement(By.cssSelector("class=\"is__payment--register-button btn btn-second\"")).click();
    }

    @Step("Arama butonu kullanılır")
    public void searchButton(String text) {
        driver.findElement(By.cssSelector("[data-js=\"search-input\"]")).sendKeys(text, Keys.ENTER);
    }
}


