package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerElementFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int ArraySize = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(ArraySize);
        System.out.println("Enter the elements which are needed to be added in the list");
        for (int i=0 ; i<ArraySize ; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        System.out.println("Enter the element which needs to be found");
        int numbertobefound = sc.nextInt();

        if (list.contains(numbertobefound)){
            System.out.println(numbertobefound + " Is present in the list ");
        }
        else {
            System.out.println(numbertobefound + " is not present in the list ");
        }

    }
}
