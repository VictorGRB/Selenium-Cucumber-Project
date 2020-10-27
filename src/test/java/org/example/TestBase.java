package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestBase {
    protected static String storedProductName;
    protected WebDriver driver=DriverFactory.getDriver();


    public void openHomepage(){
        driver.get(AppConfig.getSiteUrl());
    }
    protected void mouseOverAndClickLast(List<By> locators) {
        Actions actions = new Actions(driver);

        for (By locator : locators) {
            actions.moveToElement(driver.findElement(locator))
                    .perform();
        }

        actions.click().perform();
    }

}
