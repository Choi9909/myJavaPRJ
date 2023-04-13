package The_Essence_Of_Java.ch3;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b); // a * b = 300 이지만 byte형의 범위를 넘기 때문에 byte로 형변환하면
                                // 데이터 손실이 발생해 44가 저장된다.
        System.out.println(c);
    }
}
