package Ex_6;

import java.util.Scanner;

public class Ex06_11 {
    public static void main(String[] args) {
        int hap = 0;
        Scanner s = new Scanner(System.in);
        System.out.printf("시작값 입력 : ");
        int num1 = s.nextInt();
        System.out.printf(" 끝값 입력 : ");
        int num2 = s.nextInt();
        System.out.printf("증가값 입력 : ");
        int num3 = s.nextInt();

        for (int i = num1; i <= num2; i += num3) {
            hap += i;
        }
        System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n", num1, num2, num3, hap);
    }
}
