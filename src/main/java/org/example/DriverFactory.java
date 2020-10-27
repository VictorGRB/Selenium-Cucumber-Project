package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;
    public static WebDriver initDriver(String browser){

        WebDriver driver;

        switch(browser){
            default:
                System.out.println("Using default browser: Chrome");
            case"chrome":
                System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
                driver=new ChromeDriver();
                break;

            case"firefox":
                System.setProperty("webdriver.gecko.driver", AppConfig.getGeckoDriverPath());
                driver=new FirefoxDriver();
                break;

        }
        driver.manage().window().maximize();



        DriverFactory.driver=driver;
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
