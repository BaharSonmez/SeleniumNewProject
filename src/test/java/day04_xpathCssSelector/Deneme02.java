package day04_xpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Deneme02 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Arama butonunu xPath ile alin
        //Search(ara) “city bike”
        //input[@id='twotabsearchtextbox']
      WebElement aramabutonu = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])"));
      aramabutonu.sendKeys("city bike");
      aramabutonu.submit();

    // WebElement ilkresim = driver.findElement(By.xpath("(//img[@class='s-image'])"));
     //ilkresim.submit();
        WebElement ilkresim = driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])"));
    ilkresim.click();
    }
}
