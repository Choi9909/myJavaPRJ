package The_Essence_Of_Java.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        // 클래스매서드 호추. 인스턴스 생성없이 호출 가능

        System.out.println(Mymath2.add(200L, 100L));
        System.out.println(Mymath2.subtract(200L, 100L));
        System.out.println(Mymath2.multiply(200L, 100L));
        System.out.println(Mymath2.divide(200.0, 100.0));

        Mymath2 mm = new Mymath2(); // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스메소드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

    }
}
