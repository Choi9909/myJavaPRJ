package The_Essence_Of_Java.ch6;

public class Card {
    String kind;
    int number;
    static int width = 100; // static이 붙으면 클래스 변수
                            // 클래스 변수는 모든 인스턴스에 동일하게 적용되는 변수 이므로 값을 정해둔다
    static int height = 200;// 따라서 클래스변수(static 변수)는 객체 생성 없이 '클래스이름.클래스변수'로 직접 사용 가능하다
}
