package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DefactoLogin extends BasePageUtil {

    public DefactoLogin(WebDriver driver){
        super(driver);
    }

    public  HomePage login(String email, String password){
        sendKeys(By.id("LoginModel_Email"), email);
        sleep(3000);
        sendKeys(By.id("LoginModel_Password"), password);
        sleep(3000);
        click(By.id("LoginBtn"));
        sleep(5000);
        click(By.xpath("/html//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']/div[2]/button[@type='button']"));
        sleep(5000);
        assertEquals("Oturumu Kapat",getText(By.linkText("Oturumu Kapat")));
        return  new HomePage(driver);
    }
}
