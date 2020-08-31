package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/");

        // 1. yontem
        //  WebElement welcomeYazisi = driver.findElement(By.tagName("h1"));
        //System.out.println( welcomeYazisi.getText());
        // 2. yontem
        // xpath kullaniminda attribute kullanmaya gerek duymazsiniz,
        // sadece tagName yazilarak da weelement bulunabilir.
         WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
        System.out.println( welcomeYazisi.getText());






    }
}
