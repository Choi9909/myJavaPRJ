package Quiz;

import java.util.HashSet;
import java.util.Scanner;

public class Quiz_05_03_1 {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            set.add(in.nextInt());
        }
        System.out.print(set);
    }
}
