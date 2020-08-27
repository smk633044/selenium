package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // google.com a gittik
        driver.get("http://www.google.com");
        driver.navigate().to("http:/www.amazon.com");

        // .getTitle() bulundugunuz sayfanin Title sini alir
        String sayfaTitle = driver.getTitle();//
        // .getCurrentUrl bulundugunuz sayfanin url'sini alir
        String sayfaUrl =  driver.getCurrentUrl();//

        System.out.println(sayfaTitle);//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        System.out.println(sayfaUrl);//https://www.amazon.com/



        driver.quit();
    }
}
