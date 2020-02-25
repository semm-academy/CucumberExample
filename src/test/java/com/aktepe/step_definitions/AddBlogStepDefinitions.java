package com.aktepe.step_definitions;

import com.aktepe.pages.AddBlogPage;
import com.aktepe.pages.LoginPage;
import com.aktepe.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddBlogStepDefinitions {
    WebDriver driver = Driver.get();
    LoginPage loginPage = new LoginPage();
    AddBlogPage blogPage = new AddBlogPage();

    @Given("user is on the domain page")
    public void user_is_on_the_domain_page() {
        driver.get("https://blogger.life/accounts/login/");
        loginPage.login("mucahitaktepe@gmail.com", "root1234");
        driver.navigate().to("https://blogger.life/domain/");
    }

    @When("user fill blog form")
    public void user_fill_blog_form() {
        blogPage.fillBlogForm();
    }

    @Then("is page title Anasayfa")
    public void is_page_title() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Anasayfa", pageTitle);
    }
}
