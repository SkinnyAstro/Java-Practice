package Practice.Oops;

import java.util.ArrayList;

public class Book {
    private String title;
    private String Author;
    public String title1;
    public String Author1;


    Book (String title, String Author){
        this.title = title;
        this.Author = Author;
    }

    public  String getTitle (){
        return this.title;
    }

    public String getAuthor(){
        return  this.Author;
    }


    public String toString(){
        return String.format("%s by %s ", this.title,this.Author);
    }





}
