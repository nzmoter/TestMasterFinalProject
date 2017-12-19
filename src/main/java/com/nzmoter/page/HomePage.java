package com.nzmoter.page;

import com.nzmoter.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageUtil {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage callRegisterPage() {
        sleep(3000);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(3000);
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(3000);
        click(By.id("register"));
        return new RegisterPage(driver);
    }

    public LoginPage callLoginPage() {
        sleep(3000);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(3000);
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(3000);
        click(By.id("login"));
        return new LoginPage(driver);
    }

    public SearchMouse callSearchPage() {
        sleep(3000);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(3000);
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(3000);
        click(By.id("login"));
        return new SearchMouse(driver);
    }

    public AddToBasket callAddToBasketPage() {
        sleep(3000);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(3000);
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(3000);
        click(By.id("login"));
        return new AddToBasket(driver);
    }

    public OrderCompletion callOrderCompletion() {
        sleep(3000);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(3000);
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(3000);
        click(By.id("login"));
        return new OrderCompletion(driver);
    }

    public SearchShoe callSearchShoe() {
        sleep(3000);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(3000);
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(3000);
        click(By.id("login"));
        return new SearchShoe(driver);
    }

    public DefactoRegister callDefactoRegisterPage() {
        // sleep(10000);
        // Pop up kapatmak için yazılan kod
        // click(By.className("sp-fancybox-skin"));
        sleep(5000);
        click(By.cssSelector(".btn-warning"));
        sleep(3000);
        return new DefactoRegister(driver);
    }

    public DefactoLogin callDefactoLoginPage() {
        // sleep(10000);
        //   click(By.className("sp-fancybox-skin"));
        sleep(5000);
        click(By.cssSelector(".btn-login-icon.hidden-sm"));
        sleep(3000);
        return new DefactoLogin(driver);
    }

    public DefactoSearchShirt callDefactoSearchPage() {
        // sleep(10000);
        //  click(By.className("sp-fancybox-skin"));
        sleep(5000);
        click(By.cssSelector(".btn-login-icon.hidden-sm"));
        sleep(3000);
        return new DefactoSearchShirt(driver);
    }
}
