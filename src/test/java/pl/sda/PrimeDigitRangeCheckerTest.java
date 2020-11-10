package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PrimeDigitRangeCheckerTest {

    @ParameterizedTest
    @CsvSource({"1,2, true", "3,4,true", "1,1,false", "14,16,false"})
    void shouldCheckIsPrimeOccurred(Integer a, Integer b, Boolean expectedResult) {
        //given
        PrimeDigitRangeChecker checker = new PrimeDigitRangeChecker();
        //when
        boolean checkResult = checker.check(a, b);
        //then
        Assertions.assertEquals(checkResult, expectedResult);
    }
}