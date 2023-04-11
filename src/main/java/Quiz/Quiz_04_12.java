package Quiz;

import java.util.Scanner;

public class Quiz_04_12 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 메모리가 5개인 배열 선언
        int max = 0, min = 0, hap = 0; // 최대값, 최소값 평균을 구하기 위한 합을 담을 변수 3개를 초기화


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) // 배열 5개에 스캔값을 입력할수있는 반복문을 작성
            arr[i] = sc.nextInt();

        //for(int i = 0; i < arr.length ; i++){ // 입력한 숫자 5개의 총 합을 구하기 위한 반복문을 작성
        //hap += arr[i]; // hap = arr[i] + hap
        // }
        //avg = (float)hap /arr.length; // 합 / 배열의 길이로 평균값을 구함

        min = arr[0]; // 최솟값을 배열의 첫번째으로 초기화
        max = arr[0]; // 최대값을 배열의 첫번째 값으로 초기화
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) { // 배열 값이 최소 값보다 작으면
                min = arr[i]; // 최소값과 해당 배열 값을 바꿈
            }
            if (max < arr[i]) { // 배열 값이 최대 값보다 크면
                max = arr[i]; // 최대값과 해당 배열 값을 바꿈
            }
            hap += arr[i];
        }
        System.out.printf("가장 큰 값 : %d / 가장 작은 값 : %d / 평균 값 : %d ", max, min, hap / arr.length); // 값을 출력

    }
}
