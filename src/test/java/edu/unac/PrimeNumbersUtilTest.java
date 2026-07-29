package edu.unac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PrimeNumbersUtilTest {
    @Test
    void validatePrimerNumbersInRange(){
        List<Integer> primerNumbers =
                PrimeNumbersUtil.getPrimeNumbersInRange(10,30);
        List<Integer> primerNumbersExpected = List.of(11, 13, 17, 19, 23, 29);

        Assertions.assertEquals(primerNumbersExpected, primerNumbers);
    }

    @Test
    void validatePrimerNumbersIncludeLimits(){
        List<Integer> primerNumbers =
                PrimeNumbersUtil.getPrimeNumbersInRange(11,29);
        List<Integer> primerNumbersExpected = List.of(11, 13, 17, 19, 23, 29);

        Assertions.assertEquals(primerNumbersExpected, primerNumbers);
    }
}