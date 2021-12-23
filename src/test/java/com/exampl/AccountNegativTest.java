package com.exampl;
import com.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import io.qameta.allure.junit4.DisplayName;


@DisplayName("Негативные тесты проверки имени")
@RunWith(Parameterized.class)

public class AccountNegativTest {
    private final String fullName;


    public AccountNegativTest(String fullName){
        this.fullName = fullName;

    }
    @Parameterized.Parameters
    public static Object[] getFullNameData() {
        return new Object[][] {
                //2 символа
                {"Ян"},
                //20 символов
                {"Александра Винограда"},
                //пробел вначале
                {" Александра"},
                //пробел в конце
                {"Александра "},
                //без пробела
                {"Александра"},
                //два пробела
                {"Алла Петрова Ким"},
        };
    }
    @Test
    public void checkNegativNameToPrintTest() {
        Account account = new Account(fullName);
        boolean actual = account.checkNameToEmboss();
        assertFalse (actual);

    }
}

