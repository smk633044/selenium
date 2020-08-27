package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {


        // 1 - ilk once google.com'a gidelim.
        // 2 - sayfani title'ini alalim ve ekrana yazdiralim.
        // 3 - daha sonra youtube.com'a gidelim.
        // 4 - sayfanin title'ini ve url'ini alalim ekrana yazdiralim.
        // 5 - google.com'a geri gelelim ve sayfanin url'ini alip ekrana yazdiralim.
        // 6 - driver'imizi kapatalim.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("http:/www.google.com");
        String sayfaTitle =  driver.getTitle();
        String sayfaUrl = driver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

        driver.navigate().to("http:/www.youtube.com");
        String youTitle = driver.getTitle();
        String youUrl = driver.getCurrentUrl();

        System.out.println(youTitle);
        System.out.println(youUrl);

        driver.navigate().back();
        String sayfaninUrl = driver.getCurrentUrl();
        System.out.println(sayfaninUrl);


        driver.quit();








    }
}
