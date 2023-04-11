package Quiz;

public class Quiz_04_05 {
    public static void main(String[]args){
        int a, b;
        for (a = 1, b =2 ; b < 10 ; a++){
            if(a<10){
                System.out.printf("%3d X %d = %2d " ,b,a,(a*b));

            }else{
                System.out.println();
                a = 0;
                b++;
            }
        }/*heartbreak anniversary*/
    }
}
