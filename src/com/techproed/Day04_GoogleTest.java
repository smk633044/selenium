package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit(); //!!! asagidaki click(); ile ayni gorevi goruyor!
      //  WebElement googleSearch = driver.findElement(By.name("btnK"));
       // googleSearch.click();

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        String x = sonucSayisi.getText();

        System.out.println(x);

        WebElement shoppineTikla = driver.findElement(By.partialLinkText("Shopping"));
        shoppineTikla.click();

        WebElement ilkResim = driver.findElement(By.id("srpresultimg_14853685920785148265_1_0"));
        ilkResim.click();





    }
}
