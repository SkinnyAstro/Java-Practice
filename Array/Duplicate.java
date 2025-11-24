package Practice.Array;

public class Duplicate {
    public static void main(String[] args) {
        int numbers [] = {2,3,4,3,5,6,4}; // we are declaring the array.
         for (int i =0 ; i<numbers.length ; i++){ // We are finding the numbers in the outer loop.

             for (int j =i+1 ; j<numbers.length ; j++){ // we are finding the numbers in the inner loop.

                 if (numbers[i]==numbers[j]){ // comparing the outer loop and inner loop number.
                     System.out.println("Duplicate numbers are "+ numbers[i]);
                 }
             }
         }
    }
}
