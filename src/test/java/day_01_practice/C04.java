package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {
        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz

        //NOT: Bir internet sayfasinin kodlari icin control U yapariz
        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        //biz intelij uzerinden bu kaynak kodlara ulasabiliriz
         String sayfaKaynakKodlari =driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);

        if(sayfaKaynakKodlari.contains("Gateway")){
            System.out.println("Kaynak kodlarinda Gateway yaziyor");
        }else System.out.println("Kaynak kodlari Gateway icermiyor");

        driver.close(); //Bulundugumuz sayfayi kapatir


        // driver.quit();//acilan butun sayfalari kapatir.......





    }
}
