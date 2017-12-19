package com.nzmoter.util;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class BasePageUtil {
    WebElement element;
    protected WebDriver driver;

    public BasePageUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By by) {

        return driver.findElement(by);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void submit(By by) {
        driver.findElement(by).submit();
    }

    public void sendKeys(By by, String keys) {
        driver.findElement(by).sendKeys(keys);
    }

    public String getText(By by) {
        return driver.findElement(by).getText();
    }

    public void scroll(By by) {
        element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void select(By by, int index) {
        Select oSelect = new Select(driver.findElement(by));
        oSelect.selectByIndex(index);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getValue(By by) {
        element = driver.findElement(by);
        return element.getAttribute("value");
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void quit() {
        driver.quit();
    }
}
