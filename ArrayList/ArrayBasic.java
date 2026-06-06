package Practice.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayBasic {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Chiku");

        System.out.println("List = " + fruits);
        System.out.println("List size = " + fruits.size());

        // updating the list

        fruits.set(0,"Grapes");
        System.out.println("Update list = " + fruits);

        // removal of an element from the array.
        fruits.remove(0);
        System.out.println(fruits);

        // Check if element exist in the array list

        System.out.println("Check if apple exits ?" +  fruits.contains(" Apple "));

    }
}
