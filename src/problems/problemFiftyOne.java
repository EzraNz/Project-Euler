package problems;

public class problemFiftyOne {
    public static void main(String[] args) {
        int count = 0;
        int modulus;
        int newPrime;
        int numberInFamily = 0;

        for (int i = 56994; i > 56992; i--) {
            if (problemSeven.isPrime(i)) {
                for (int j = 1; j < i; j++) {
                    modulus = i % j;

                    if (problemSeven.isPrime(i - j)) {
                        newPrime = i - j;

                        if (modulus == (newPrime % j)) {
                            if (newPrime > 1) {
                                numberInFamily++;
                                String difference = String.valueOf(j);

                                if (containsOtherThanOne(difference)) {
                                    System.out.println("Original Prime: " + i + " New Prime: " + newPrime + " Difference: " + j);

                                }
                            }
                        }

                    }
                }
                count++;
            }
        }

        // for each prime and i till the prime
        // find the modulus of the prime, and I
        // subtract i from the prime
        // if the modulus of the new number is the same as the previous modulus, repeat your steps

        System.out.println();
        System.out.println(count);
    }


    public static long primeReplacements() {
        return 0;
    }

    public static boolean containsOtherThanOne(String string) {
        for (int i = 3; i < 10; i++) {
            String representation = String.valueOf(i);

            if (string.contains(representation)) {
                return false;
            }
        }
        return true;
    }
}
