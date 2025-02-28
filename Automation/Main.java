package Automation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // creating an instance of the class calculator.
        int sum = calculator.add(10,5); // creating an variable of type int and storing the value of calculator method in that.
        System.out.println(sum);
        int diff =calculator.subtract(10,5); // creating an variable of diff and storing the value of subtract method in that.
        System.out.println(diff);


    }
}
