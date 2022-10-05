package tests.day18;

import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void test01() {
        // Amazon sayfasına ve facebook sayfasına gidiniz
        // TestNG de
        // 1- Öncelikle configuration ’a tanimlamalar yapılır(username,url,password gibi)
        // 2- Pages sayfasinda locate’leri yapariz
        // 3- ConfigReader ile sorunun çözümünü yapilir

        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
       HmcPage hmcPage = new HmcPage();
         /*
       Page class'indaki locate'lerimizi ulasabilmek icin
       Pageclass'imizdan bir obje olusturarak,olusturmus olmus oldugumuz obje ile page classimizdaki
         */
        Driver.closeDriver();
    }

}
