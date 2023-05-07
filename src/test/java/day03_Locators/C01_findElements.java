package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_findElements {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasinda kac adet link vardir, simdi bunu bulalim
        driver.get("https://amazon.com");
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        //Linkler tag i <a>//HTML kodudur.
        System.out.println("Linklerin sayisi= "+ linklerListesi.size());


        for(WebElement w:linklerListesi){
            System.out.println(w.getText());
        }




    }

}