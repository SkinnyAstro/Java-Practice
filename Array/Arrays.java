package Practice.Array;

public class Arrays {

    public static void main(String[] args) {
        int [] marks = new int[3]; // here 3 is the size of the array or the memory allocation
        marks[0]= 78;
        marks[1]= 67;
        marks[2]= 89;
        //marks[4]=56;

        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }

}
