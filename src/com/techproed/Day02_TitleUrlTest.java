package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

   // 1 - youtube.com'a gidelim.
   // 2 -  title(sayfa basligi) video kelimesini iceriyor mu bakalim.
    // 3 - driveri kapatalim.



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      driver.get("http://www.youtube.com");
       String youtubebasligi = driver.getTitle();

        System.out.println(youtubebasligi);

       if(youtubebasligi.contains("video")){
           System.out.println("Video var :" + youtubebasligi );
       }else {
           System.out.println("video yok :" + youtubebasligi);
       }

       driver.quit();
    }
}
