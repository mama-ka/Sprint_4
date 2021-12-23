package com.exampl;
import com.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import io.qameta.allure.junit4.DisplayName;

@DisplayName("Позитивные тесты проверки имени")
@RunWith(Parameterized.class)

public class AccountPositivTest {
    private final String fullName;


    public AccountPositivTest(String fullName){
        this.fullName = fullName;

    }
    @Parameterized.Parameters
    public static Object[] getFullNameData() {
        return new Object[][] {
                //середина диапазона
                {"Алла Иванова"},
                //3 символа
                {"А Я"},
                //4 символа
                {"А Пи"},
                //19 символов
                {"Александра Виноград"},
                //18 символов
                {"Александр Виноград"},

        };
    }
    @Test
    public void checkNameToPrintTest() {
        Account account = new Account(fullName);
        boolean actual = account.checkNameToEmboss();
        assertTrue("Можно напечатать невалидную строку", actual);
    }
}
