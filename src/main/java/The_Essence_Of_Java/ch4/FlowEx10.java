package The_Essence_Of_Java.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요.(1~100) ==> ");

        Scanner sc = new Scanner(System.in);
       // String tmp = sc.nextLine(); 왜 굳이 문자열 변수를 또 선언한거지?
        //score = Integer.parseInt(tmp); 왜 이렇게 한거지?
        score = sc.nextInt();

        switch (score / 10){
            case 10 :
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            default :
                grade = 'F';

        } // end of switch
        System.out.println("당신의 학점은" + grade + "입니다.");
    }// end of main
}
