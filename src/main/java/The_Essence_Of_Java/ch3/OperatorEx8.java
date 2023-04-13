package The_Essence_Of_Java.ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000; // 1,000,000 1백만
        int b = 2_000_000; // 2,000,000 2백만

        long c = a * b; // a * b = 2,000,000,000,000 ?
                        // int 타입과 int 타입 연산의 연산결과는 int 타입이므로
                        // 결과 값은 이미 int 타입의 값(-1454759936)으로 저장되었으므로 long형으로 자동형변환되더라도 값의 변화X
        System.out.println(c);
    }
}
