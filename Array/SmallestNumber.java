package Practice.Array;

public class SmallestNumber {
    public static void main(String[] args) {
        int numbers [] = {34,332,54,18};
        int smallest = numbers[0];

        for (int i =1 ; i<numbers.length ; i++){
            if (numbers[i]<smallest){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number in the array is "+ smallest);

    }



}
