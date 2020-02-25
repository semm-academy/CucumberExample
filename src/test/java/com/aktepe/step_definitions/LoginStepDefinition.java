package com.aktepe.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.aktepe.pages.LoginPage;
import com.aktepe.utils.Driver;

public class LoginStepDefinition {
    WebDriver driver = Driver.get();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://blogger.life/accounts/login");
    }

    @When("user enters email")
    public void user_enters_email() {
        loginPage.email.sendKeys("mucahitaktepe@gmail.com");
    }

    @When("user enters password")
    public void user_enters_password() {
        loginPage.password.sendKeys("root1234");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.button.click();
    }

    @Then("is page title {string}")
    public void is_page_title(String string) {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(string, pageTitle);
    }
}
