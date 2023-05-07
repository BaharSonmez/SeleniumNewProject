package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) {
        /*
        RELATIVE LOCATOR
        --Bir web sayfasinda benzer ozelliklere sahip webelementlerin oldugu durumlarda kullanilabilir
        --above --->Belirtilen elementin ustunde olan elementi secer
        --below --> Belirtilen elementin altinda olan elementi secer
        --to_left_of -->Belirtilen elementin solunda olan elementi secer
        --to_right_of -->Belirtilen elementin saginda olan elementi secer
        --- near  ---> belirtilen elementin yaninda yakininda olan elementi secer


         */



        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasina gidelim
        //city bike aratalim
        //Hybrid Bikes bolumune tiklayalim
        //Relative Locator kullanarak hibrit bike altindaki Webelemente tiklayalim

        driver.get("https://amazon.com");
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();
        driver.findElement(By.linkText(""));



    }
}
