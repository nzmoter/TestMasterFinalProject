package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchShoe extends BasePageUtil {

    public SearchShoe(WebDriver driver) {
        super(driver);
    }

    public HomePage searchManShoe(String email, String password) {
        sendKeys(By.id("email"), email);
        sleep(5000);
        sendKeys(By.cssSelector("#password"), password);
        sleep(5000);
        click(By.cssSelector("#form-login button"));
        sleep(5000);
        assertEquals("Nazım Gs", getText(By.cssSelector(".user-name")));
        sleep(5000);
        sendKeys(By.id("productSearch"), "ayakkabı");
        sleep(5000);
        click(By.id("buttonProductSearch"));
        sleep(5000);
        assertTrue(getUrl().contains("ayakkabi"));

        sleep(1000);
        click(By.cssSelector("[href=\"\\/erkek-giyim-modelleri-c-12087177\"] span"));
        assertEquals("Erkek", getText(By.cssSelector("[href=\"\\/erkek-giyim-modelleri-c-12087177\"] [itemprop]")));

        sleep(5000);
        click(By.cssSelector("[href=\"\\/ayakkabi-c-60000117\"]"));
        assertEquals("Erkek Ayakkabılar", getText(By.cssSelector("   [href=\"\\/ayakkabi-c-60000117\"] [itemprop]")));

        sleep(5000);
        click(By.cssSelector("[href=\"\\/erkek-gunluk-ayakkabilar-c-60000126\"]"));
        assertEquals("Erkek Günlük Ayakkabılar", getText(By.cssSelector("[href=\"\\/erkek-gunluk-ayakkabilar-c-60000126\"] [itemprop]")));

        sleep(5000);
        click(By.cssSelector("[for=\"attr-fiyat-500-750\"]"));
        assertTrue(getUrl().contains("fiyat:500-750"));

        sleep(5000);
        click(By.cssSelector("[for=\"brand-gianvitorossi\"]"));
        assertTrue(getUrl().contains("gianvitorossi"));

        sleep(5000);
        click(By.cssSelector("[for=\"attr-numara-44\"]"));
        assertTrue(getUrl().contains("numara:44"));

        sleep(5000);
        click(By.cssSelector("[for=\"attr-satici-Hepsiburada\"]"));
        assertTrue(getUrl().contains("satici:Hepsiburada"));

        sleep(5000);
        click(By.cssSelector("[for=\"attr-renk-Kahverengi\"]"));
        assertTrue(getUrl().contains("renk:Kahverengi"));

        String urunadi = getText(By.cssSelector(".product-title span"));
        sleep(5000);
        click(By.cssSelector("[data-bind=\"css\\: \\{\\'hb-placeholder\\'\\: false\\}\"]"));
        sleep(5000);
        assertEquals(urunadi, getText(By.id("product-name")));

        scroll(By.linkText("Favori Listeme Ekle"));
        sleep(1000);
        click(By.linkText("Favori Listeme Ekle"));
        sleep(5000);
        assertEquals("Ürün favorilerinize eklendi!", getText(By.cssSelector("#notification .title")));
        sleep(1000);
        click(By.cssSelector("#notification .close"));
        sleep(5000);

        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(5000);
        assertEquals("Sepetim", getText(By.className("cart-title")));
        return new HomePage(driver);
    }
}
