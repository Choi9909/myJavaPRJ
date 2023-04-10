package The_Essence_Of_Java.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");// "공백"은 띄어쓰기 처리
        System.out.println(" " + 7);
        System.out.println(7 + "");// 그냥 ""은 아무내용없는 빈 문자열 문자열이라는것이 주요
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7); // 연산자 우선순위에 의해 >> 방향으로 계산 그래서 문자열 7 + 7이므로 결과값은 77
    }
}
