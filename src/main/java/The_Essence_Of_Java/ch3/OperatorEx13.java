package The_Essence_Of_Java.ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
        // char c2 = c1 + 1;      // 라인 6 : 컴파일 에러 발생!!!
        // char c2 =(char) (c1 + 1);      // 라인 6 : 에러 해결
        char c2 = 'a'+1;            // 라인 8 : 컴파일 에러 없음

        System.out.println(c2);
    }
}
