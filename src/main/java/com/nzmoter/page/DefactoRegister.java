package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DefactoRegister extends BasePageUtil {

    public DefactoRegister(WebDriver driver) {
        super(driver);
    }

    public HomePage register(String name, String surname, String email, String phone, String password) {
        sendKeys(By.id("RegisterModel_CustomerFirstName"), name);
        sleep(3000);
        sendKeys(By.id("RegisterModel_CustomerLastName"), surname);
        sleep(3000);
        sendKeys(By.id("RegisterModel_CustomerEmail"), email);
        sleep(3000);
        sendKeys(By.id("RegisterModel_CustomerMobilePhone"), phone);
        sleep(3000);
        select(By.id("RegisterModel_CustomerBirthDateDay"),2);
        sleep(3000);
        select(By.id("RegisterModel_CustomerBirthDateMonth"),7);
        sleep(3000);
        select(By.id("RegisterModel_CustomerBirthDateYear"),10);
        sleep(3000);
        select(By.cssSelector("[name=\"RegisterModel\\.Gender\"]"),1);
        sleep(3000);
        sendKeys(By.id("RegisterModel_CustomerPassword"), password);
        sleep(3000);
        sendKeys(By.id("RegisterModel_CustomerPasswordConfirm"), password);
        sleep(3000);
        click(By.id("RegisterModel_CustomerIsApprovedContract"));
        sleep(3000);
        click(By.id("RegisterBtn"));
        sleep(10000);
        click(By.xpath("/html//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']/div[2]/button[@type='button']"));
        sleep(5000);
        click(By.linkText("Hesabım"));
        sleep(5000);
        assertEquals("Nazım",getValue(By.id("Customer_CustomerFirstName")));
        sleep(1000);
        assertEquals("Gs",getValue(By.id("Customer_CustomerLastName")));
        sleep(1000);
        assertEquals("nzmgsry@gmail.com",getValue(By.id("Customer_CustomerEmail")));
        sleep(1000);
        assertEquals("5010000000",getValue(By.id("Customer_CustomerMobilePhone")));
        return  new HomePage(driver);
    }
}
