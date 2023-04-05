package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleAramaTest {
    @Test
    public void aramaTesti(){
        Driver.getDriver().get("https://www.google.com");

        ReusableMethods.sleep(3000);

        //Basligi alalim
        String baslik=Driver.getDriver().getTitle();
        System.out.println(baslik);


        // navigate ile sayfa gecmisini yönetebiliriz. ileri geri veya baska sayfaya gidebiliriz.
        // istedigimiz sayfaya götürür.
        Driver.getDriver().navigate().to("https://www.amazon.com");

        List<WebElement> linkler=Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement element:linkler
             ) {
            System.out.println(element.getText());

        }






        //Basligi Alalim
        String baslik1=Driver.getDriver().getTitle();
        System.out.println(baslik1);

        //sendKeys ("") ile yaziyi göndeririz
        // getText() komutu ile istenilen seyi getirir.String olarak Webelementin icerdigi yaziyi getirir.




        //Google.com a geri dönelim
        Driver.getDriver().navigate().back();

        ReusableMethods.sleep(3000);

        //amazon.com a geri dönelim
        Driver.getDriver().navigate().forward();

        Driver.closdriver();


        //xpath yöntemleri
        //tagName[@attribute="deger"]
        //tagName[.="deger"]
        //tagName[@attribute1="deger1"
        //*[.="yazi"]
        //*[contains(text(),"Hamza")]
    }
}
