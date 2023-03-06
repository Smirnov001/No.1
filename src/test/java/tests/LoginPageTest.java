package tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static constants.Constant.Login.*;


public class LoginPageTest extends BaseTest {

        @Test
    public void autoPositive() {
            basePage.gotoUrl();
            loginPage.clickButtonLogin()
                    .enterLoginInput(login)
                    .enterPasswordInput(password)
                    .clickButtonV()
                    .enterButtonEnter();
            Assertions.assertEquals("Smirnov 001777",loginPage.autoOk());
        }
    @Test
    public void autoNegative() {
        basePage.gotoUrl();
        loginPage.clickButtonLogin()
                .enterLoginInput(failLogin)
                .enterPasswordInput(failPassword)
                .clickButtonV()
                .enterButtonEnter();
        Assertions.assertEquals("Введены неверные имя участника или пароль. Попробуйте ещё раз.", loginPage.getError());
    }
}