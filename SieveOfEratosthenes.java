import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 10; // Start with a small range
        long duration = 10 * 501; // 10 seconds in milliseconds
        long startTime = System.currentTimeMillis();

        List<Integer> allPrimes = new ArrayList<>();

        while (System.currentTimeMillis() - startTime < duration) {
            List<Integer> primes = sieve(n);
            allPrimes.addAll(primes);
            n *= 2; // Double the range for the next iteration
        }

        System.out.println("Primes generated in 10 seconds: " + allPrimes);
    }

    // Sieve of Eratosthenes
    public static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
