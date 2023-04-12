package The_Essence_Of_Java.ch2;

public class FloatToBin {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%#X%n", i); // 16진수로 출력
    }// end of main
}
