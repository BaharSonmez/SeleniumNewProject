package day04_xpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
       WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
       addElement.click();
       Thread.sleep(2000);


        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("Delete Buttoon Gorunurmu = " + deleteButton.isDisplayed());

        //Delete tusuna basin
        deleteButton.click();
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin"'
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));
        //Eger xpath ile almak isterseniz
        System.out.println("AddRomove Elements Gorunumu ="+ addRemoveElement.isDisplayed());
        //Sayfayi kapaniz
        driver.close();
        /*
        Xpath ve CSSSelector arasindaki farklar:
          --Xpath metin ile calisabilir CSSSelector calisamaz
          --Xpath daha fazla kombinasyona sahiptir ve index e gore arama yapilabilir
          --CSSSelector indexe gore arama yapamaz ancak daha hizli calisir

         */



    }
}
