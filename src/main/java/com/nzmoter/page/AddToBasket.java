package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddToBasket extends BasePageUtil {

    public AddToBasket(WebDriver driver) {
        super(driver);
    }

    public HomePage loginSearchAndAddtoBasket(String email, String password) {
        sendKeys(By.id("email"), email);
        sleep(2000);
        sendKeys(By.cssSelector("#password"), password);
        sleep(2000);
        click(By.cssSelector("#form-login button"));
        sleep(2000);
        assertEquals("Nazım Gs", getText(By.cssSelector(".user-name")));
        sleep(2000);
        sendKeys(By.id("productSearch"), "HBV000004QBNY");
        sleep(2000);
        click(By.id("buttonProductSearch"));
        sleep(2000);
        assertTrue(getUrl().contains("HBV000004QBNY"));
        sleep(2000);
        click(By.cssSelector(".product"));
        sleep(5000);
        click(By.id("addToCart"));
        sleep(3000);
        assertEquals("Sepetim",getText(By.cssSelector(".cart-title")));
        sleep(1000);
        //Kargo ücreti kontrolü yaptım
        click(By.cssSelector(".quantity-wrapper .input-group [type=\"button\"]:nth-child(3)"));
        sleep(3000);
        click(By.cssSelector(".quantity-wrapper .input-group [type=\"button\"]:nth-child(3)"));
        sleep(3000);
        assertEquals("0,00", getText(By.cssSelector("[data-bind=\"text\\: shippingPrice\"]")));
        return new HomePage(driver);


    }
}
