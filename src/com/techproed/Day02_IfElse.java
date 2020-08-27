package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String sayfaBasligi = driver.getTitle();   // Car

        // contains methodu, bir yazinin icerisinde bir kelime gurubunun gecip gecmedigini kontrol eder.
        if(sayfaBasligi.contains("Books")){
            System.out.println("Books kelimesi geciyor : " + sayfaBasligi );
        }else{
            System.out.println("Books kelimesi gecmiyor:" + sayfaBasligi);
        }



      driver.quit();

        // if - else
        // for dongusu
        // nesne olusturma
        // methodlar
        //foreach
        //Java da bu konulari tekrar edelim selenium da cok kullanilacak

    }
}
