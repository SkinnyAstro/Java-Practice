package Loops;

import java.util.Scanner;

public class Rolldice4 {
    public static void main(String[] args) {
        int player1score =0;
        int player2score=0;
        int targetscore = 20;

        System.out.println("Two player dice game, first to reach the points of 20 Wins");
        Scanner scan = new Scanner(System.in);

        while (player1score<targetscore && player2score<targetscore){

            System.out.println("Player1 turn. Please press enter to roll the dice");
            scan.nextLine();
            int roll = rolldice();
            System.out.println("Player 1 rolled:"+ roll);
            player1score+=roll;

            System.out.println("Player 1 total score "+player1score);
            if (player1score>=targetscore){
                System.out.println("Player 1 wins");
                break;
            }
            System.out.println("Player2 turn. Please press enter to roll the dice");
            scan.nextLine();
            int roll2 = rolldice();
            System.out.println("Player 2 rolled:"+ roll2);
            player2score+=roll2;
            System.out.println("Player 2 total score " + player2score);
            if (player2score>=targetscore){
                System.out.println("Player 1 wins");
                break;
            }
        }

    }

    public static int rolldice(){
        return (int) (Math.random()*6)+1;
    }
}
