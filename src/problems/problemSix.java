package problems;

public class problemSix {
    public static void main(String[] args) {
        int result = sumSquareDifference(10);
        System.out.println(result);

        result = sumSquareDifference(100);
        System.out.println(result);
    }

    public static int sumSquareDifference(int number) {
        int result;
        int sum = 0;
        int square = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
            square += i*i;
        }

        result = (sum*sum) - square;

        return result;
    }
}
