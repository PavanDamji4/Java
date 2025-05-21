/*
 * Project: Console-Based Library Management System
 * Description:
 * This project is a simple Java-based Library Management System using console input/output and Vector collection.
 * It includes functionalities like user login authentication, displaying available books, adding new books,
 * borrowing books, and updating the book list accordingly. The admin is prompted for username and password,
 * and once logged in, can perform different library-related operations through a menu-driven interface.
 * This project demonstrates fundamental Java concepts such as classes, objects, methods, conditionals,
 * loops, switch-case, and use of the Scanner and Vector classes.
 */



import java.util.Vector;
import java.util.Scanner;

public class Library {
    Vector<String> books = new Vector<>();
    Library() {
        books.add("Shadow");
        books.add("Legacy");
        books.add("Origin");
        books.add("Storm");
        books.add("Echo");
    }
    String admin="Pavan@123";
    String user="12345";
    void Login(){
        System.out.println("************************************************************");
        System.out.print("Enter your username : ");
        Scanner sc1=new Scanner(System.in);
        String username1=sc1.nextLine();
        System.out.print("Enter your password : ");
        String password1=sc1.nextLine();

        if(username1.equals(admin) && password1.equals(user)){
            System.out.println("Login Successful");
            choosetodo();
        }
        else if(!(username1.equals(admin)) && password1.equals(user)){
            System.out.println("Invalid Username");
            Login();
        }
        else if(username1.equals(admin) && !(password1.equals(user))){
            System.out.println("Invalid Password");
            Login();
        }
        else{
            System.out.println("Invalid Credentials");
            Login();
        }
    }

    void choosetodo()
    {
        System.out.println("************************************************************");
        System.out.println("Choose any one : (eg.. 1,2)" );
        System.out.println("1. Display list of Books.");
        System.out.println("2. Add a Book.");
        System.out.println("3. Borrow a Book.");
        System.out.println("4. Logout.");
        Scanner sc2 = new Scanner(System.in);
        int c2 = sc2.nextInt();
        switch (c2) {
            case 1:
                displaylist();
                break;
            case 2:
                addbook();
                break;
            case 3:
                borrowbook();
                break;
            case 4:
                System.out.println("Log Out Successful");
                start();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    void displaylist()
    {
        System.out.println("************************************************************");
        System.out.println("List of Books :");
        for(int i=0;i<books.size();i++)
        {
            System.out.println(i+1+". "+books.get(i));
        }
        choosetodo();
    }
    void addbook()
    {
        System.out.println("************************************************************");
        System.out.print("Enter the book name : ");
        Scanner sc3=new Scanner(System.in);
        String bookname=sc3.nextLine();
        books.add(bookname);
        System.out.println("Book added successfully");
        choosetodo();
    }
    void borrowbook()
    {
        System.out.println("************************************************************");
        System.out.println("Available Books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + 1 + ". " + books.get(i));
        }
        System.out.print("Enter the book number to borrow : ");
        Scanner sc4 = new Scanner(System.in);
        int booknum = sc4.nextInt();
        if (booknum > 0 && booknum <= books.size()) {
            System.out.println("Successfully borrowed: " + books.get(booknum - 1));
            books.remove(booknum - 1);
        } else {
            System.out.println("Invalid book number");
        }
        choosetodo();
    }
    void start()
    {
        System.out.println("************************************************************");
        System.out.println("******Welcome to the Library******");
        System.out.println("Choose any one : (eg.. 1,2)" );
        System.out.println("1. Login.");
        System.out.println("2. Exit");
        Scanner sc=new Scanner(System.in);
        int c1=sc.nextInt();
        switch (c1) {
            case 1:
                Login();
                break;
            case 2:
                System.out.println("Exiting.....");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
                start();
        }
    }
    public static void main(String[] args) {
        Library obj=new Library();
        obj.start();
    }
}
