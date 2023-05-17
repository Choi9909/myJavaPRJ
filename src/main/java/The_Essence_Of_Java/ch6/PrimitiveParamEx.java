package The_Essence_Of_Java.ch6;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int y) { // 기본형 매개변수
        y = 1000;
        System.out.println("change() : x = " + y);
    }
}
