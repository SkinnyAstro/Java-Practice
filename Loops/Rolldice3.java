package Loops;

public class Rolldice3 {
    public static void main(String[] args) {

        int diceroll1;
        int diceroll2;
        int sum;

        System.out.println("Rolling two dice");
        diceroll1 = rolldice();
        diceroll2= rolldice();
        sum= diceroll2+diceroll1;

        System.out.println("You rolled: "+ diceroll1);
        System.out.println("You rolled: "+ diceroll2);
        System.out.println("Sum of two rolled dice:" +sum);

    }

    public static int rolldice(){
        return (int) (Math.random()*6)+1;
    }
}
