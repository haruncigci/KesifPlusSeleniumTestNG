package com.tayfa.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.lang.module.Configuration;

public class Driver {

    static WebDriver driver;     // tarayicilari burdan cagiririz
                                    // static cünkü heryerden cagirmak ve her zaman once olussun diye

    public static WebDriver getDriver(){     // herhangi bir yerden getDriver methodu cagirilirsa bize driveri getirecek
        if (driver==null){
            // properties dosyasinn icerisindeki "browser" anahtarinin
            // degerini getirecek -----> chrome
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver=new SafariDriver();
                    break;

            }



        }
        return driver;
    }
    public static void closdriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
