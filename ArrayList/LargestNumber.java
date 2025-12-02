package Practice.ArrayList;

import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(8);

        System.out.println(list);

       int largestNumber= list.get(0);


       for (int i =1; i<list.size();i++){
           if (list.get(i)>largestNumber){
               largestNumber = list.get(i);
           }
       }
        System.out.println("Largest number in the array is " + largestNumber);

    }
}
