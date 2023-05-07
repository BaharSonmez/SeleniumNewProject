package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_WebelementLocator {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        //Search box bolumunu locate ediniz
        //ve amazonda iphone aratiniz

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);//buarayada yazilir
        //SUBMIT YAPMAK YERINE SENDKEYS ("iphone",Keys.ENTER); olarak kullanabiliriz)

      // WebElement searchBox =   driver.findElement(By.id("twotabsearchtextbox"));
         // searchBox.submit();//Enter yapmak icin kullanilir

       //NOT: Eger bir webelementi birden fazla kullanilacaksa bir webelement e atama yapilabilir
        // searchBox.sendKeys("iphone"); //Locate ettigimiz search box a iphone metnini gonderir
        //




    }
}
