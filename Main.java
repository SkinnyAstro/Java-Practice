package Practice;

public class Main {
    public static void main(String[] args) {
        String name ="Prasad";
        int age= 20;
        Main main= new Main();
        main.printAge(age);
        main.printName(name);
    }

    public  void printName(String name){
        System.out.println("hello my name is "+name);

    }

    public  void printAge(int age){
        System.out.println("My age is "+age);

    }



}
