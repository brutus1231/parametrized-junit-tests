package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("prepareInputData")
    void shouldCheckIsPrimeOccurredWithMethodSource(Integer a, Integer b, Boolean expectedResult) {
        //given
        PrimeDigitRangeChecker checker = new PrimeDigitRangeChecker();
        //when
        boolean checkResult = checker.check(a, b);
        //then
        Assertions.assertEquals(checkResult, expectedResult);
    }

    private static Stream<Arguments> prepareInputData(){
        return Stream.of(
                Arguments.arguments(10,20, true),
                Arguments.arguments(-10,-1, false),
                Arguments.arguments(100,200, true),
                Arguments.arguments(13,13, true),
                Arguments.arguments(13,14, true),
                Arguments.arguments(100,100, false),
                Arguments.arguments(-10,2, true),
                Arguments.arguments(-20,1, false)
        )
    }
}