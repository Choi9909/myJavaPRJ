package Ex_6;

import java.util.Scanner;

public class Ex06_12 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.printf("몇단 ? : ");
        int num = s.nextInt();
        for(int i = 9; i > 0 ; i--){
            int result = 0;
                    result = num * i;
            System.out.printf("%d X %d = %d\n", num, i ,result);
        }
    }
}
