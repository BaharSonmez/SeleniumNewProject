package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;






        public class C02 {


            public static void main(String[] args) throws InterruptedException {

                // Pencereyi maximize yapiniz
                // "https://teknosa.com/" adresine gidiniz
                // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
                // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
                // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
                // "https://medunna.com/" adresine gidiniz
                // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
                // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
                // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
                // teknosa adresine geri donunuz
                // Sayfayı yenileyiniz
                // medunna adresine ilerleyiniz
                // Sayfayı yenileyiniz
                // pencereyi kapat




                System.setProperty("chromeDriver","src/main/resources/chromedriver.exe");
                WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


                // Pencereyi maximize yapiniz
                driver.manage().window().maximize();




                // "https://teknosa.com/" adresine gidiniz
                driver.get("https://teknosa.com/");
                Thread.sleep(2000);




                // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz

                String teknosaTitle = driver.getTitle();
                System.out.println("teknosaTitle: " + teknosaTitle);


                String teknosaURL = driver.getCurrentUrl();
                System.out.println("teknosaURL: " + teknosaURL);






                // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz

                if(teknosaTitle.contains("Teknoloji")){
                    System.out.println("Title Teknoloji iceriyor");
                }else{
                    System.out.println("Title Teknoloji icermiyor");
                }







                // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz

                if(teknosaURL.contains("teknosa")){
                    System.out.println("URL teknosa iceriyor");
                }else {
                    System.out.println("URL teknosa icermiyor");
                }






                // "https://medunna.com/" adresine gidiniz
                driver.get("https://medunna.com/");
                Thread.sleep(2000);




                // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz

                String medunnaTitle = driver.getTitle();
                System.out.println("medunnaTitle: " + medunnaTitle);


                String medunnaURL = driver.getCurrentUrl();
                System.out.println("medunnaURL: " + medunnaURL);





                // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.

                if(medunnaTitle.contains("MEDUNNA")){
                    System.out.println("Title MEDUNNA iceriyor");
                }else {
                    System.out.println("Title MEDUNNA icermiyor");
                }





                // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz

                if(medunnaURL.contains("medunna")){
                    System.out.println("URL medunna iceriyor");
                }else {
                    System.out.println("URL medunna icermiyor");
                }







                // teknosa adresine geri donunuz
                driver.navigate().back();
                Thread.sleep(2000);






                // Sayfayı yenileyiniz
                driver.navigate().refresh();
                Thread.sleep(2000);




                // medunna adresine ilerleyiniz
                driver.navigate().forward();
                Thread.sleep(2000);



                // Sayfayı yenileyiniz
                driver.navigate().refresh();
                Thread.sleep(2000);



                // pencereyi kapat
                driver.close();








            }
        }





