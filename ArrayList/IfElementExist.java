package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IfElementExist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(15);
        list.add(20);

        int elementtobefound = 15;

        if (list.contains(elementtobefound)){
            System.out.println(elementtobefound + " Exist in the array");
        }else {
            System.out.println(elementtobefound + "This element does not exist in the array list.");
        }
    }
}
