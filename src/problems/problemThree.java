package problems;

public class problemThree {
    public static void main(String[] args) {
        long result = primeFactors(13195);
        System.out.println(result);

        result = primeFactors(100109100129100151L);
        System.out.println(result);


    }

    public static long primeFactors(long startingNumber) {
        int count = 3;
        boolean flag = false;

        while (startingNumber != 1) {
            for (int i = 2; i <= count / 2; ++i) {
                if (count % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                if (startingNumber % count == 0) {
                    startingNumber /= count;
                }
            }

            if (startingNumber != 1) {
                count++;
                flag = false;
            }
        }

        return count;
    }
}
