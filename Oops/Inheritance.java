package Oops;
class Animal{
    public void sound (){
        System.out.println("This animal makes sound");
    }

}
class Dog extends Animal{
    @Override
     public void sound(){
         System.out.println("Dog barks");
     }

}
public class Inheritance {
    public static void main(String[] args) {
        Animal an = new Dog(); //   Creating an new Animal object but assigning it to the dog.
        an.sound();
    }

}
