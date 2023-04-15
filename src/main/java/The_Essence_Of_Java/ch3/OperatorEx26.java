package The_Essence_Of_Java.ch3;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // 논리 연산자는 효율적인 연산을 한다 라는 특징을 가지고 있다
        // OR 연산자의 경우 두 피연산자 중 어느 한 쪽만 참이면
        // 전체 연산 결과가 참 이므로 좌측 피연산자가 참이라면 우측 피연산자의 값은 평가하지 않는다.
        System.out.printf("a = %d, b=%d%n", a, b);                          // a = 5 b = 0
        System.out.printf("a != 0 || ++b != 0 = %b%n", a!=0 || ++b != 0);   // 좌측 피 연산자가 참이므로 우측 피연산자는 처리하지 않는다.
        System.out.printf("a = %d, b=%d%n", a, b);                          // 위에서 우측 피연산자를 처리하지 않으므로 그대로 b의 값은 0이다.
        System.out.printf("a == 0 && ++b != 0 = %b%n", a==0 && ++b != 0);   // 좌측 피 연산자가 거짓이므로 우측 피연산자는 처리하지 않는다.
        System.out.printf("a = %d, b=%d%n", a, b);                          // 위에서 우측 피연산자를 처리하지 않으므로 그대로 b의 값은 0이다.
            }
}
