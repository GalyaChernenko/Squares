package ru.netology.qa52.Squares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqrt.csv")


    public void test(int expected, int numMin, int numMax) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(numMin, numMax);

        Assertions.assertEquals(expected, actual);

    }


}
