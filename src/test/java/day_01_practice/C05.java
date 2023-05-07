package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {
        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        System.out.println("maximize pencere konumu"+ driver.manage().window().getPosition());

        System.out.println("Maxima pencere olcusu" + driver.manage().window().getSize());


        driver.manage().window().fullscreen();
        System.out.println("Full Screen pencere konumu"+ driver.manage().window().getPosition());

        System.out.println("Full screen pencere olcusu" + driver.manage().window().getSize());
        driver.close();


    }
}
