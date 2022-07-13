package com.jcpenny.HomePageTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jcpenny.pageElement.HomePageElements.*;
import static com.jcpenny.pages.HomePage.searchWithValidProductName;
import static configuration.common.WebTestBase.driver;

public class HomePageTest {


   @Test
    public static void VerifySearchWithValidProductName() throws InterruptedException {


        //ActionMethod
        searchWithValidProductName();

        //Verification method
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        String expectedProductName  = "";
        System.out.println("Actual : " + actualProductName);
        System.out.println("Expected " + expectedProductName);
        Assert.assertEquals(actualProductName, expectedProductName, "Verify Search product");
        Thread.sleep(3000);


    }


}
