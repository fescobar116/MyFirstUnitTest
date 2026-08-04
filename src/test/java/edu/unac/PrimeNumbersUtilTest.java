package edu.unac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

class PrimeNumbersUtilTest {
    @Test
    void validatePrimerNumbersInRange(){
        List<Integer> primerNumbers =
                PrimeNumbersUtil.getPrimeNumbersInRange(10,30);
        List<Integer> primerNumbersExpected = List.of(11, 13, 17, 19, 23, 29);

        assertEquals(primerNumbersExpected, primerNumbers);
    }

    @Test
    void validatePrimerNumbersIncludeLimits(){
        List<Integer> primerNumbers =
                PrimeNumbersUtil.getPrimeNumbersInRange(11,29);
        List<Integer> primerNumbersExpected = List.of(11, 13, 17, 19, 23, 29);

        assertEquals(primerNumbersExpected, primerNumbers);
    }

    @Test
    void shouldThrowExceptionNegativeLowerLimit(){
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class ,
                () ->  PrimeNumbersUtil.getPrimeNumbersInRange(-1,29)
        );

        assertEquals("lowerLimit < 0", ex.getMessage());
    }
}