package com.jcpenny.pages;

import configuration.common.WebTestBaseBrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.jcpenny.pageElement.HomePageElementsLocator.*;
public class HomePageAction2 extends WebTestBaseBrowserSetup {

    public HomePageAction2(WebDriver driver) {
        // WebTestBase.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath=searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath=searchButtonWebElement)
    public WebElement searchButton;
    public void searchProductUsingValidProductName() throws InterruptedException {
        Thread.sleep(4000);
        searchBox.sendKeys("t-shirt");
        Thread.sleep(4000);
        searchButton.click();
        Thread.sleep(4000);

    }







}
