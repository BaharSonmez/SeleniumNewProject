package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        System.out.println("Sayfa konumu"+ driver.manage().window().getPosition());
        System.out.println("Sayfa boyutlari" +driver.manage().window().getSize());
        driver.manage().window().maximize();//acilan browser i maximize yapar
        driver.get("https://techproeducation.com");
        System.out.println("Sayfa konumu"+ driver.manage().window().getPosition());
        System.out.println("Sayfa boyutlari" +driver.manage().window().getSize());
        driver.manage().window().minimize(); //sayfayi asagiya indirir
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(50,50)); //istedigimiz konuma getiri
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
        driver.close();



    }
}
