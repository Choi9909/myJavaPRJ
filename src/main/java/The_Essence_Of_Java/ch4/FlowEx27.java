package The_Essence_Of_Java.ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true; // while문의 조건식을 사용될 변수
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요.(끝나려면 0을 입력)");

        while (flag){ // flag의 값이 true
            System.out.print(">>");

            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0){
                sum += num; // num이 0이 아니라면, sum에 더한다.
            }else {
                flag = false; // num이 0이면, flag의 값을 false로 변경.
            }
        } // end of while
        System.out.println("합계:"+sum);
    }
}
