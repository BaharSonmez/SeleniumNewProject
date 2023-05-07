package day04_xpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");


        //Search(ara) “city bike”
        //input[@id='twotabsearchtextbox']
       WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike");
        aramakutusu.submit();  //bununla ENTER YAPTIM


        //Amazon'da görüntülenen ilgili sonuçlardan HYBRID BIKES tikla ve gorunur olup olmadiigni, secilebilir
        //olup olmadigini ve erisilebilir olup olmadigini kontrol ediniz..


        //(//*[class='a-size-base a-color-base'])[11] --Bu sekilde unique olarak aliyorum
        //ama eger text olarak almak istersek o satir ayni yerde acilip kapanmissa Attribute belirtilmeden adinin yazdigi yerden yani text ten alabiliriz
        //soyle
        //*[text()='Hybrid Bikes'] --> xpath ile locate alirken HTML kodlarinda attribute name olmayan <tagname class = degeri>text()
        //metni bu sekildelocate edebiliriz

       WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));

        System.out.println(hybridBike.isDisplayed());// webelement goruntuleniyormu
        System.out.println(hybridBike.isEnabled()); // webelement erisilebiliyormu
        System.out.println(hybridBike.isSelected()); //webelement secilebiliyormu //yani burda tiklenebiliyormu diyor
        hybridBike.click();






        //Sadece sonuc sayısını yazdıralım
        /*
        //*[text()='15 results for']
        (//*[@class='a-section a-spacing-small a-spacing-top-small'])[1] --> 15 results for "city bike"
         */
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//*[@class='a-link-normal s-no-outline'])[1]")).click();
        //Sayfayı kapatınız
        driver.close();














    }
}
