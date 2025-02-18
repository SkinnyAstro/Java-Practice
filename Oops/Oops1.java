package Oops;

class Student{
    String name;
    int id;

    public  void Studentinfo(String name){
        // this.name = name;
        System.out.println(this.name);
    }

    public void Studentinfo(String name , int id){
//        this.name = name;
//        this.id = id;
        System.out.println(this.name+ " "+ this.id);
    }

    public void Studentinfo (int id){
        //this.id = id;
        System.out.println(this.id);

    }
}

public class Oops1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prasad";
        s1.id = 20;
        s1.Studentinfo(s1.name ,s1.id);

        Student s2  = new Student();
        s2.name = "Sartape";
        s2.id = 20;
        s2.Studentinfo(s2.name,s2.id);

    }
}
