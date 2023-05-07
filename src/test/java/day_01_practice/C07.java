package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) throws InterruptedException {

        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//ben sayfanin acilmasi sinirini 15 saniye vr
        driver.get( "https://www.amazon.com/");
        Thread.sleep(2000);
       WebElement aramamotoru = driver.findElement(By.id("twotabsearchtextbox"));
       aramamotoru.sendKeys("nutella " + Keys.ENTER);


      List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));

        System.out.println(linklerListesi.size());

        //simdi linkler listesini yazdiricaz
        int sayac = 1; //daha sik hale getirelim. bIZ her bir linki yazdiriyoruz

        for(WebElement each:linklerListesi){
            System.out.println( sayac + " . link" + each.getText());

        }

       driver.close();


    }
}
