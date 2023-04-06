package Baekjoon;

import java.util.Scanner;

public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a == 23){
            if((b+c)<60){
                System.out.print(a + " " + (b+c));
            }else{
                System.out.print(0 + " " + ((b+c)-60));
            }
        } else {
            if((b+c)<60){
                System.out.print(a + " " + (b+c));
            }else{
                System.out.print((a+1) + " " + ((b+c)-60));
            }
        }
    }
}
