package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {

        // Bugun dort tane method gorecegiz
        //1. ileri
        //2.geri
        //3. sayfayi kaplama
        //4. sayfayi yenileme komutu

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //manage().window().maximize() driver'in tum ekrani kaplamasini sagliyor.
        driver.manage().window().maximize();
         // driver'a google.com'a gitmesini soyledik.
        driver.get("http://google.com");

        //navigate().to() methodu, 'get()' komutu ile ayni islemi goruyor
        driver.navigate().to("http://amazon.com");

        // navigate().back() methodu ile bir onceki sayfaya donebiliyoruz.
        driver.navigate().back();

        //navigate().forward() methodu geri geldigimiz sayfaya gitmemizi sagliyor.
        //örnek: google.com'dan --> amazon.com'a gittik-->amazon.com'dan goggle.com'a geri geldik
        // eger forward yaparsak, tekrar amazona dogru ileri gideriz.
        driver.navigate().forward();

        //navigate().refresh() methodu sayfayi yenilemeye yariyor.
        driver.navigate().refresh();







    }
}
