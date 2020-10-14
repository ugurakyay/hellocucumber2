package useractivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

public class userActions {
    WebDriver driver = null;
    public void PageActions(WebDriver driver){
        this.driver=driver;
    }

    public void clickButton(WebElement element) throws IOException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }
        catch (Exception e){
            System.out.println("Test case fail ");
            e.printStackTrace();
            CaptureScreenshot.takeScreenshot(driver, "Test Step Fail");
            Assert.fail();
        }

    }

    public void enterDAtaIntoTextBox(WebElement element,String text) throws IOException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(text);
        }
        catch (Exception e) {
            System.out.println("Test case fail ");
            e.printStackTrace();
            CaptureScreenshot.takeScreenshot(driver, "Test Step Fail");
            Assert.fail();
        }

    }

    public void selectVisibleTextInDropdown(WebElement element,String text) throws IOException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.textToBePresentInElement(element,text));
            Select s = new Select(element);
            s.selectByVisibleText(text);
        }
        catch (Exception e){
            System.out.println("Test case fail ");
            e.printStackTrace();
            CaptureScreenshot.takeScreenshot(driver, "Test Step Fail");
            Assert.fail();
        }

    }
}
