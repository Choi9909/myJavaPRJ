package ByMySelf;

public class Player2 {
    private int [] player2Num = new int[4];
    private int [] player1Guess = new int[4];
    public Player2(int num1, int num2, int num3, int num4){

        player2Num[0] = num1;
        player2Num[1] = num2;
        player2Num[2] = num3;
        player2Num[3] = num4;


    }

    public void setPlayer1Guess (int num1, int num2, int num3, int num4){
        player1Guess[0] = num1;
        player1Guess[1] = num2;
        player1Guess[2] = num3;
        player1Guess[3] = num4;

    }
}
