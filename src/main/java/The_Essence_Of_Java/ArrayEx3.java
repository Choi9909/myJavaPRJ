package The_Essence_Of_Java;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 배열 이름이 arr이고 길이가 5인 배열을 선언 및 생성

        for(int i = 0; i < arr.length; i++)
            arr[i] = i+1; // arr 배열에 1~5 값을 초기화
        System.out.println("[변경전]");
        System.out.println("arr.length : " + arr.length);
        for(int i=0; i< arr.length; i++)
            System.out.println("arr["+i+"] : " + arr[i]); // 출력값: arr[i] = i

        int[] tmp = new int[arr.length*2]; //이름이 tmp이고 길이가 arr.length의 2배인 배열 선언 및 생성

        for(int i = 0; i<arr.length; i++) //배열 tmp에 배열 arr의 값을 복사
            tmp[i] = arr[i];

        arr=tmp; // tmp의 매개변수 값을 arr의 복사 근데 왜?? tmp의 값을 arr의 복사할까 반대여야하는거 아닌가?

        System.out.println("[변경후]");
        System.out.println("arr.length :" + arr.length);
        for(int i = 0; i<arr.length; i++)
            System.out.println("arr["+i+"] :"+arr[i]);
    }
}
