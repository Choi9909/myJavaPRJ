package The_Essence_Of_Java.ch4;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum =0;

        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for(int tmp : arr){ // 향상된 for문 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용가능
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);
    } // end of main
}
