package Package;

public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");

        if (biologyGrade>chemistryGrade){
            System.out.println("Yes you did, congrats!");
        }else {
            System.out.println("No you did not");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        if (sales>costs){
            System.out.println("Yes we did");
        } else {
            System.out.println("No we did not");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        if (temperature<targetTemperature){
            System.out.println("Yes temperature is colder than our target");
        }else {
            System.out.println("No it is not");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        if (currentSpeed<speedLimit){
            System.out.println("Yes you are driving under the limit");
        } else {
            System.out.println("NO you are not");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        if (word==secondWord){
            System.out.println("yes the words are same");
        }else {
            System.out.println("No the words are not the same");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
    }
}
