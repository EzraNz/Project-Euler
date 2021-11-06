package problems;

public class problemOne {
    public static void main(String[] args) {
        int result = sumOfMultiples(1000);
        System.out.println(result);
    }

    public static int sumOfMultiples(int endNumber) {
        int finalNumber = 0;
        int count = 1;

        while (count < endNumber) {
            if (count % 3 == 0 || count % 5 == 0) {
                finalNumber += count;
            }
            System.out.println(count);
            count++;
        }
        return finalNumber;
    }
}
