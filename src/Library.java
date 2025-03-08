import java.util.*;

class Books {
    Vector<String> books = new Vector<>();

    // Constructor to initialize book list
    Books() {
        books.add("To Kill a Mockingbird");
        books.add("The Lord of the Rings");
        books.add("Pride and Prejudice");
        books.add("The Hunger Games");
        books.add("The Catcher in the Rye");
        books.add("The Lion, the Witch and the Wardrobe");
    }

    void list_of_books() {
        System.out.println("The list of Books:");
        for (int i = 0; i < books.size(); i++) {  // Fixed index to start from 0
            System.out.println((i + 1) + ". " + books.elementAt(i));
        }
    }

    void add_book(String bookname) {
        books.add(bookname);
        System.out.println( bookname + " has been added to the library.");
    }

    void issue_book(String bookname) {
        if (books.remove(bookname)) {
            System.out.println("You have borrowed \"" + bookname + "\".");
        } else {
            System.out.println("Sorry, \"" + bookname + "\" is not available.");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        boolean running = true;
        Books library = new Books();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the online library!");

        while (running) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Display List of Books");
            System.out.println("2. Return a Book");
            System.out.println("3. Add a Book");
            System.out.println("4. Borrow a Book");
            System.out.println("5. EXIT");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline

            switch (choice) {
                case 1:
                    library.list_of_books();
                    break;
                case 2:
                    System.out.print("Enter the book name to return: ");
                    String returnBook = sc.nextLine();
                    library.add_book(returnBook);
                    break;
                case 3:
                    System.out.print("Enter the book name to add: ");
                    String addBook = sc.nextLine();
                    library.add_book(addBook);
                    break;
                case 4:
                    System.out.print("Enter the book name to borrow: ");
                    String borrowBook = sc.nextLine();
                    library.issue_book(borrowBook);
                    break;
                case 5:
                    System.out.println("Exiting the Online Library. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid number.");
            }
        }

        sc.close();
    }
}
