package utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readProjectConfigration (String keyName) throws IOException {
        String value = null;
        try {
            FileReader file = new FileReader(new File("ConfigFile/ProjectConfig.properties"));
            Properties readproperty = new Properties();
            readproperty.load(file);
            return readproperty.getProperty(keyName).trim();
        } catch (Exception exeption) {
            exeption.printStackTrace();
            throw (new RuntimeException("******ERROR*******"+keyName+"does not exist"));
        }


    }

    public static String readElementLocators(String keyName) throws IOException {
        String value = null;
        try {
            FileReader file = new FileReader(new File("ElementLocators/Locators.properties"));
            Properties readproperty = new Properties();
            readproperty.load(file);
            return readproperty.getProperty(keyName).trim();
        } catch (Exception exeption) {
            exeption.printStackTrace();
            throw (new RuntimeException("******ERROR*******"+keyName+"does not exist"));
        }


    }
}
