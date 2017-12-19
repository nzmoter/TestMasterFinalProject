package com.nzmoter.test;

import com.nzmoter.base.BaseTest;
import com.nzmoter.page.HomePage;
import org.junit.Test;

public class AppTest extends BaseTest {
    @Test
    public void successRegister() {
        driver.navigate().to("http:www.hepsiburada.com");
        new HomePage(driver).callRegisterPage().register("Nazım", "Gs", "nzmgsry@gmail.com", "gs123456");
    }
    @Test
    public void successLogin() {
        driver.navigate().to("http:www.hepsiburada.com");
        new HomePage(driver).callLoginPage().login("nzmgsry@gmail.com", "gs123456");
    }
    @Test
    public void searchMouse() {
        driver.navigate().to("http:www.hepsiburada.com");
        new HomePage(driver).callSearchPage().loginAndSearchMouse("nzmgsry@gmail.com", "gs123456");
    }

    @Test
    public void addToBasket() {
        driver.navigate().to("http:www.hepsiburada.com");
        new HomePage(driver).callAddToBasketPage().loginSearchAndAddtoBasket("nzmgsry@gmail.com", "gs123456");
    }

    @Test
    public void orderCompletion() {
        driver.navigate().to("http:www.hepsiburada.com");
        new HomePage(driver).callOrderCompletion().loginSearchAndOrderComplition("nzmgsry@gmail.com", "gs123456");
    }

    @Test
    public void searchShoe() {
        driver.navigate().to("http:www.hepsiburada.com");
        new HomePage(driver).callSearchShoe().searchManShoe("nzmgsry@gmail.com", "gs123456");
    }

    @Test
    public void registerToDefacto() {
        driver.navigate().to("https://www.defacto.com.tr");
        new HomePage(driver).callDefactoRegisterPage().register("Nazım", "Gs", "nzmgsry@gmail.com", "5010000000", "gs123456");
    }

    @Test
    public void loginToDefacto() {
        driver.navigate().to("https://www.defacto.com.tr");
        new HomePage(driver).callDefactoLoginPage().login("nzmgsry@gmail.com", "gs123456");
    }

    @Test
    public void searchShirtDefacto() {
        driver.navigate().to("https://www.defacto.com.tr");
        new HomePage(driver).callDefactoSearchPage().loginAndSearchShirt("nzmgsry@gmail.com", "gs123456");
    }
}
