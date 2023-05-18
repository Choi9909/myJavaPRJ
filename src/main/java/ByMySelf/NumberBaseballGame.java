package ByMySelf;

import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("플레이어1의 숫자를 입력하세요.");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        Player1 player1 = new Player1(num1, num2, num3, num4);

        System.out.println("플레이어2의 숫자를 입력하세요.");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        Player2 player2 = new Player2(num1, num2, num3, num4);

        System.out.println("플레이어1님 플레이어2의 숫자를 예상해보세요.");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        player1.setPlayer2Guess(num1, num2, num3, num4);

        int result = NumberComparator.compareNumber(player1.setPlayer2Guess(), player2 );

        System.out.println("플레이어2님, 플레이어1의 숫자를 예상해보세요.");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        player2.setPlayer1Guess(num1, num2, num3, num4);
    }
}
