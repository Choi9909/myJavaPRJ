package Quiz;

public class Quiz04_05 {
    public static void main(String[] args) {
        int dan = 2, k = 1;
        while (dan < 10) {
            System.out.printf("%3d X %d = %2d", dan, k, (dan * k)); //2320110211 최강현
            k++;
            if(k>9){
                dan++;
                k=1;
                System.out.println();
            }
        }
    }
}