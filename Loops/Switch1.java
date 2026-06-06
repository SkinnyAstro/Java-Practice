package Practice.Loops;


import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter what grade you have received");
        String grade = scanner.nextLine();

        String result = switch (grade){
            case "A" -> "Distinction marks";
            case "B"-> "Good marks";
            default -> "Invalid grade";

        };
        System.out.println(result);




















//
//        switch (grade){
//            case  "A":
//                System.out.println(" you have score above 80%");
//                break;
//
//            case "B":
//                System.out.println(" you have scored between 70-80%");
//                break;
//
//            case "C":
//                System.out.println(" You have scored between 60-70%");
//                break;
//
//            case "D":
//                System.out.println("You have barely passed, you need to improve");
//                break;
//
//            default:
//                System.out.println("Entered value is not a valid grade");
//                break;
//        }



    }
}