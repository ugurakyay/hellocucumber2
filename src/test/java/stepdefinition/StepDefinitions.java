package stepdefinition;

import base.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utility.ConfigReader;

import java.io.IOException;

public class StepDefinitions {
WebDriver driver = null;

    @Given("user can login")
    public void user_can_login() throws IOException {
        DriverInstance.StartDriverInstance();
        System.out.println(ConfigReader.readProjectConfigration("URL"));

    }
    @When("user login page")
    public void user_login_page() throws IOException {


        System.out.println( ConfigReader.readElementLocators("login_page_tag")); // Write code here that turns the phrase above into concrete actions

    }




    @Then("user password")
    public void user_password() {
        System.out.println("login3"); // Write code here that turns the phrase above into concrete actions

    }

    @Then("user click button")
    public void user_click_button() {
        System.out.println("login4");// Write code here that turns the phrase above into concrete actions

    }

    @Then("User looged in")
    public void user_looged_in() {
        // Write code here that turns the phrase above into concrete actions

    }

}
