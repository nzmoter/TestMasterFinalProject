package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePageUtil {

    public LoginPage(WebDriver driver){
        super(driver);
    }

   public  HomePage login(String email, String password){
       sendKeys(By.id("email"), email);
       sleep(3000);
       sendKeys(By.cssSelector("#password"), password);
       sleep(3000);
       click(By.cssSelector("#form-login button"));
       sleep(3000);
       assertEquals("Nazım Gs",getText(By.cssSelector(".user-name")));
     //  assertEquals("Hesabım", getText(By.id("myAccount")));
      /* click(By.cssSelector("#myAccount .cart-copy:nth-of-type(1)"));
       sleep(1000);
       click(By.cssSelector(".usersProcess li:nth-of-type(2) [rel]"));
       sleep(1000);
       assertEquals("Merhaba, Nazım Gs", getText(By.cssSelector(".inboxInfoContainer .hb-font-h5")));*/
        return  new HomePage(driver);
   }
}
