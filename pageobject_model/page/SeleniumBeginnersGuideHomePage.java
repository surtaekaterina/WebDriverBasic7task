package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public class SeleniumBeginnersGuideHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "http://book.theautomatedtester.co.uk";
    //private WebDriver driver;


    @FindBy(xpath = "//a[@href='/chapter1']")
            //a[@href="/chapter1"]
    private WebElement chapterOneLink;


    public SeleniumBeginnersGuideHomePage(WebDriver driver) {
        super(driver);

    }

    public SeleniumBeginnersGuideHomePage openPage() {
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.get(HOMEPAGE_URL);
       // new WebDriverWait(driver, 10).until(CustomCondition.
        return this;

    }

    public SeleniumBeginnersGuideChapterOnePage goToChapterOnePage() {
        chapterOneLink.click();
        return new SeleniumBeginnersGuideChapterOnePage(driver);
    }


}
