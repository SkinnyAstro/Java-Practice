package Practice.Array;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       boolean found = false; // creating a flag so as to check if number provided is part of the array or not.

       int numbers[]= new int[size];

       // For input where we are initializing the value of the array.
        for (int i=0;i<size;i++){
            numbers[i]= sc.nextInt(); // Here we are initializing the value of the array as per the input given by the user
        }

        int x = sc.nextInt(); // We are initializing the value of 'x' which needs to be found in the array.

        // We are writing a for loop condition where if the value of x matches in the array list we return the index of the array where it was found
       for (int i= 0;i<size;i++){
           if (numbers[i]==x){
               System.out.println("X found at "+ i);
               found= true;
               break;
           }

       }
        if (!found){
            System.out.println(" Number entered is not part of the array ");
        }
    }
}
