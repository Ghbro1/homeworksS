package august10.task_1;
import java.util.Arrays;
public class Person {
    Book[] books;
    public Person(int lenBookArr){
        books = new Book[lenBookArr];
    }
    public void addBooks(Book[] books){
        this.books = books;
    }
    public void printBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
