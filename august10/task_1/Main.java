package august10.task_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(3);
        Library library = new Library();
        library.generateBooksForPerson(person,3);
        Person person1 = new Person(4);
        library.generateBooksForPerson(person1,4);

        person1.printBooks();
        person.printBooks();
    }
}
