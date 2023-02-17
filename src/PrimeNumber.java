import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = s.nextInt();
        boolean[] prime = new boolean[num];
        Arrays.fill(prime, true);
        int i;
        // Sieve of Eratosthenes
        if (num > 1) {
            prime[1] = false;

            for(i = 2; i * i < num; ++i) {
                for(int j = i * i; j < num; j += i) {
                    if (prime[i]) {
                        prime[j] = false;
                    }
                }
            }
        }
        //array output
        System.out.println("Prime Number:");
        for(i = 1; i < num; ++i) {
            if (prime[i]) {
                System.out.printf("%d \t", i);
            }
        }

    }
}
