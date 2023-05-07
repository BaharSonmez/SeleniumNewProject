package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      /*

        Bir class oluşturun : AmazonSearchTest
      Main method oluşturun ve aşağıdaki görevi tamamlayın.
     a.web sayfasına gidin. https://www.amazon.com/
      Search(ara) “city bike”
     Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
     Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
     */



        driver.get("https://www.amazon.com");
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));
        //Listlerde index 0 dan baslar , biz locater ettigimizde aradigimiz sonuc yazisi 1.siradaydi
        //ve bu yuzden get 0 yaptik
        System.out.println("Sonuc Yazisi =" + sonucYazisi.get(0).getText());

        //Ben burada sonuc yazisini soyle desem:
        String sonucSayisi= sonucYazisi.get(0).getText().split(" ")[2];
        System.out.println("Sonuc saysisi = " + sonucSayisi);

        //bosluklardan split ile boldum ve 2.si bana sonuc saysi olan 134 u verir

        //Sonra karsiniza cikan ilk sonucun resmine tiklayin
        List<WebElement> sonuclar = driver.findElements(By.className("s-image "));
        sonuclar.get(0).click();
       //Bende class name ile calismadi!!!!!!!!



    }
}
