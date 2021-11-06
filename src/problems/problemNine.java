package problems;

public class problemNine {
    public static void main(String[] args) {
        int result = pythagoreanTriplet(12);
        System.out.println(result);

        result = pythagoreanTriplet(1000);
        System.out.println(result);
    }

    public static int pythagoreanTriplet(int solution) {
        int result;
        boolean flag = true;

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; flag && i < solution; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (((k + j + i) == solution) && ((i * i) == (j * j) + (k * k))) {
                        c = i;
                        b = j;
                        a = k;
                        flag = false;
                        break;
                    }
                }
            }
        }

        result = a * b * c;
        return result;
    }
}
