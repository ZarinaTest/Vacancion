package ru.netology.services.vacancion.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacancionTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacancion.csv")
    public void testCashVacancion(int expected, int income, int expenses, int threshold) {
        Vacancion service = new Vacancion();
        //int expected = 3;
        //int income = 10_000; // доход от работы
        //int expenses = 3_000; // обязательные месячные траты
        //int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    //   @Test
    //  public void testCashVacancionRich() {
    //  Vacancion service = new Vacancion();
    //  int expected = 2;
    //  int income = 100_000; // доход от работы
    //  expenses = 60_000; // обязательные месячные траты
    //  int threshold = 150_000; // есть возможность отдохнуть
    //  int actual = service.calculate(income, expenses, threshold);

    //    Assertions.assertEquals(expected, actual);
    //}

}
