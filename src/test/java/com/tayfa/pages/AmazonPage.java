package com.tayfa.pages;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {


 //Bir sayfada Webelement bulma islemi yapilacaksa PageFactory olmasi olmazimizdir
 //Contructer ise mutlaka class ismi ile ayni olmalidir
    public AmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
}
