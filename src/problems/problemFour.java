package problems;

public class problemFour {
    public static void main(String[] args) {
        int result = palindrome();
        System.out.println(result);
    }

    public static int palindrome() {
        int product;
        int reversed = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;
                int temporaryProduct = product;

                for (; temporaryProduct != 0; temporaryProduct /= 10) {
                    int digit = temporaryProduct % 10;
                    reversed = reversed * 10 + digit;
                }

                if (product == reversed) {
                    if (product > max) {
                        max = product;
                        break;
                    }
                }
                reversed = 0;
            }
        }
        return max;
    }
}
