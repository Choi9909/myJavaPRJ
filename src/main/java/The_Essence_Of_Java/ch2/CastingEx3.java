package The_Essence_Of_Java.ch2;

public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f; // 같은 값을 저장해도 float와 double의 정밀도 차이 때문에 서로 다른값이 저장된다.
                                // 저장할때 이미 값이 달라졌기 때문에, 형변환을 해도 값이 같아지지 않는다.

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d = %20.18f\n", d);
        System.out.printf("d2 = %20.18f\n", d2);
    }
}
