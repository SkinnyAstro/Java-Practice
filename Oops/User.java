package Practice.Oops;

import java.util.ArrayList;


import Practice.ArrayList.ArrayLists;

import java.time.LocalDate;
import java.time.Period;

public class User {
     private  String name;
     private LocalDate birthdate;
     public ArrayList<Book>books = new ArrayList<Book>();

     public String getName(){
          return  this.name ;
     }

     public String getBirthday(){
          return this.birthdate.toString();
     }


     // Created a constructor class
     User(String name, String birthdate){
          this.name = name;
          this.birthdate = LocalDate.parse(birthdate);
     }


     // writing a method to calculate the current age of the user
     // we are using the Period method which is built in java method of period class

     public int age(){
          int age = Period.between(birthdate,LocalDate.now()).getYears();
          return age;
     }

     public void borrow  (Book book ){
          this.books.add(book);

     }

}
