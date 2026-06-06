package Practice.ArrayList;

import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<Integer>();

        for (int i = 1 ; i <=5 ; i++) numbers.add(i *10);
        //System.out.println(" " + numbers);

//        for (int n : numbers)
//            System.out.println(n);

        for (int i = 0 ; i < numbers.size(); i++)
            System.out.println(" " + numbers.get(i));
    }
}
