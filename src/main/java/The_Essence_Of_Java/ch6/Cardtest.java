package The_Essence_Of_Java.ch6;

public class Cardtest {
   // 이 예제를 통해서 클래스 변수와 인스턴스 변수의 사용법과 차이점을 배움
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        Card.width = 50;
        Card.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        // 인스턴스 변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 클래스 변수는 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다
        // 따라서 위처럼 Card.width와 같이 '클래스이름.클래스변수'의 형태로 하는것이 좋다
        // 참조 변수 c1, c2를 통해서도 클래스 변수를 사용할 수 있지만 이렇게 하면 클래스 변수를 인스턴스 변수로 오해하기 쉽기 때문이다

    }
}
