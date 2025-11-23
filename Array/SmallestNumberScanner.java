package Practice.Array;

import java.util.Scanner;

public class SmallestNumberScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size]; // Defining an array named numbers.

        System.out.println("Length of the array is "+ numbers.length);

        for (int i =0 ; i<size ; i++){
            numbers[i]= sc.nextInt(); // We are taking the numbers in the array from the user.
        }

        int smallest = numbers[0];
        for (int i=1 ; i<size ;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smalles number in the arrays is "+ smallest);

    }
}
