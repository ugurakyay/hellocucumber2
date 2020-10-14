package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utility.ConfigReader;

import java.io.IOException;

public class DriverInstance {

    static WebDriver driver = null;
    @Before

    //Initiate Driver Instance
    public static void StartDriverInstance() throws IOException {
        if(ConfigReader.readProjectConfigration("Browser").equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
            driver = new ChromeDriver();
        }
        else if (ConfigReader.readProjectConfigration("Browser").equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.chrome.driver","./Driver/geckodriver");
            driver = new FirefoxDriver();
        }
        else if (ConfigReader.readProjectConfigration("Browser").equalsIgnoreCase("IE")){
            System.setProperty("webdriver.chrome.driver","./Driver/InternetExplorerDriver");
            driver = new InternetExplorerDriver();

        }
        else{
            System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
            driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.readProjectConfigration("URL"));

    }
    //Returning Driver Instance
    public WebDriver getDriverInstance() throws IOException {
        if (driver == null) {
            DriverInstance.StartDriverInstance();
        }
        return driver;

    }

    //Setting Driver instance null

     public static void setDriverInstanceToNull(){
        driver = null;
     }
    @After
    public void closeBrowser(){

        driver.close();
    }

}
