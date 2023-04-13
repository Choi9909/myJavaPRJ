package The_Essence_Of_Java.ch3;

public class OperatorEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %d = %.1f%n", a, b, (float)a/b);
        System.out.println(3/0.0);

    }
}
