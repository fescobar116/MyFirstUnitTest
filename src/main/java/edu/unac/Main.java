package edu.unac;

import java.util.List;

public class Main {
    static void main() {
        validatePrimerNumbersInRange();
        validatePrimerNumbersIncludeLimits();
        validateLowerLimitNegative();
    }

    private static void validatePrimerNumbersInRange(){
        List<Integer> primerNumbers =
                PrimeNumbersUtil.getPrimeNumbersInRange(10,30);
        List<Integer> primerNumbersExpected = List.of(11, 13, 17, 19, 23, 29);

        assertEquals(primerNumbersExpected, primerNumbers);
    }

    private static void validatePrimerNumbersIncludeLimits(){
        List<Integer> primerNumbers =
                PrimeNumbersUtil.getPrimeNumbersInRange(11,29);
        List<Integer> primerNumbersExpected = List.of(11, 13, 17, 19, 23, 29);

        assertEquals(primerNumbersExpected, primerNumbers);
    }

    private static void assertEquals(List<Integer> expected, List<Integer> actual){
        if(actual.equals(expected)) {
            System.out.println("Nice!!!!!!");
        } else {
            throw new RuntimeException("ERROR - Expected :" + expected + ", actual: " + actual );
        }
    }

    private static void validateLowerLimitNegative(){
        boolean exceptionThrown = false;
        try {
            PrimeNumbersUtil.getPrimeNumbersInRange(-1,29);
        } catch (Exception e) {
            exceptionThrown = true;
        }

        if(exceptionThrown) {
            System.out.println("Nice!!!!!!");
        } else {
            throw new RuntimeException("ERROR - Exception required");
        }
    }
}
