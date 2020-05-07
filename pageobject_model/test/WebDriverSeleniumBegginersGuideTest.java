package pageobject_model.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.page.SeleniumBeginnersGuideHomePage;

public class WebDriverSeleniumBegginersGuideTest {

    private WebDriver driver;
    private String expectedTextFromAjaxLink = "The following text has been loaded from another page on this site. It has been loaded in an asynchronous fashion so that we can work through the AJAX section of this chapter";
    private String textfromAjaxLink;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
    }


    @Test(description = "Jira ticket Task7")
    public void verifyTextWithAjaxLink() throws InterruptedException {
         textfromAjaxLink = new SeleniumBeginnersGuideHomePage(driver)
                .openPage()
                .goToChapterOnePage()
                .goToLinkWithAjax()
                .getAjaxText();
        System.out.println(textfromAjaxLink);
        System.out.println(expectedTextFromAjaxLink);
        Assert.assertEquals(textfromAjaxLink, expectedTextFromAjaxLink);


    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();


    }

}
