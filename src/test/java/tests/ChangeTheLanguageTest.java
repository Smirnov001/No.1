package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static constants.Constant.Login.login;
import static constants.Constant.Login.password;

public class ChangeTheLanguageTest extends BaseTest {
    @BeforeEach
    public void auto(){
        basePage.gotoUrl();
        loginPage.clickButtonLogin()
                .enterLoginInput(login)
                .enterPasswordInput(password)
                .clickButtonV()
                .enterButtonEnter();
    }
    @Test
    public void ChangeLanguage() {
        basePage.gotoUrl();
        changeTheLanguagePage.clickButtonEnglishLan();
        Assertions.assertEquals("English",changeTheLanguagePage.changeEngOk());

    }
}


