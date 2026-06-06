package Practice.Package;

import java.awt.desktop.SystemEventListener;
import java.security.PublicKey;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

         boolean isPrime = true;

         if (number < 2 ){
             isPrime = false;
         }

         for (int i = 2 ; i< number; i++){
             if (number % i ==0){
                 isPrime = false;
                 break;
             }
             else
                 isPrime = true;
         }

         if (isPrime){
             System.out.println(number + " Is an Prime number");
         }
         else System.out.println( number + " Is not an prime number");

    }
}
