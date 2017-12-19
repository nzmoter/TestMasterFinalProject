package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderCompletion extends BasePageUtil {

    public OrderCompletion(WebDriver driver) {
        super(driver);
    }

    public HomePage loginSearchAndOrderComplition(String email, String password) {
        sendKeys(By.id("email"), email);
        sleep(2000);
        sendKeys(By.cssSelector("#password"), password);
        sleep(2000);
        click(By.cssSelector("#form-login button"));
        sleep(2000);
        assertEquals("Nazım Gs", getText(By.cssSelector(".user-name")));
        sleep(2000);
        sendKeys(By.id("productSearch"), "HBV000007PV9M");
        sleep(2000);
        click(By.id("buttonProductSearch"));
        sleep(2000);
        assertTrue(getUrl().contains("HBV000007PV9M"));
        sleep(2000);
        String title = getText(By.cssSelector(".product-title span"));
        click(By.cssSelector(".product"));
        // click(By.className("hb-pl-cn"));
        sleep(5000);
        assertEquals(title, getText(By.cssSelector("h1")));
        sleep(1000);
        click(By.cssSelector(".icon-plus"));
        sleep(2000);
        click(By.cssSelector(".icon-plus"));
        sleep(2000);

        click(By.id("addToCart"));
        //kontrol yapılacak unutma
        sleep(5000);
        //Kargo ücreti kontrolü yaptım
        assertEquals("0,00", getText(By.xpath("/html//div[@id='item-prices']//strong[.='0,00']")));
        sleep(1000);
        click(By.cssSelector(".btn-primary .text"));
        sleep(5000);
        //Test 1 kez koşulduğunda hesapta adres otomatik kayıt olmaktadır,kontrol işlemi ile hata alınması engellenmiştir.
        if (getText(By.className("box-header-title")).equals("Bu Adresi Kullan")) {
            sendKeys(By.id("first-name"), "Nazım");
            sleep(3000);

            sendKeys(By.id("last-name"), "Oter");
            sleep(3000);

            click(By.cssSelector(".address-form .control-group:nth-child(4) .filter-option"));
            sleep(3000);

            click(By.cssSelector(".address-form .control-group:nth-child(4) [rel=\"1\"] .text"));
            sleep(3000);

            click(By.cssSelector(".address-form .control-group:nth-child(5) .filter-option"));
            sleep(3000);

            click(By.cssSelector(".address-form .control-group:nth-child(5) [rel=\"1\"] .text"));
            sleep(3000);

            sendKeys(By.id("address"), "Beylikdüzü");
            sleep(3000);

            sendKeys(By.id("address-name"), "Evim");
            sleep(3000);

            sendKeys(By.id("zip-code"), "34520");
            sleep(3000);

            sendKeys(By.id("phone"), "05535343536");
            sleep(3000);
        }
        click(By.cssSelector(".btn-primary .text"));
        sleep(5000);
        assertEquals("Kredi / Banka Kartı", getText(By.linkText("Kredi / Banka Kartı")));

        sendKeys(By.cssSelector(".control-group:nth-of-type(1) [type]"), "374770355528528");

        sleep(3000);
        sendKeys(By.id("holder-Name"), "Nazım Gs");
        sleep(3000);

        click(By.cssSelector(".controls:nth-of-type(1) .filter-option"));
        sleep(3000);

        click(By.cssSelector(".controls:nth-of-type(1) [rel=\"1\"] .text"));
        sleep(3000);

        click(By.cssSelector(".controls:nth-of-type(2) .filter-option"));
        sleep(3000);

        click(By.cssSelector(".controls:nth-of-type(2) [rel=\"1\"] .text"));
        sleep(3000);

        sendKeys(By.cssSelector(".controls.group [type]"), "998");
        sleep(3000);
        click(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        sleep(10000);
        assertEquals("Siparişi Onayla", getText(By.cssSelector(".text")));
        return new HomePage(driver);


    }
}
