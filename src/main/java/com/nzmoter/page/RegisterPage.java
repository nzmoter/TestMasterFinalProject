package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class RegisterPage extends BasePageUtil {

    public RegisterPage(WebDriver driver){
        super(driver);
    }

   public HomePage register(String name, String surname, String email, String password){
       sendKeys(By.id("firstname"), name);
       sleep(3000);
       sendKeys(By.id("lastname"), surname);
       sleep(3000);
       sendKeys(By.id("email-register"), email);
       sleep(3000);
       sendKeys(By.id("password-register"), password);
       sleep(3000);
       sendKeys(By.id("password-repeat"), password);
       sleep(3000);
       click(By.cssSelector(".form-actions [type]"));
       sleep(3000);
       assertEquals("Üyeliğiniz başarıyla oluşturuldu.", getText(By.className("success-message")));
       return  new HomePage(driver);
   }
}
