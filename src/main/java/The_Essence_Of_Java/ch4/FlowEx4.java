package The_Essence_Of_Java.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;                          // 점수를 저장하기 위한 변수
        char grade = ' ';                       // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

        System.out.print("점수를 입력하세요. ==> ");;
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();                   // 화면을 통해 입력받은 숫자를 score에 저장

        if(score >= 90) {                       // score가 90점 이상이면 A학점
            grade='A';
        } else if (score >= 80) {               // score가 80점 이상이면 B학점
            grade='B';
        } else if (score >= 70) {               // score가 70점 이상이면 C학점
            grade='C';
        } else if (score >= 60) {               // score가 60점 이상이면 D학점
            grade='D';
        }else {                                 // 나머지는 F학점
            grade='F';
        }
        System.out.println("당신의 학점은" + grade + "입니다.");
    }
}
