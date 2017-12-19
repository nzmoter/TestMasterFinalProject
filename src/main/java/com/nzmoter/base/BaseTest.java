package com.nzmoter.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static ChromeDriver driver;
    public static ChromeOptions options;

    @Before
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver(options);
        //  driver.navigate().to("http:www.hepsiburada.com");
     //   driver.navigate().to("https://www.defacto.com.tr");
        driver.manage().window().maximize();
    }

    @After
    public void close() {
        // driver.quit();
    }

}
