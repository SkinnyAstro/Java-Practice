package Practice.Array;

import java.util.Enumeration;
import java.util.Scanner;

public class LargestNumberScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];

        System.out.println(" Size of the array is "+ numbers.length);

        for (int i=0 ; i<size ;i++){
            numbers[i]=sc.nextInt();
        }

        int largest = numbers[0];
        for (int i =1 ;i<size ; i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest number in the array is " + largest);
    }
}
