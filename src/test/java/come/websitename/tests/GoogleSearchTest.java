package come.websitename.tests;

import com.websitename.pages.HomePage;
import com.websitename.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSearchTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = BrowserFactory.getDriver("chromedriver");

    }
    @Test(priority = 0)
    public void searchSomething() {

        driver.get("https://www.google.com");

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.typeInSearchBar("Smart watches");
        homePage.search();
    }

    @Test(priority = 1)
    public void displayAllMyLinks() {
        //code below can be put into SearchResultPage

        //get list of all the links in this page
        List<WebElement> allMyLinks = driver.findElements(By.tagName("a"));

        //uncomment if you want to include images that can be clicked
        //allMyLinks.addAll(driver.findElements(By.tagName("img")));

        for (WebElement webElement : allMyLinks) {

            System.out.println(webElement.getText());
        }
    }
}
