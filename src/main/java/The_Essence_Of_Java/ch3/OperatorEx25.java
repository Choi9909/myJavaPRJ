package The_Essence_Of_Java.ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요. >");

        String input = scanner.nextLine();
        ch = input.charAt(0); // 입력값의 문자열에서 첫번째 값을 추출해서 ch에 대입함.
                              // 그래서 입력할때 공백을 넣으면 안나옴.

        if ('0' <= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }// if1

        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }// end of if2
    }// end of main
}
