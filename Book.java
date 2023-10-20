//Question-1:-
/* Create a Book class with bookId, bookName and authorName.Create
parameterized constructor to initialize the object. Create an ArrayList of
type Book and store all book objects into collections and display all book
details.
[Hint:Use advanced for loop to display all Books details]
*/
//Input:-
//Package Name:-
package Set_Queues;
//ArrayList-ArrayList Class:-
import java.util.ArrayList;
//File Name:-
class Book {
	//Private input value:-
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
    	//this() Method
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters for accessing private fields
    public int getBookId() {
    	//Return Type
        return bookId;
    }

    public String getBookName() {
    	//Return Type
        return bookName;
    }

    public String getAuthorName() {
    	//Return Type
        return authorName;
    }


    public static void main(String[] args) {
        // Create an ArrayList to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Add Book objects to the ArrayList using Collections
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(3, "1984", "George Orwell"));
        books.add(new Book(4, "The Catcher in the Rye", "J.D. Salinger"));

        // Display all book details using an advanced for loop
        System.out.println("Book Details:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println("--------------------");
        }
    }
}
//Output:-
/*
Book Details:
Book ID: 1
Book Name: The Great Gatsby
Author Name: F. Scott Fitzgerald
--------------------
Book ID: 2
Book Name: To Kill a Mockingbird
Author Name: Harper Lee
--------------------
Book ID: 3
Book Name: 1984
Author Name: George Orwell
--------------------
Book ID: 4
Book Name: The Catcher in the Rye
Author Name: J.D. Salinger
--------------------
*/