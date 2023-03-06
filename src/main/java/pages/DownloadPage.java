package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadPage extends BasePage {
    public DownloadPage(WebDriver driver) {super(driver);}

    private final By buttonFavorites = By.xpath("//*[@id='n-featured']/a/span");
    private final By buttonStateNeapol = By.xpath("//*[@id='mw-content-text']/div[1]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[1]/p[1]/b/a");
    private final By buttonDownloadStateNeapol = By.xpath("//*[@id='coll-download-as-rl']/a/span");
    private final By buttonDownloadStateNeapolPDF = By.xpath("//*[@id='mw-content-text']/form/div/span/span/button");

    public DownloadPage clickButtonFavorites(){
        driver.findElement(buttonFavorites).click();
        return this;
    }
    public DownloadPage clickButtonStateNeapol(){
        driver.findElement(buttonStateNeapol).click();
        return this;
    }
    public DownloadPage clickButtonDownloadStateNeapol(){
        driver.findElement(buttonDownloadStateNeapol).click();
        return this;
    }
    public DownloadPage clickButtonDownloadStateNeapolPDF(){
        driver.findElement(buttonDownloadStateNeapolPDF).click();
        return this;
    }
    public String AssertButton(){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mw-content-text']/form/div/span/span/button")));
        return driver.findElement(By.xpath("//*[@id='mw-content-text']/form/div/span/span/button")).getText();

    }
  }
