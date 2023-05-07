package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        // ilk kutucuga 20 giriniz
        // ikinci kutucuga 30 giriniz
        // calculate'e tıklayınız
        // sonucu yazdırınız
        // sayfayi kapatiniz

        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        Thread.sleep(2000);

        WebElement ilkKutucuk = driver.findElement(By.id("number1"));
        ilkKutucuk.sendKeys("20");
        Thread.sleep(2000);

        WebElement ikinciKutucuk =driver.findElement(By.id("number2"));
        ikinciKutucuk.sendKeys("30");
        Thread.sleep(2000);

      WebElement calculate =  driver.findElement(By.id("calculate"));
      calculate.click();
      Thread.sleep(2000);


      WebElement sonuc =driver.findElement(By.id("answer"));
        System.out.println("TOPLAMA ISLEMININ SONUCU =" + sonuc.getText());

        driver.close();







    }
}
