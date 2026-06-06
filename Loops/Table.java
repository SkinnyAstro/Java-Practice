package Practice.Loops;

public class Table {
    public static void main(String[] args) {
//        int number = 6;
//        for (int multiplier = 1; multiplier <= 10; multiplier++) {
//            System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
//            System.out.println(number + "x" + multiplier + "=" + number*multiplier);
//        }

        // nested loops for printing 1-10 Tables

        for (int num = 1 ; num <=10 ; num++){
            for (int mul = 1 ; mul <=10 ; mul++){
                System.out.printf("%d X %d = %d\n",num,mul , num *mul);
            }
        }
    }
}