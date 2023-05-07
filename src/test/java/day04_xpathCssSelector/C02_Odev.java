package day04_xpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;
import java.time.Duration;

public class C02_Odev {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1-amazon sayfasina gidiniz
        driver.get("https://www.amazon.com/");

        //2-Browser i tam sayfa yapiniz
        driver.manage().window().maximize();

        //3-sayfayi refresh yapin
        driver.navigate().refresh();

        // 4-Sayfa basliginini yazdiralim ve spend less ifadesi icerdigini test edin
        System.out.println(driver.getTitle());
         String actualsayfaBasligi= driver.getTitle();
         String expectedSayfabasligi ="Spend less";

         if(actualsayfaBasligi.contains(expectedSayfabasligi)){
             System.out.println("TEST PASSED");

        }else System.out.println("TESTED FAILED");

       //5-Gift Card sekmesine basin
       WebElement giftCard = driver.findElement(By.xpath("//*[text()='Gift Cards']"));



       giftCard.submit();
      //6-Birthday butonuna basin
        driver.findElement(By.xpath
                        ("(//*[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png'])"))
                .submit();

        //7-Bestseller bolumundeki ilk urunu tiklayin
         WebElement firstBestSel=driver.findElement(By.xpath("(//*[@src='https://images-na.ssl-images-amazon.com/images/I/514e0G6lFiL._AC_SX184_.jpg'])[1]"));
         firstBestSel.submit();



        //8-Gift card Details den 25$ i secin
        WebElement fiyatamaount = driver.findElement(By.xpath("(//*[text()='Up to $25'])"));
        fiyatamaount.submit();
        System.out.println(fiyatamaount.getText());


        // 9- Urun ucretinin 25$ oldugunu test edin

       WebElement cardUcreti = driver.findElement(By.xpath("//*[text()=' Gift amount ($50 - $2,000):']"));
        System.out.println("gift card ucreti " +cardUcreti.getText());

       if(cardUcreti.equals(fiyatamaount)) {
           System.out.println("TESTED PASSED");
       }else System.out.println("TESTED FAILED");


    }

}
