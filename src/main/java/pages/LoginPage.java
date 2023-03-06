package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By buttonLogin = By.xpath("//*[@id='pt-login']/a/span");
    private final By inputLogin = By.xpath("//input[@id='wpName1']");
    private final By inputPassword = By.xpath("//input[@id='wpPassword1']");
    private final By buttonV = By.xpath("//input[@name='wpRemember']");
    private final By buttonEnter = By.xpath("//button[@id='wpLoginAttempt']");

    public LoginPage clickButtonLogin(){
        driver.findElement(buttonLogin).click();
        return this;
    }

    public LoginPage enterLoginInput(String login) {
        driver.findElement(inputLogin).sendKeys(login);
        return this;
    }
    public LoginPage enterPasswordInput(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }
    public LoginPage clickButtonV(){
        driver.findElement(buttonV).click();
        return this;
    }
    public LoginPage enterButtonEnter() {
        driver.findElement(buttonEnter).click();
        return this;

    }
    public String autoOk(){
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pt-userpage']/a/span")));
        return driver.findElement(By.xpath("//*[@id='pt-userpage']/a/span")).getText();
    }

    public String getError(){
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userloginForm']/form/div[1]")));
        return driver.findElement(By.xpath("//*[@id='userloginForm']/form/div[1]")).getText();
    }


}
