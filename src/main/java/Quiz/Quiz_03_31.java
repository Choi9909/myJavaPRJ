package Quiz;

public class Quiz_03_31 {
    public static void main(String[]args){
        for(int i = 0, k = 1 ; i < 6 ; i++){
            System.out.printf("*"); /*기본 값을 별 출력으로 잡음*/
            if(i > k-2){ /*이 조건이 참이라면 다음줄로 넘어감 따라서 N번째 줄에서 N개의 별을 찍고 참을 만족해야함*/
                k++;    /*그럴려면 첫줄은 참 두번째 줄은 거짓참, 세번째 줄은 거짓, 거짓, 참이 나와야함*/
                i = -1; /**/
                System.out.println();
            }
        }
    }
}
