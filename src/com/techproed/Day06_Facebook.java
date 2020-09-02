package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");


        //1. Adim  4. dakika
        //email kutusuna techproed@gmail.com yazdiralim

        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        // data-testid="royal_email" placeholder="Email address or phone number"
        // autofocus="1" aria-label="Email address or phone number">

        //! class ile bulamayiz cunku clas'ta bosluk var.!
// 1. yol
       // WebElement emailKutusu = driver.findElement(By.xpath("//input[@ id ='email']"));
        //emailKutusu.sendKeys("techproed@gmail.com");
//2.yol
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        //2.adim
        //sifre  kutusuna Test1234 yazdiralim

        //<input type="password" class="inputtext _55r1 _6luy"
        // name="pass" id="pass" data-testid="royal_pass"placeholder="Password" aria-label="Password">

//1.yol
    //  WebElement sifreKutusu = driver.findElement(By.id("pass"));
      //sifreKutusu.sendKeys("Test1234");
//2.yol
        WebElement sifraKutusu = driver.findElement(By.xpath("//*[@type='password']"));
        sifraKutusu.sendKeys("Test1234");
        //3.adim
        //login butonunu bulalim

      //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login"
        // data-testid="royal_login_button" type="submit" id="u_0_b">Log In</button>

        WebElement loginBut = driver.findElement(By.id("u_0_d"));
        loginBut.click();

        // Burada java 3 saniye bekleyecek

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        String url = driver.getCurrentUrl();
        System.out.println(url);
      if(url.contains("facebook.com/login/")){
          System.out.println("Giris Basarisiz !");
      }else{
          System.out.println("Giris Basarili !");
      }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();



    }
}
