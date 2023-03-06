package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeTheLanguagePage extends BasePage {

    public ChangeTheLanguagePage(WebDriver driver) {super(driver);}

    private final By buttonEnglishLan = By.xpath("//*[@id='p-lang']/div/ul/li[13]/a/span");

    public ChangeTheLanguagePage clickButtonEnglishLan(){
        driver.findElement(buttonEnglishLan).click();
        return this;
    }
    public String changeEngOk (){
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='articlecount']/a[2]")));
        return driver.findElement(By.xpath("//*[@id='articlecount']/a[2]")).getText();
    }

}
