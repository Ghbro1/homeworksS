package august10.task_1;

public class Book {
    public String name;
    public String author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", author='" + author + '\'';
    }
}
