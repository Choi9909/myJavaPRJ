package Ex_Collection;

import java.util.Scanner;

public class EX09 {
    public static void main(String[]args){
        int a, b, c, d, e, f;
        System.out.printf("## 교환할 돈은 ? ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = a / 500;
        f = a % 500;
        c = f / 100;  /*2회차*/
        f = f % 100;
        d = f / 50;
        f = f % 50;
        e = f / 10;
        f = f % 10;


        /*b = a / 500;
        c = (a - (b*500)) / 100;
        d = (a - (b*500)-(c*100)) / 50;     1회차
        e = (a - (b*500)-(c*100)-(d*50)) / 10;
        f = (a - (b*500)-(c*100)-(d*50)-(e*10)) / 1;*/
        System.out.printf("오백원짜리 ==> %d 개\n",b);
        System.out.printf("백원짜리 ==> %d 개\n", c);
        System.out.printf("오십원짜리 ==> %d 개\n", d);
        System.out.printf("십원짜리 ==> %d 개\n", e);
        System.out.printf("바꾸지 못한 잔돈 ==> %d 개\n", f);
    }
}
