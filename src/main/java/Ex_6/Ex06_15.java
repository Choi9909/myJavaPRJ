package Ex_6;

public class Ex06_15 {
    public static void main(String[]args){
        for(int i=1; i < 10 ; i++){
            for(int k=2; k < 10; k++){
                System.out.printf(" %3d X %d = %2d",k, i, (k*i)); /*%3d는 3칸 띄우고 %d의 값을 출력 따라서 3칸 띄우고 k값 입력*/
            }System.out.printf("\n");/*질문) 공백과의 차이점?*/
        }
    }

}
