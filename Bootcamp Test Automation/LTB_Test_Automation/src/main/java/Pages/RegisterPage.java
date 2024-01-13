package Pages;

import io.qameta.allure.Step;
import org.example.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {
    @Step("Cinsiyet seçimi yapılır")
    public void genderChoosing() {driver.findElement(By.cssSelector("[data-js=\"gender\"]")).click();}

    @Step("Gün seçimi yapılır")
    public void day(String text){
        driver.findElement(By.id("day")).sendKeys(text);
    }

    @Step("Ay seçimi yapılır")
    public void month(String text){
        driver.findElement(By.id("month")).sendKeys(text);
    }

    @Step("Yıl seçimi yapılır")
    public void year(String text){
        driver.findElement(By.id("year")).sendKeys(text);
    }

    @Step("İsim yazılır")
    public void name(String text){
        driver.findElement(By.id("name")).sendKeys(text);
    }

    @Step("Numara yazılır")
    public void phone(String text){
        driver.findElement(By.id("phone")).sendKeys(text);
    }

    @Step("E-mail yazılır")
    public void email(String text){
        driver.findElement(By.id("email")).sendKeys(text);
    }

    @Step("Şifre yazılır")
    public void password(String text){
        driver.findElement(By.id("register-password")).sendKeys(text);
    }

    @Step("Şifre tekrar yazılır")
    public void checkPassword(String text){
        driver.findElement(By.id("checkPwd")).sendKeys(text);
    }



    @Step("Hata mesajı kontrolü")
    public void errorMessageContoller(String text){
        String value = driver.findElement(By.cssSelector("[.register-email > .error]")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Kayıt ol butonuna tıklanır")
    public void registerButton2() {driver.findElement(By.cssSelector(".login")).click();
    }

}
