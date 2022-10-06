package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"}, delimiter = ';')
    void calculate(String testName, int amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calcBonus(amount, registered);
        System.out.println(testName);
        Assertions.assertEquals(expected, actual);

    }

}
