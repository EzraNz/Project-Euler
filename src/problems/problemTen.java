package problems;

public class problemTen {
    public static void main(String[] args) {
        long result = sumOfPrimes(10);
        System.out.println(result);

        result = sumOfPrimes(200_000_000);
        System.out.println(result);
    }

    public static long sumOfPrimes(int boundary) {
        long result = 0;

        for (int i = 0; i < boundary; i++) {
            if (problemSeven.isPrime(i)) {
                result += i;
            }
        }
        return result;
    }
}
