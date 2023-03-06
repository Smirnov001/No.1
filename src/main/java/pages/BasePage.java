package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.Login.url;
import static constants.Constant.Timeout.EXPLICIT_WAIT;

public class BasePage {
    protected static WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    /**
     * The method for navigating to a specific URL
     **/
    public void gotoUrl(){
        driver.get(url);
    }

    /**
     * Wait for visibility element in DOM model
     **/
    public WebElement waitElementIsVisible (WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until (ExpectedConditions.visibilityOf(element));
        return element;
    }

}
