package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_04_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt(); // 배열에 입력값을 넣음
        }

        for(int i = 0 ; i < arr.length - 1 ; i++){ // arr[0] ~ arr[3]을 다음 배열과 비교함
            for (int j = i + 1 ; j < arr.length ; j++){ // 비교할 배열
                if(arr[i] < arr[j]){ // 배열[i]가 다음 배열보다 작다면
                    int temp = 0; // 배열[j]를 담을 변수 temp를 선언
                    temp = arr[j]; // temp에 배열[j]값을 대입
                    arr[j] = arr[i]; // 배열[j]값에 배열[i]값을 대입
                    arr[i] = temp; // 배열[i]값에 temp값을 대입
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
