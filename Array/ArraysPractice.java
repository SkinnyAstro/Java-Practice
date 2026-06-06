package Practice.Array;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
//        int [] marks = new int[3]; // here 3 is the size of the array or the memory allocation
//        marks[0]= 78;
//        marks[1]= 67;
//        marks[2]= 89;
//        //marks[4]=56;
//        for (int i=0;i<3;i++){
//            System.out.println(marks[i]);
//        }

        int numbers [] = {1,2,3,8,5,6,7};
        Arrays.sort(numbers); // method used to sort the array.
        System.out.println(Arrays.toString(numbers)); // used to convert the array into string

        int search = Arrays.binarySearch(numbers,2);
        System.out.println(search); // this will return the index of the key value I am searching.
    }

}
