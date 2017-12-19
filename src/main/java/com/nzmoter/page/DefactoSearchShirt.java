package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DefactoSearchShirt extends BasePageUtil {

    public DefactoSearchShirt(WebDriver driver) {
        super(driver);
    }

    public HomePage loginAndSearchShirt(String email, String password) {
        sendKeys(By.id("LoginModel_Email"), email);
        sleep(5000);
        sendKeys(By.id("LoginModel_Password"), password);
        sleep(5000);
        click(By.id("LoginBtn"));
        sleep(5000);
        click(By.cssSelector("#navbar-collapse-grid [href=\"\\/erkek\"] span"));
        sleep(5000);
        assertEquals("Erkek", getText(By.cssSelector("[itemprop=\"Erkek\"]")));
        click(By.cssSelector("._mCS_9 li:nth-of-type(1) span"));
        sleep(5000);
        assertEquals("Giyim", getText(By.cssSelector("[itemprop=\"Giyim\"]")));
        sleep(1000);

        click(By.xpath("//div[@id='facetAccordion']/div[3]/div[2]/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Gömlek']"));
        sleep(5000);
        assertEquals("Gömlek", getText(By.cssSelector("[itemprop=\"Gömlek\"]")));


        click(By.xpath("//div[@id='fx_s']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='XXL']"));
        sleep(5000);
        assertEquals("XXL", getText(By.cssSelector("#tab_default_1 [class=\"pull-left text-black-half-15 p-2 p-r-15 m-r-15 m-b-8\"]:nth-of-type(4) gt")));


        click(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Gri']"));
        sleep(5000);
        assertEquals("Gri", getText(By.cssSelector("[itemprop=\"Gri\"]")));

        click(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Mavi']"));
        sleep(5000);
        assertEquals("Mavi", getText(By.cssSelector("#tab_default_1 [class=\"pull-left text-black-half-15 p-2 p-r-15 m-r-15 m-b-8\"]:nth-of-type(5) gt")));

        String urunadi = getText(By.cssSelector(".swiper-wrapper > div:nth-of-type(1) .perz-item-name-product"));
        click(By.cssSelector(".swiper-wrapper > div:nth-of-type(1) .perz-item-name-product"));
        sleep(5000);

        assertEquals(urunadi, getText(By.cssSelector("h1")));
        sleep(5000);

        click(By.xpath("/html//section[@id='fixed']/div[5]/div/div//ul[@class='productSizes productWidthHeight top15']/li[4]/a[@href='javascript:;']/span[.='XL']"));

        sleep(5000);
        click(By.xpath("/html//button[@id='addToCart']"));

        sleep(5000);
        assertEquals("Sepete Git", getText(By.cssSelector("#popupBasket_ComplateShopping")));
        sleep(5000);
        assertEquals("Beden: XL", getText(By.cssSelector("[class] h6:nth-child(4)")));
        sleep(1000);
        click(By.xpath("/html//a[@id='popupBasket_ComplateShopping']"));
        sleep(5000);
        //her tıklamada Sepet,Adres ve Ödeme seçeneğine mevcut css ataması yapılıp diğerinden kaldırıldığı için css selector ile kontrol yapıldı.
        assertEquals("Sepet", getText(By.cssSelector(".current")));

        click(By.id("ComplateShoppingDown"));
        sleep(5000);
        assertEquals("Adres", getText(By.cssSelector(".current")));

        click(By.cssSelector("#ShippingAddressForm > .form-group:nth-child(1) [class=\"col-lg-10\"] .form-control"));
        sleep(5000);

        select(By.id("Address_AddressTypeId"), 1);
        sleep(5000);
        select(By.id("Address_AddressCityId"), 1);
        sleep(5000);
        select(By.id("Address_AddressCountyId"), 1);
        sleep(5000);
        sendKeys(By.id("Address_AddressPostalCode"), "34520");
        sleep(5000);
        sendKeys(By.id("Address_AddressText"), "Beylikdüzü");
        sleep(5000);
        sendKeys(By.id("Address_AddressFirstName"), "Nazım");
        sleep(5000);
        sendKeys(By.id("Address_AddressLastName"), "Oter");
        sleep(5000);
        sendKeys(By.id("Address_AddressMobilePhone"), "5535343536");
        sleep(5000);
        sendKeys(By.id("Address_AddressIdentityNumber"), "63436381846");
        sleep(5000);
        click(By.cssSelector(".form-group [type=\"submit\"]"));
        sleep(5000);

        click(By.cssSelector("[class=\"button-loading-submit-content col-xs-12\"] [type]"));
        sleep(5000);
        assertEquals("Ödeme", getText(By.cssSelector(".current")));

        sendKeys(By.id("Payment_CardNumber1"), "374770355528528");
        sleep(5000);
        select(By.id("Payment_ExpireMonth"), 1);
        sleep(5000);
        select(By.id("Payment_ExpireYear"), 1);
        sleep(5000);
        sendKeys(By.id("Payment_SecurityCode"), "998");
        sleep(5000);
        click(By.id("IsCreditCardContractEnable"));
        sleep(5000);
        click(By.id("IsMasterPassEnable"));
        return new HomePage(driver);
    }
}
