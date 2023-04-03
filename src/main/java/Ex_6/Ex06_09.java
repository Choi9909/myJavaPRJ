package Ex_6;

public class Ex06_09 {
    public static void main(String[]args){
        int hap = 0;
        for(int i = 3; i<100;i+=3){
            hap += i;
        }
        System.out.printf("1에서 100까지의 3의 배수의 합 : %d \n", hap);
    }
}
