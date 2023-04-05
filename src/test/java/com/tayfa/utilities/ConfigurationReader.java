package com.tayfa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;  // Propertiesten obje olusturduk

    static {
        String path="configuration.properties";              // dosya yolunu aldik ve path olarak atama yaptik
        FileInputStream file= null; // Path dosyasini okumasi icin FileInputStream dosyasinda obje olusturduk
        try {
            file = new FileInputStream(path);
            properties=new Properties();                    // bos bir bitane properties dosyasi olusturduk
            properties.load(file);                              // properties dosyasnin icine javanin acmis oldugu dosyayi yükle dedik
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){          // istedigimiz yerden ulasabilmek icin public static yaptik
                                                            // getproperty ile istedigimiz yerden configreader.getproperty(browser yada engineer)
                                                            // ile getirebiliriz
        return properties.getProperty(key);      // properties nesnesinin icine git bana key olarak ne istendiyse getir demek
    }

    //Bi kere Configreader dosyasi olusturursak istedigmiz yerde kullanabiliriz

}
