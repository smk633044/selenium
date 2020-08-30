package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // a tagname sahip tum webelementleri bulalim
        //if-else, for-each, methodlar, nesne olusturma, arrays bunlar
        // Selenium' da en cok ve bilmemiz gereken konular. tekrar lazim

        List<WebElement> listem = driver.findElements(By.tagName("a"));

        for(WebElement w : listem){ // for(int i = 0 ; i < listem.size(); i++
                                   // seklinde de yazilabilir. )
            System.out.println(w.getText());



        }






    }
}
