package Ex_Collection;

import java.util.Scanner;

public class EX03 {
    public static void main(String[]args){
        int a,b;


        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
                a = s.nextInt();
                System.out.print("+ - * / % ==>");

              System.out.print("두번째 계산할 값을 입력하세요 ==> ");
              b = s.nextInt();
              if(b==0){
                  System.out.println("0으로 나누면 안됩니다.");
              }


    }
}
