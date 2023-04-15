package The_Essence_Of_Java.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x=%2d, 10 < x && < 20 = %b%n", x, 10 < x && x < 20);

        x = 6;
        System.out.printf("x = %2d, x %% 2==0 || x %% 3==0 && x %% 6 != 0 = %b%n", x, x % 2 == 0 || x % 3 == 0 && x %6 !=0);
        // x % 2 == 0 || x % 3 == 0 && x %6 !=0 에서 연산자 우선순위가 &&가 ||보다 높기 때문에
        // AND 연산자를 먼저 처리한 후 OR 연산자를 처리하기 때문에 위의 값은 참이 나온다.

        System.out.printf("x = %2d, (x %% 2==0 || x %% 3==0) && x %% 6 != 0 = %b%n", x, (x % 2 == 0 || x % 3 == 0) && x %6 !=0);

        ch = '1';
        System.out.printf("ch = '%c', '0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <='9');

        ch = 'a';
        System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <='z');

        ch = 'A';
        System.out.printf("ch = '%c', 'A' <= ch && ch <= 'Z = %b%n", ch, 'A' <= ch && ch <='Z');

        ch = 'q';
        System.out.printf("ch = '%c', ch == 'q' || ch == 'Q' =%b%n", ch, ch == 'q' || ch == 'Q');
    }
}
