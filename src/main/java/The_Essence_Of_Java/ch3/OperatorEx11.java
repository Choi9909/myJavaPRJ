package The_Essence_Of_Java.ch3;

public class OperatorEx11 {
    static public void main(String args []){
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, d - a); // 'd' - 'a' = 3
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero); // 'd' - 'a' = 3
        System.out.printf("'%c'=%d%n", a, (int)a);
        System.out.printf("'%c'=%d%n", d, (int)d);
        System.out.printf("'%c'=%d%n", zero, (int)zero);
        System.out.printf("'%c'=%d%n", two, (int)two);

    }
}
