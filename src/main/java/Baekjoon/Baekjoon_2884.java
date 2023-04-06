package Baekjoon;

import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==0){
            if(b>=45){
                System.out.println(a + " " + (b-45));
            }else{
                System.out.println(23 + " " + (60-(45-b)));
            }
        }else{
            if(b>=45){
                System.out.println(a + " " + (b-45));
            }else{
                System.out.println((a-1) + " " + (60-(45-b)));
            }
        }
    }
}
