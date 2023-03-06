package tests;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.*;


import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;
import static constants.Constant.Login.login;
import static constants.Constant.Login.password;

@ExtendWith(Listener.class)

//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected SearchPage searchPage = new SearchPage(driver);
    protected ChangeTheLanguagePage changeTheLanguagePage = new ChangeTheLanguagePage(driver);
    protected DownloadPage downloadPage = new DownloadPage (driver);
    private static final Logger LOGGER= LoggerFactory.getLogger(BaseTest.class);



    static {
        LOGGER.info("START TIME" + LocalTime.now());
        LOGGER.info("Start clear reports directory: build/reports...");
        File allureResults = new File("allure-results");
        if (allureResults.isDirectory()){
            for (File item : Objects.requireNonNull(allureResults.listFiles()))
            item.delete();
        }
        if (CLEAR_REPORTS_DIR) {
            File allureScreenshots = new File("build/reports/tests");
            for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
                item.delete();
       }
    }


    @AfterEach
    void clearCookiesAndLocalStorage(){
        if (Clear_Cookies){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
      }
    }
    @AfterAll
    void close(){
        if (!HOLD_BROWSER_OPEN);
        driver.close();

    }
}
