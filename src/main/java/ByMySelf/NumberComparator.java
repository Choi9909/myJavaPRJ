package ByMySelf;

public class NumberComparator {
    public static int compareNumber(int[] guess, int[] target){
        int strikes = 0;
        int balls = 0;
        for (int i = 0; i < guess.length; i++) {
            if(guess[i] == target[i]){
                strikes++;
            } else if (contains(target, guess[i])) {
                balls++;
            }
        }
        return  strikes * 10 + balls;
    }

    private static boolean contains(int[] array, int value){
        for (int num : array){
            if (num == value){
                return true;
            }
        }
        return false;
    }
}
