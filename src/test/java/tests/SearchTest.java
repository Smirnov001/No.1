package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static constants.Constant.Login.login;
import static constants.Constant.Login.password;


public class SearchTest extends BaseTest {
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
    public void search() {
        basePage.gotoUrl();
        searchPage  .inputText()
                    .pushButtonSearch();
        Assertions.assertEquals("Москва",searchPage.positiveSearch());


    }
}

