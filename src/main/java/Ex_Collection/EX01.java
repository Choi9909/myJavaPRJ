package Ex_Collection;

import java.util.Scanner;

public class EX01 {
    public static void main(String[]args){
        int a,b,c,d;
        int result;

        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();
        System.out.print("세번째 계산할 값을 입력하세요 ==>");
        c = s.nextInt();
        System.out.print("네번째 계산할 값을 입력하세요 ==>");
        d = s.nextInt();

        result = a+b+c+d;
        System.out.printf("%d + %d + %d +%d = %d\n", a,b,c,d,result);

    }
}

