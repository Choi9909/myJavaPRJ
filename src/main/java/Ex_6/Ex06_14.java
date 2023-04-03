package Ex_6;

public class Ex06_14 {
    public static void main(String[]args){
        for(int i = 2; i < 10; i++ ){
            System.out.printf("## 제 %d 단 ##\n", i);
            for(int k = 1 ; k < 10; k++){
                System.out.printf("%d X %d = %d\n", i, k, (i * k));
            }
        }
    }
}
