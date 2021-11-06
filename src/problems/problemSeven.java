package problems;

public class problemSeven {
    public static void main(String[] args) {
        int result = primeNumber(6);
        System.out.println(result);

        result = primeNumber(10_001);
        System.out.println(result);
    }

    public static int primeNumber(int primePosition) {
        int result = 0;
        int count = 0;

        for (int i = 1; count < primePosition; i++) {
            if (isPrime(i)) {
                count++;
            }
            result = i;

        }

        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
