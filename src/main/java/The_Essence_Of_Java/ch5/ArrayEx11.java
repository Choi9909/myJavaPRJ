package The_Essence_Of_Java.ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i < numArr.length ; i++){
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }//end of for1
        System.out.println();
        for(int i=0; i < numArr.length; i++){
            counter[numArr[i]]++; // numArr[i]의 값이 그 숫자의 counter[]을 하나 키워서 숫자의 개수를 알수있다.
        }// end of for2
        for(int i=0; i < numArr.length; i++){
            System.out.println(i +"의 개수 : " + counter[i]  );
        }// end of for3
    }//end of main
}// end of class
