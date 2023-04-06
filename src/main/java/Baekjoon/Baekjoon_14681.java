package Baekjoon;

import java.util.Scanner;

public class Baekjoon_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a,b;
        a = sc.nextLong();
        b = sc.nextLong();

        if(a>0){
            if(b>0){
                System.out.print(1);
            }else{
                System.out.print(4);

            }
        } else if (b > 0) {
            System.out.print(2);
        }else{
            System.out.print(3);
        }
    }
}
