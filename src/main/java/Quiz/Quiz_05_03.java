package Quiz;

import java.util.Scanner;
import java.util.TreeSet;

public class Quiz_05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        TreeSet<Integer> set = new TreeSet<Integer>();

        System.out.print("입력값 :");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            set.add(nums[i]);
        }

        System.out.println("저장된 값은 :");

        for (int num : set) {
            System.out.print(num + "," + " ");
        }
    }
}
