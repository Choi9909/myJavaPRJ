package ByMySelf;

public class Array02 {
    public static void main(String[] args) {
        // index 범위 : 0~8
        int[] arr = new int[9]; // 길이가 5인 int 배열
        System.out.println("arr.length="+arr.length);

        for(int i =0; i< arr.length; i++){
            System.out.println("arr["+i+"]"+arr[i]);


        }
    }

}
