package Practice.Array;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int numbers [] = {34,56,23,45,60};
        int largest = numbers[0]; // We are creating an largest variable and assigning it the value of 0th index in the array
        for (int i=1; i<numbers.length ; i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
            System.out.println("Largrst number in the array is " + largest);
        }



    }
}
