package com.websitename.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Each java page class represents a page of the website page object model +page factory model
 */
public class HomePage {

    private WebDriver driver;

    //Locate using various locator techniques
    @FindBy(id = "lst-ib")
    private WebElement searchBar;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    // Constructor to initialize WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // List down methods/actions that can be performed on this page

    public void typeInSearchBar(String charSequences) {

        //First clear the search bar if anything present
        searchBar.clear();
        //type in the keywords to search
        searchBar.sendKeys(charSequences);
        searchBar.click();

    }

    public void search(){
        searchButton.click();
    }
}
