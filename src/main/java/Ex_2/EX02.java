package Ex_2;

import java.util.Scanner;

public class EX02 {
    public static void main(String[]args){
        int a,b,c;
        int result;

        System.out.printf("첫번째 계산할 값을 입력하세요==>");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.printf("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈==>");
        b = s.nextInt();
        System.out.printf("두번째 계산할 값을 입력하세요==>");
        c = s.nextInt();

        if(b==1) {
            result = a+c;
            System.out.printf("%d +%d =%d", a,c,result);
        } else if (b==2) {
            result = a-c;
            System.out.printf("%d -%d =%d",a,c,result);
        } else if (b==3) {
            result = a*c;
            System.out.printf("%d * %d = %d",a,c,result);
        } else if (b==4) {
            result = a / c;
            System.out.printf("%d / %d =%d ",a,c,result);
        }else{
            System.out.printf("1~4의 값을 입력해주세요 다시 실행해주세요 ");
        }
    }
}
