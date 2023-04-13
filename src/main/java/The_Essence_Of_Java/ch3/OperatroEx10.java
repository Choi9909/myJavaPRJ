package The_Essence_Of_Java.ch3;

public class OperatroEx10 {
    public static void main(String[] args) {
        int a = 1_000_000;

        int result1 = a * a / a;    // 1,000,000 * 1,000,000 / 1,000,000
        int result2 = a / a * a;    // 1,000,000 / 1,000,000 * 1,000,000

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 연산 처리를 순서대로하면 a * a 에서 오버플로우가 발생하므로
                                                                    // result1에 -727이 저장된다.
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); // 연산 순서대로 처리하면 1 * 1000000
    }
}
