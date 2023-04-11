package The_Essence_Of_Java.ch2;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A'; // char ch = 65;
        int code = (int)ch; // ch에 저장된 값을 int 타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        // int in = 65;
        //char ch = (char)in;

        //System.out.printf("%d(%#X)=%C%n", in, in, ch);


        char hch = '가'; // char hch = 0XAC00;
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
