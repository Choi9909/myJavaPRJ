package The_Essence_Of_Java.ch2;

public class CastingEx {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d; // 실수형에서 정수형으로 형변환하면 소수점 이하의 값은 버림처리

        System.out.println("score = " + score);
        System.out.println("d="+d);
    }
}
