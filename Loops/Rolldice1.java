package Loops;

// Rolling the dice untill 6 appears.
public class Rolldice1 {
    public static void main(String[] args) {

        int diceroll=2;

        while (diceroll!=6){
            diceroll=rolldice();
            System.out.println("Dice rolled: " + diceroll);
        }
        System.out.println("You rolled 6");


    }

    public static int rolldice(){
        return (int) (Math.random()*6)+1;
    }
}
