package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
  // Java projemizi, chromedriver'i tanittik
 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

      // selenium ile ilgili ilk kodumuz
      // WebDriver nesnesi olusturarak, chrome driveri kullanabilir hale getirdik.

        WebDriver driver = new ChromeDriver();

        // driver'imiza google.com'a gitmesini soyledik.
        driver.get("https://www.google.com/");

       // driver.close();

       // driver.quit();

    }
}
