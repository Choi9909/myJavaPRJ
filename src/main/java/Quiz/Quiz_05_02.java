package Quiz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Quiz_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        System.out.println(list);
    }
}
