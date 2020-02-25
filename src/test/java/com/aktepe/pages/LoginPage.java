package com.aktepe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aktepe.utils.Driver;

public class LoginPage {
    @FindBy(name = "username")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(id = "btn")
    public WebElement button;

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void login(String username, String password) {
        this.email.sendKeys(username);
        this.password.sendKeys(password);
        this.button.click();
    }
}