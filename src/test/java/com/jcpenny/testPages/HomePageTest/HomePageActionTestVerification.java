package com.jcpenny.HomePageTest;

import configuration.common.WebTestBaseBrowserSetup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jcpenny.pageElement.HomePageElementsLocator.*;
import static com.jcpenny.pages.HomePageAction.*;


public class HomePageActionTestVerification extends WebTestBaseBrowserSetup {


    @Test
    public static void VerifySearchWithValidProductName() throws InterruptedException {

        Thread.sleep(5000);
        //ActionMethod
        searchWithValidProductName();

        //Verification method
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        String expectedProductName = "St. John's Bay Womens V Neck Short Sleeve T-Shirt";
        System.out.println("Actual : " + actualProductName);
        System.out.println("Expected " + expectedProductName);
        Assert.assertEquals(actualProductName, expectedProductName, "Verify Search product");
        Thread.sleep(3000);


    }


}
