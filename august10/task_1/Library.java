package august10.task_1;

import java.util.Random;

public class Library {
    public void generateBooksForPerson(Person person, int count) {
        Book[] generatedBooks = new Book[count];
        Random random = new Random();

        String[] bookNames = {"The Great Gatsby", "Moby Dick", "War and Peace", "Hamlet", "1984", };
        String[] authors = {"F. Scott Fitzgerald", "Herman Melville", "Leo Tolstoy", "William Shakespeare", "George Orwell"};

        for (int i = 0; i < count; i++) {
            String name = bookNames[random.nextInt(bookNames.length)];
            String author = authors[random.nextInt(authors.length)];
            generatedBooks[i] = new Book(name, author);
        }

        person.addBooks(generatedBooks);
    }



}
