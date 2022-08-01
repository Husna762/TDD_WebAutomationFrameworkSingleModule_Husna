package com.jcpenny.testPages.HomePageTest;

import com.jcpenny.pages.HomePageAction1;
import configuration.common.WebTestBaseBrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jcpenny.pageElement.HomePageElementsLocator.verifySearchedProductWebElement;

public class HomePageActionTestVerification2 extends WebTestBaseBrowserSetup {
    HomePageAction1 homePageAction2;
    @BeforeMethod
    public void getInit(){
        homePageAction2= PageFactory.initElements(driver, HomePageAction1.class);
    }
    @Test
    public void verifySearchProductUsingValidProductName() throws InterruptedException {
//        homePageAction2= new HomePageAction2(driver);
        // Action method
        homePageAction2.searchProductUsingValidProductName();
        getInit();
        //Verification method
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        String expectedProductName = "St. John's Bay Womens V Neck Short Sleeve T-Shirt";
        System.out.println("Actual : " + actualProductName);
        System.out.println("Expected " + expectedProductName);
        Assert.assertEquals(actualProductName, expectedProductName, "Verify Search product");
        Thread.sleep(3000);

    }





}
