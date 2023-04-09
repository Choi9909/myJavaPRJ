package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
//        num [0] = sc.nextInt();
//        num [1] = sc.nextInt();
//        num [2] = sc.nextInt();
//        num [3] = sc.nextInt(); 처음에 반복문을 사용안하고 그냥 변수 선언하듯이 하나하나 대입했음
//        num [4] = sc.nextInt();

        for (int i = 0; i < num.length; i++) //2320110211 최강현
            num[i] = sc.nextInt();

        for (int i = 0; i < num.length - 1; i++) { // 5개의 숫자를 비교해서 정렬하려면 4번 실행해야하므로 조건식을 num.length -1 로 작성함
            for (int j = 0; j < num.length - 1 - i; j++) {
                /* 첫 반복에서 5번째 자리에 가장 큰수를 나열하려면 4번 비교
                   두번째 반복에서 4번째 자리에 다음 큰수를 나열하려면 3번 비교해야함
                   그러므로 for j문의 조건식이 num.length-1-i*/
                if (num[j] > num[j + 1]) {    //j번째 수가 j+1보다 클때
                    int tmp = 0;                   //변수 tmp를 생성
                    tmp = num[j];                 // tmp에 num[j]를 옮긴다
                    num[j] = num[j + 1];         // num[j]에 num[j+1]을 옮긴다
                    num[j + 1] = tmp;           // num[j+1]에 tmp값을 옮긴다
                } // if식을 거치면 인접 두수를 비교해 작은 수가 앞으로 온다
            }// end of for j
        }// end of for i
        System.out.println(Arrays.toString(num));
    }//end of main
}//end of class
