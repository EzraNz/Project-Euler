package problems;

public class problemTwelve {
    public static void main(String[] args) {
        long result = triangleNumbers(5);
        System.out.println(result);

        result = triangleNumbers(500);
        System.out.println(result);
    }

    public static long triangleNumbers(long divisor) {
        long result = 0;
        boolean flag = true;

        for (int i = 0; flag; i++) {
            long counter = 0;
            int triangleNumber = 0;

            for (int j = 0; j <= i; j++) {
                triangleNumber += j;
            }

            for (int k = 1; k <= triangleNumber; k++) {
                if (triangleNumber % k == 0) {
                    counter++;
                }
            }

            if (counter > divisor) {
                result = triangleNumber;
                flag = false;
            }
        }

        return result;
    }
}