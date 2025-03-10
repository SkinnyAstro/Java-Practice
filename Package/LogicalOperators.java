package Package;

public class LogicalOperators {
    public static void main(String[] args) {

        /**********************AND OPERATOR**********************/

        boolean hasDrivingLicense = false;
        boolean hasInsurance = true;

        if (hasDrivingLicense&&hasInsurance){
            System.out.println("You can legally drive.\n");
        }else {
            System.out.println("You cannot legally drive.\n");
        }

        int age = 35;
        double income = 45000;

        if (age>=25&& income>=45000){
            System.out.println("You are eligible for a loan.\n");
        }else{
            System.out.println("You are not eligible for a loan.\n");
        }

        String inputUsername = "JohnDoe";
        String inputPassword = "password123";

        String correctUsername = "JohnDoee";
        String correctPassword = "password123";

        if (inputUsername.equals(correctUsername)&& inputPassword.equals(correctPassword)){
            System.out.println("Access granted!\n");
        }else {
            System.out.println("Invalid username or password\n");
        }


        /**********************OR OPERATOR**********************/

        boolean hasGoodPerformance = false;
        boolean isLongTermEmployee = false;

        if (hasGoodPerformance||isLongTermEmployee){
            System.out.println("The user is eligible for a promotion.");
        }else {
            System.out.println("The user is not eligible for a promotion.");
        }

        // good performance or is a long term employee: System.out.println("The user is eligible for a promotion.");
        // otherwise: System.out.println("The user is not eligible for a promotion.");

        int userAge = 17;
        boolean isParentPresent = true;

        // at least 18 or if parent is present: System.out.println("You can enter the venue.");
        // otherwise: System.out.println("You cannot enter the venue.");


        int memberAge = 16;
        boolean hasMembership = false;

        // at least 18 or has a membership: System.out.println("The user can access the service.");
        // otherwise: System.out.println("The user cannot access the service.");


        /**********************NOT OPERATOR**********************/

        String option = "cash";

        boolean cashOrCredit = option.equals("cash") || option.equals("credit");

        // if payment option is NOT cash or credit: System.out.println("Please choose another payment option");
        // otherwise: System.out.println("Sold. Pleasure doing business with you!");

        char letter = 'A';

        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');

        // if letter is NOT a vowel: System.out.println("The letter " + letter + " is a consonant");
        // otherwise: System.out.println("The letter " + letter + " is a vowel");

        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");

        // if move is NOT hit or stay: System.out.println("Please choose a valid move");
        // otherwise: System.out.println("You win 10 bucks!");

    }
}
