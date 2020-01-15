package com.test.testplugin;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowTheText {
    @Test
    public void showText() {
        System.out.println("Test!!!");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // opening page
        driver.get("http://the-internet.herokuapp.com/");
        System.out.println("Page opened!!!");

        // wait for 3 sec and close driver obj.
        // don't do this in real test!!! -> Thread.sleep()
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
