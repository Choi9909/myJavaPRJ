package The_Essence_Of_Java.ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a + b; // 정수의 연산은 기본적으로 int 타입으로 처리하기 때문에 a와 b가 byte 타입이지만 계산결과값은 int 타입이므로
                        // byte 타입으로 형변환 해줘야함 Ex) byte c = (byte)(a+b);
        byte c = (byte)(a+b);
        System.out.println(c);

    }
}
