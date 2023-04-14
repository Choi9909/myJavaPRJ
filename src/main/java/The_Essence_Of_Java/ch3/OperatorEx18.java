package The_Essence_Of_Java.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        //double shortPi = Math.round(pi); 소수점 첫째자리에서 반올림 갈겨버림
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }
}
