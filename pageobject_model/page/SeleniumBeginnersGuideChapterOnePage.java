package pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class SeleniumBeginnersGuideChapterOnePage extends AbstractPage {


    @FindBy(xpath = "//div[@class = 'loadajax']")
    private WebElement pageWithAjaxLink;

    @FindBy(id = "ajaxdiv")
    private WebElement textFromAjaxLinl;

    protected AbstractPage openPage() {
        throw new RuntimeException("Any text");
    }

    public SeleniumBeginnersGuideChapterOnePage(WebDriver driver) {
        super(driver);

    }


    public SeleniumBeginnersGuideChapterOnePage goToLinkWithAjax() {

        pageWithAjaxLink.click();
        return this;

    }

    public String getAjaxText() throws InterruptedException {
        //new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='ajaxdiv']/p")));
        //new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(textFromAjaxLinl));
        Thread.sleep(5000);
        return textFromAjaxLinl.getText().trim();

    }
}
