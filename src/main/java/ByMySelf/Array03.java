package ByMySelf;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        int[] iArr = {100 ,95, 80, 70, 60};
        for(int i = 0; i < iArr.length ; i++){
            System.out.println(iArr[i]);
        }
        System.out.println(Arrays.toString(iArr)); //배열값을 모두 출력해주는 메소드
    }
}
