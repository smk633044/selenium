package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_EvOdevi {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");

        driver.getTitle();
        String facebookTitle = driver.getTitle();

        if(facebookTitle.contains("facebook")){
            System.out.println("dogru :" + facebookTitle);
        }else{
            System.out.println("yanlis cevap, dogrusu ise :" + facebookTitle);
        }

        String sayfaUrlsi = driver.getCurrentUrl();

         System.out.println(sayfaUrlsi);

         driver.navigate().to("http://www.walmart.com/");

         String sayfabasligi = driver.getTitle();

         if(sayfabasligi.contains("Walmart.com")){
             System.out.println("Dogru :" + sayfabasligi);
         }else{
             System.out.println("Yanlis :" + sayfabasligi);
         }

         driver.navigate().back();
         driver.navigate().refresh();
         driver.manage().window().maximize();
         driver.close();

    }
}
