package Practice.ArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<>list2 = new ArrayList<String>();

        // add elements.
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get elements
        int element = list.get(1);
        System.out.println(element);

        // to add a element in between.
        list.add(1,4);
        System.out.println(list);

        // set element
        list.set(0,8);
        System.out.println(list);

        //delete element.
        list.remove(3);
        System.out.println(list);

        // returns the size of the arraylist
        int size =list.size();
        System.out.println(size);

        // loops.
        for (int i=0 ; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting.


    }
}
