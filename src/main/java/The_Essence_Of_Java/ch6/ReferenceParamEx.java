package The_Essence_Of_Java.ch6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

    }
    static void change (Data a){ // 참조형 매개변수
        a.x = 1000; // d가 여러개니까 이해가 안되서 변수를 v로 바꿈
        System.out.println("change() : x = " + a.x);
    }
}
