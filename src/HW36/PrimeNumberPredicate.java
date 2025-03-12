package HW36;

import java.util.function.Predicate;

public class PrimeNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}
