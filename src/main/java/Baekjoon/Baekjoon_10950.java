package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        for (int i = 1; i < a; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
        }
        System.out.println(b + c);
    }
}