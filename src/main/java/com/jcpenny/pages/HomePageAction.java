package com.jcpenny.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import static com.jcpenny.pageElement.HomePageElements.*;

public class HomePage extends WebTestBase {
    //    Action Class for business flow
    // search box functionality should work with valid product name
    // Action method for search box functionality with valid product name purpose

    public static void searchWithValidProductName() {
        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("t-shirt");
        driver.findElement(By.xpath(searchButtonWebElement)).click();

    }




}
