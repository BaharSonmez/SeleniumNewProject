package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //not:Sayfadaki her bir element icin  max 20 saniye bekler
       /*
        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
                Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin

        */
        driver.get("https://youtube.com");
       String actulaTitle = driver.getTitle();//gercek baslik
       String expectedTitle = "youtube"; //Beklenen baslik
       if (actulaTitle.equals(expectedTitle)){
           System.out.println("TEST PASSED");

       } else System.out.println("TEST FAILED Gercek baslik :" + actulaTitle);
       String actualURL=  driver.getCurrentUrl();
       String beklenenKelime = "youtube";
       if(actualURL.contains(beklenenKelime)){
           System.out.println("TEST PASSED");

       }else System.out.println("TEST FAILED Gercek URL = " +actualURL);

       driver.navigate().to("https://amazon.com");

       driver.navigate().back(); //YOUTUBE SAYFASINA GERI DONDUK
       driver.navigate().refresh();
       driver.navigate().forward(); //amazon sayfasina geri donduk

       String actualTitle = driver.getTitle();
       String istenenKelime = "Amazon";

        if (actulaTitle.contains(istenenKelime)) {
            System.out.println("TEST PASSED");

        }else System.out.println("TEST FAILED  Gercek Baslik ="+ actualTitle);
        String gercekURL = driver.getCurrentUrl();
        String istenenURL = "https://ww.amazon.com/";
        if(gercekURL.equals(istenenURL)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+gercekURL);

        //Sayfayi kapatin
        driver.close();
        }


        }










