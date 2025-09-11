package Practice;

public class Classname {
    int a;
    String n;

    Classname(int x , String name){
        a =x;
        n = name;

    }

    void display(){
        System.out.println(" the age of the student "+ n + " is "+ a);
    }

    public static void main(String[] args) {
        Classname obj = new Classname(10,"Prasad");
        obj.display();
    }


}
