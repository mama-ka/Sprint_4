package com.exampl;
import com.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import io.qameta.allure.junit4.DisplayName;


@DisplayName("Тесты проверки имени")
@RunWith(Parameterized.class)

public class AccountTest {
    private final String fullName;
    private final boolean  expected;

    public AccountTest(String fullName, boolean expected){
        this.fullName = fullName;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[] getFullNameData() {
        return new Object[][] {
                //2 символа
                {"Ян", false},
                //22 символа
                {"Александра Виноградова",false},
                //пробел вначале
                {" Алксандра", false},
                //пробел в конце
                {"Алксандра ", false},
                //без пробела
                {"Алксандра", false},
                //два пробела
                {"Алла Петрова Ким", false},
                //середина диапазона
                {"Алла Иванова", true},
                //3 символа, граница
                {"А Я", true},
                //19 символов, граница
                {"Александра Виноград",true},
        };
    }
    @Test
    public void checkNameToPrintTest() {
        Account account = new Account(fullName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
