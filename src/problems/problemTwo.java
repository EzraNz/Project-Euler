package problems;

public class problemTwo {
    public static void main(String[] args) {
        int result = fibonacciNumber();
        System.out.println(result);
    }

    public static int fibonacciNumber() {
        int result;
        int a = 1;
        int b = 1;

        // c = a + b
        // a = b
        // b = c
        int sum = 0;

        do {
            result = a + b;
            a = b;
            b = result;

            if (result % 2 == 0) {
                sum += result;
            }
        } while (result <= 4_000_000);

        return sum;
    }
}
