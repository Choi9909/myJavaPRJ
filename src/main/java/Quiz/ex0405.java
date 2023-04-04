package Quiz;

public class ex0405 {
    public static void main(String[]args){
        for(int i = 2, k = 1 ; i < 10 ; k++){
            System.out.printf("%3d X %d = %2d", i, k, i*k);
            if(k>8){
                k=0;
                i++;
                System.out.println();
            }
        }
    }
}
