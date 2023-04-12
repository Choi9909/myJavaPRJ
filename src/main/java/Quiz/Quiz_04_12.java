package Quiz;

import java.util.Scanner;

public class Quiz_04_12 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 길이가 5개인 배열을 선언
        int max, min; // 최댓값과 최솟값을 담을 변수를 선언
        int sum = 0; // 평균을 구하기 위한 합을 답을 변수를 선언
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) // 배열의 길이만큼 반복
            arr[i] = sc.nextInt(); // 배열의 값에 입력값을 받음

        max = arr[0]; // 최댓값을 배열의 첫번째 값으로 초기화
        min = arr[0]; // 최솟값을 배열의 첫번째 값으로 초기화

        for (int i = 0; i < arr.length; i++) { // 배열의 길이만큼 반복
            if (max < arr[i]) { // 최댓값이 배열[i]보다 작다면
                max = arr[i]; //최댓값을 해당 배열이랑 바꾼다
            }
            if (min > arr[i]) { // 최솟값이 배열[i]보다 크면
                min = arr[i]; // 최솟값을 해당 배열이랑 바꾼다
            }
            sum += arr[i]; // sum = sum + arr[i];
        }
        System.out.printf("가장 큰 값 : %d / 가장 작은 값 : %d / 평균 값 : %f ", max, min, (float) sum / arr.length); // 평균값은 소수점이 유의미하므로 실수형으로 형전환함
    }
}