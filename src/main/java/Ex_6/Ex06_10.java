package Ex_6;

import java.util.Scanner;

public class Ex06_10 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int hap=0;
        System.out.printf("값 입력 : ");
        int num = s.nextInt();

        for(int i = 1; i < num + 1 ;i++){
            hap += i;
        }
        System.out.printf("1에서 %d까지의 합 :%d\n",num, hap);
    }
}
