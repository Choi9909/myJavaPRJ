package The_Essence_Of_Java;

import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가

public class ArrayEx9 {

   /* for(i = 0; i < arr.length ; i++){     배열을 연속적인 범위의 임의의 값으로 채우는 것은 다음과 같이 random()만 사용하면 된다
        arr[i] = (int)(Math.random () * 5); // 0~4 범위의 임의의 값을 저장
    } */
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11 }; // 불연속적인 값들로 구성된 배열
        int[] arr = new int[10];

        for(int i=0; i < arr.length ; i++){
            int tmp = (int)(Math.random() * code.length);
            arr[i] = code[tmp];
        }//end of for
        System.out.println(Arrays.toString(arr));
    }//end of main
}//end of class
