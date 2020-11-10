package pl.sda;

public class PrimeDigitRangeChecker {

    public boolean check(Integer a, Integer b) {
        if (a > b) {
            throw new IllegalStateException();
        }
        if (b < 2) {
            return false;
        }

        for (int i = Math.max(a, 2); i <= b; i++) {
            if (isPrime(i)) {
                return true;
            }
        }

        return false;
    }

    public boolean isPrime(Integer x) {
        int counter = 1;
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                counter++;
            }
        }
        return counter == 2 ? true : false;
    }
}
