package Loops;


import java.util.Scanner;

// Asking user how many times you want to roll the dice and printing the every dice roll
public class Rolldice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to roll the dice ?");
        int roll = scan.nextInt();
        for (int i=1 ; i<=roll ;i++){
            roll=rolldice();
            System.out.println("You rolled:"+roll);

        }
    }

    public static int rolldice(){
        return(int) (Math.random()*6)+1;
    }
}
