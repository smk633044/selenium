package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {


      // 1 - ilk once google.com'a gidiniz.
      // 2 - oradan youtube.com'a gidiniz.
      // 3 - google.com'a back methodu ile geri geliniz.
      // 4 - youtube.com'a geri gidiniz.(forward methodu ile)
      // 5 - youtube.com'u yenileyiniz(refresh methodu ile)
      // 6 - driver'i kapatin(quit ile)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        driver.navigate().to("http://www.youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();







    }
}
