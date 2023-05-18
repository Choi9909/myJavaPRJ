package ByMySelf;

public class Player1 {
    private int[] player1Num = new int[4];
    private  int[] player2Guess = new int[4];


    public Player1(int num1, int num2, int num3, int num4){

        player1Num[0] = num1;
        player1Num[1] = num2;
        player1Num[2] = num3;
        player1Num[3] = num4;



    }

    public int[] setPlayer2Guess(int num1, int num2, int num3, int num4){
        player2Guess[0] = num1;
        player2Guess[1] = num2;
        player2Guess[2] = num3;
        player2Guess[3] = num4;
        return player2Guess;
    }

}
