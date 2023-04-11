package Quiz;

public class ex0405 {
    public static void main(String[] args) {
        for (int dan = 2, k = 1; dan < 10; k++) {
            System.out.printf("%3d X %d = %2d ", dan, k, (dan * k));
            if (k > 8) {
                dan++;
                k = 0;
                System.out.println();
            }
        }
    }
}