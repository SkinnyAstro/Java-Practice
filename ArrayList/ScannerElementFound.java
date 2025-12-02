package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerElementFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(ArraySize);
        for (int i=0 ; i<ArraySize ; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        int numbertobefound = sc.nextInt();

        if (list.contains(numbertobefound)){
            System.out.println(numbertobefound + " Is present in the list ");
        }
        else {
            System.out.println(numbertobefound + " is not present in the list ");
        }

    }
}
