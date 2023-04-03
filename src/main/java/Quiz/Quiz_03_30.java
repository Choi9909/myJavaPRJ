package Quiz;

public class Quiz_03_30 {
    public static void main(String[] args) {
        int k;
        int i;
        for (i = 2, k = 1; i < 10; k++) {
            System.out.printf("\n");
            if (k < 10) {

                System.out.printf("%d X %d = %2d ", i, k, (i * k));
            }else{
                i++;
                k = 0;
            }
        }
    }
}