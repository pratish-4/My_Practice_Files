import java.util.Scanner;
import java.util.Stack;

class Book {
    //instance variable
    public String title;
    public int pagesLeft;
    
    //Constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pagesLeft = pages;
    }
    // getter
    public String getTitle() {
        return this.title;
    }
    //getter
    public int getPages() {
        return this.pagesLeft;
    }
    // read function
    public void read100Pages() {
        System.out.println("Reading 100 pages of " + this.title);
        this.pagesLeft = this.pagesLeft - 100;
    }
    // status of pages left
    public Boolean completed() {
        return this.pagesLeft <= 0;
    }
}

public class Source01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Harry Potter", 200);
        Book book2 = new Book("Champak", 100);
        Book book3 = new Book("Lord of the Rings", 300);
        Book book4 = new Book("Tinkle", 100);

         
        Stack<Book> bookStack = new Stack<Book>();
        // Add code to push the books on the Stack here (in order:
        // book1,book2,book3,book4)
        System.out.println(bookStack.push(book1));
        System.out.println(bookStack.push(book2));
        System.out.println(bookStack.push(book3));
        System.out.println(bookStack.push(book4));
        // Add code to pick the book at the top and read 100 pages
        // Remove the book from the stack if it is completed
        while(!bookStack.isEmpty()){
        Book any = bookStack.pop();
        while(!any.completed()){
        any.read100Pages();
        }
        }
    }
}
