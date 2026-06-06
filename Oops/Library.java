package Practice.Oops;

import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        User user = new User("Prasad","1992-11-22");
        //user.name = "Prasad";
        //user.birthdate = LocalDate.parse("1992-11-22");

        System.out.printf(" %s was born on %s and he is today %d years old\n", user.getName(), user.getBirthday(),user.age());

        Book book = new Book("Meditation","Marcus Aurelius");

        book.title1 = " 3 Idiots";
        book.Author1 = "Chetan Bhagat";

        //System.out.printf(" %s has borrowed these book %s\n", user.name);

        user.borrow(book);

        System.out.printf(" %s has borrowed these books %s ", user.getName(), user.books);





    }
}
