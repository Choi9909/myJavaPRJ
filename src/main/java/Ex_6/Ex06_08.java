package Ex_6;

public class Ex06_08 {
    public static void main(String[]args){
        int hap = 0; /* = 을 안쓰면 메모리에 안올라감*/
        int i;

        for(i = 1; i < 12346; i++){
            hap += i; /*hap = hap + 1; */
        }

        System.out.printf("1에서 12345까지의 합 : %d \n" ,hap);
    }
}
