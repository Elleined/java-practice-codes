package datastructures;
import java.io.*;
import java.util.*;

public class StackExample {

    public record Book(String name, int id) {}

    public StackExample() {
    }

    public StackExample stack() {
        Stack<Book> oldStack = new Stack<>();
        oldStack.push(new Book("Introduction to IT", 101));
        oldStack.push(new Book("Web Design", 102));
        oldStack.push(new Book("Programming 1", 103));
        oldStack.push(new Book("Lectures in Software Engineering", 104));
        oldStack.push(new Book("System Desgin Thesis", 105));
        oldStack.push(new Book("C++ Programming and Design", 106));
        oldStack.push(new Book("Computer Concepts", 107));
        oldStack.push(new Book("CC-102 WorkText", 108));
        oldStack.push(new Book("OOP in Java Worktext", 108));
        oldStack.push(new Book("Anglo American Literature", 109));
        oldStack.push(new Book("Thesis Paper", 110));
        Collections.reverse(oldStack);
        Stack<Book> bookStack = new Stack<>();
        oldStack.forEach(bookStack::push);
        oldStack.clear();
        bookStack.forEach(System.out::println);
        writeFile(bookStack);
        Book removeItem = bookStack.pop();
        if (!bookStack.contains(removeItem)) {
            System.out.println("pop item: " + removeItem);
            System.out.println("Updated List: ");
            bookStack.forEach(System.out::println);
        }
        writeFile(bookStack);
        System.out.println("item retrrieve: " + bookStack.push(removeItem));
        System.out.println("Updated List: ");
        bookStack.forEach(System.out::println);
        writeFile(bookStack);

        readFile();
        return this;
    }


    private void writeFile(Stack<Book> bookStack) {
        try (BufferedWriter output = new BufferedWriter(
                new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\PracticeCoding\\src\\" +
                        "datastructures\\result.txt", true)
            )
        ){
            System.out.println("Writing to file...");
            String details = "Book id || Book name";
            output.write(details);
            output.newLine();
            System.out.println("Book id || Book name");
            bookStack.forEach(book -> {
                try {
                    HashMap<Integer, String> map = new HashMap<>();
                    map.put(book.id, book.name);
                    for (Map.Entry<Integer, String> personDetail: map.entrySet()) {
                        output.write(personDetail.getKey() + "        " + personDetail.getValue());
                        System.out.println(personDetail.getKey() + "        " + personDetail.getValue());
                    }
                    output.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void readFile() {
        try (BufferedReader input = new BufferedReader(
                new FileReader("C:\\Users\\Administrator\\IdeaProjects\\PracticeCoding\\src\\datastructures\\result.txt")
            )
        ){
            System.out.println("Reading file...");
            while (input.read() != -1) {
                System.out.println(input.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
