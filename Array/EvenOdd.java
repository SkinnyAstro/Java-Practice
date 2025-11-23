package Practice.Array;

public class EvenOdd {
    public static void main(String[] args) {
        int numbers [] = {2,1,3,4,5,6};// declaring the array
        int evencount = 0;
        int oddcount = 0;

        for (int i =0 ; i<numbers.length ; i++){
            if (numbers[i]%2==0){
                evencount++;
            }else {
                oddcount++;
            }
        }
        System.out.println("Total even count is " + evencount);
        System.out.println("Total odd count is " + oddcount);




    }
}
