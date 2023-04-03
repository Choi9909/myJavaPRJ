package Ex_5;

import java.util.Scanner;

public class Ex05_08 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("점수를 입력하세요 : ");
        a = s.nextInt();

        if (a >= 90)
            System.out.printf("A"); /*else if 절은 같은 변수에 대해서 조건만 바뀔때 사용*/
        else if (a >= 80)
            System.out.printf("B");/*다른 변수 ex) b,c,d가 생기면 중첩 if문을 사용해야함*/
        else if (a >= 70)
            System.out.printf("C");/*else if = switch case절과 같다*/
        else if (a >= 60)
            System.out.printf("D");
        else System.out.printf("F");

                    System.out.printf(" 학점 입니다.\n");
    }
}
