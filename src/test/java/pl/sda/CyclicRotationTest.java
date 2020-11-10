package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class CyclicRotationTest {

    @ParameterizedTest
    @MethodSource("prepareInitData")
    void rotate(List<Integer> digits, Integer shift, List<Integer> expectedDigits) {
        //given
        CyclicRotation cyclicRotation = new CyclicRotation();
        //when
        cyclicRotation.rotate(digits, shift);
        //then
        Assertions.assertEquals(digits, expectedDigits);
    }

    private static Stream<Arguments> prepareInitData() {
        return Stream.of(
                Arguments.arguments(new ArrayList<>(), 1, new ArrayList<>())
        );
    }

}