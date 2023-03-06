package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {super(driver);}

    private static final By inputSearch = By.xpath("//input[@class='vector-search-box-input']");
    private final By buttonSearch = By.xpath("//input[@id='searchButton']");

    public SearchPage inputText(){
        driver.findElement(inputSearch).sendKeys("Moscow");
        return this;}
    public SearchPage pushButtonSearch(){
        driver.findElement(buttonSearch).click();
        return this;
    }

    public String positiveSearch() {
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='firstHeading']/span")));
        return driver.findElement(By.xpath("//*[@id='firstHeading']/span")).getText();
    }

}
