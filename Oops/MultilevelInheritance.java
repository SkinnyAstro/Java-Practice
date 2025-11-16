package Oops;


class Mammal{
    public void eat(){
        System.out.println("The Animal eats");
    }
}

class dog extends Mammal{
    public void barks(){
        System.out.println("Dog barks");
    }
}

class puppy extends dog{
    public void plays(){
        System.out.println("Puppy plays");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        puppy pp = new puppy();
        pp.plays(); // method aleady defined in the puppy class
        pp.eat(); // Method inherited from the Mammal class
        pp.barks(); // Method inherited from the dog class.

    }
}
