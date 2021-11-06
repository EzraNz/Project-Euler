package problems;

public class problemFive {
    public static void main(String[] args) {
        int result = smallestMultiple();
        System.out.println(result);
    }

    public static int smallestMultiple() {
        int result = 0;
        boolean flag = true;
        final int MAX_VALUE = 20;

        for (int i = 1; flag; i++) {
            for (int j = 1; j <= MAX_VALUE; j++) {
                if (i % j != 0) {
                    break;
                }

                if (j == MAX_VALUE) {
                    flag = false;
                    break;
                }
            }
            result = i;
        }
        return result;
    }
}
