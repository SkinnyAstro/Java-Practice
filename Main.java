package Practice;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum =calculator.Addition(10,5);
        System.out.println(sum);
        int diff=calculator.Subtraction(10,5);
        System.out.println(diff);

    }
}
