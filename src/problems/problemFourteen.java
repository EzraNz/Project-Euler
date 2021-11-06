package problems;

public class problemFourteen {
    public static void main(String[] args) {
        long result = collatzSequence(1_000_000);
        System.out.println(result);
    }

    public static long collatzSequence(int number) {
        long result = 0;
        long rand;
        int counter = 0;
        int max = 0;

        for (int i = number; i > 1; i--) {
            rand = i;
            while (rand != 1) {
                if (rand % 2 == 0) {
                    rand = rand / 2;
                } else {
                    rand = 3 * rand + 1;
                }
                counter++;
            }

            if (counter > max) {
                max = counter;
                result = i;
            }
            counter = 0;
        }

        return result;
    }
}
