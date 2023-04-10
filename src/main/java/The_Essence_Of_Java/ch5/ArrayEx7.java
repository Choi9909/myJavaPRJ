package The_Essence_Of_Java.ch5;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i < numArr.length ; i++){
            numArr[i] = i;
            System.out.print(numArr[i]);
        }//end of for
        System.out.println();

        //for(int i=0; i < 100; i++){
        for(int i=0; i < numArr.length; i++){
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }//end of for
    }//end of main
}//end of class
