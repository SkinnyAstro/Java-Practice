package Oops;

class Sports{
    public void games(){
        System.out.println("Playing sports is my favourite thing to do");
    }
}

class Football extends Sports{
    public void ball(){
        System.out.println("Football is my favourite thing to play");
    }

}

class Position extends Football{
    public void player(){
        System.out.println(" My position is that of striker");
    }
}

public class Multilevel1 {
    public static void main(String[] args) {

        Position ps = new Position();
        ps.player();
        ps.ball();
        ps.games();

    }
}
