package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //1- amazon.com'a gidip arama kutusunu locate edin
       // 2- arama kutusunun tagName'inin input oldugunu test edin
        //3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin







        //Amazon sayfasinda kac adet link vardir, simdi bunu bulalim
        driver.get("https://amazon.com");
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        String actualTagName = aramakutusu.getTagName();
        String expectedTagName = "input";
        if(actualTagName.equals(expectedTagName)){
            System.out.println("Test Passed");
        }else System.out.println("Test failed");


        String actualAttribute =aramakutusu.getAttribute("name");
        String expectedAttribute = "field-keyword";
        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("Test Passed");

        }else System.out.println("test Failed");




    }


}
