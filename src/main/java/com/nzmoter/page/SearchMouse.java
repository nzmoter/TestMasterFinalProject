package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchMouse extends BasePageUtil {

    public SearchMouse(WebDriver driver){
        super(driver);
    }
    public HomePage loginAndSearchMouse(String email, String password){
        sendKeys(By.id("email"), email);
        sleep(2000);
        sendKeys(By.cssSelector("#password"), password);
        sleep(2000);
        click(By.cssSelector("#form-login button"));
        sleep(2000);
        assertEquals("Nazım Gs",getText(By.cssSelector(".user-name")));
        sleep(2000);
        click(By.cssSelector("#elektronik span"));
        sleep(2000);
        click(By.cssSelector(".nav-home > [data-bind] > [href=\"\\/bilgisayarlar-c-2147483646\"]:nth-of-type(1)"));
        assertEquals("Bilgisayarlar",getText(By.cssSelector("[itemprop=\"title\"]")));


        sleep(2000);
        click(By.cssSelector("[href=\"\\/cevre-birimleri-c-3013120\"]"));
        sleep(2000);
        assertEquals("Çevre Birimleri",getText(By.cssSelector("[href=\"\\/cevre-birimleri-c-3013120\"] [itemprop]")));

        sleep(2000);
        click(By.cssSelector(" [href=\"\\/mouse-c-52\"]"));
        assertEquals("Mouse",getText(By.cssSelector("[href=\"\\/mouse-c-52\"] [itemprop]")));
        sleep(2000);

        scroll(By.cssSelector("[class=\"page-2 \"]"));
        sleep(2000);
        click(By.cssSelector("[class=\"page-2 \"]"));
        sleep(2000);
        assertTrue(getUrl().contains("sayfa=2"));

        scroll(By.cssSelector("[class=\"page-3 \"]"));
        sleep(2000);
        click(By.cssSelector("[class=\"page-3 \"]"));
        sleep(2000);
        assertTrue(getUrl().contains("sayfa=3"));

        scroll(By.cssSelector("[class=\"page-4 \"]"));
        sleep(2000);
        click(By.cssSelector("[class=\"page-4 \"]"));
        sleep(2000);
        assertTrue(getUrl().contains("sayfa=4"));

        scroll(By.cssSelector("[class=\"page-5 \"]"));
        sleep(2000);
        click(By.cssSelector("[class=\"page-5 \"]"));
        sleep(2000);
        assertTrue(getUrl().contains("sayfa=5"));

        scroll(By.cssSelector("[class=\"page-6 \"]"));
        sleep(2000);
        click(By.cssSelector("[class=\"page-6 \"]"));
        assertTrue(getUrl().contains("sayfa=6"));

        sleep(2000);
        scroll(By.cssSelector("[class=\"page-7 \"]"));
        sleep(2000);
        click(By.cssSelector("[class=\"page-7 \"]"));
        assertTrue(getUrl().contains("sayfa=7"));


        sleep(2000);
        click(By.cssSelector("[data-index=\"1\"] .product"));

        sleep(2000);
        click(By.cssSelector("#campaignsTab .campaignText"));
        sleep(1000);
        assertEquals("100 TL ve üzeri alışverişlerde kargo bedava!",getText(By.cssSelector("#productCampaignList span")));

        sleep(2000);
        click(By.cssSelector("#productReviewsTab"));
        sleep(1000);
        assertTrue(getText(By.cssSelector(".see-all-reviews")).contains("Tüm yorumları gör"));

        sleep(2000);
        click(By.cssSelector("#productPaymentInstallment"));
        sleep(1000);
        assertTrue(getText(By.cssSelector(".loan-detail-info span")).contains("alışveriş kredisi"));

        sleep(2000);
        click(By.cssSelector("#productReturnPolicy"));
        sleep(1000);
        assertTrue(getText(By.cssSelector("#tabReturnPolicy #productReturnPolicyText > b:nth-of-type(1)")).contains("İade işlemlerinizi aşağıdaki şekilde yapmalısınız:"));

        sleep(2000);
        click(By.cssSelector("#merchantTabTrigger .item-link"));
        assertTrue(getText(By.xpath("/html//table[@id='merchant-list']//td[.='Satıcı']")).contains("Satıcı"));
        return  new HomePage(driver);
    }
}
