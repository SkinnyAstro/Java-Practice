package Practice.Loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter second number");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation would you like to perform");

        String operation = scanner.nextLine();

        switch (operation.toLowerCase()){
            case "sum":
                System.out.printf(" %f + %f = %f ",number1,number2,number1+number2);
                break;

            case "sub":
                System.out.printf(" %f /%f = %f ", number1,number2,number1-number2);
                break;

            case "mul":
                System.out.printf(" %f * %f = %f",number1,number2,number1*number2);
                break;

            case "div":
                if (number2 ==0){
                    System.out.println(" Cannot divide by 0");
                }
                else {
                    System.out.printf("%f / %f = %f ", number1,number2,number1/number2);
                }break;

        }


    }
}
