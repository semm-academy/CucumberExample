package com.aktepe.pages;

import com.aktepe.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBlogPage{
    @FindBy (name="domain")
    WebElement domain;

    @FindBy(className = "select2-search__field")
    WebElement kategoriler;

    @FindBy(name="price_zeo")
    WebElement priceZeo;

    @FindBy(name= "is_bill_provide")
    WebElement fatura;

    @FindBy(css = "button.btn.btn-primary.btn-block")
    WebElement clickButton;

    public AddBlogPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void fillBlogForm() {
        this.domain.sendKeys("example.com");
        this.kategoriler.sendKeys("Spor");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.kategoriler.sendKeys(Keys.RETURN);
//        this.kategoriler.sendKeys("Aile");
//        this.kategoriler.sendKeys(Keys.ENTER);
//        this.priceZeo.sendKeys("10.0");
//        this.fatura.click();
        this.clickButton.click();
    }
}
