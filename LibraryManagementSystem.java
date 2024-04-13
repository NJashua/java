import java.util.Scanner;
import java.util.ArrayList;

  
class Book{
    private String title;
    private Boolean borrowed;

    public Book(String title){
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle(){
        return title;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void borrow(){
        borrowed = true;
    }

    public void returnBook(){
        borrowed = false;
    }
}

class Library{
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(String title){
        books.add(new Book(title));
    }

    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("No books available in the library.");
        }else{
            System.out.println("Available books in the library: ");
            for(Book book: books){
                System.out.println(book.getTitle() + " - " + (book.isBorrowed() ? "Borrowed" : "Available"));
            }
        }

    }

    public void borrowBook(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()){
                book.borrow();
                System.out.println("You have successfullt borrowed the book: " + title);
                return;
            }
        }
        System.out.println("The book " + title + " is not availble for borrowing.");
    }

    public void returnBook(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()){
                book.returnBook();
                System.out.println("You have successfully returned the book: "+ title);
                return;
            }
        }
        System.out.println("You have not borrowed the book: " + title);
    }
}

public class LibraryManagementSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addBook("Python Programming");
        library.addBook("Data Structures and Algorithm");
        library.addBook("Web Development");
        library.addBook("Java");
        library.addBook("Machine Learing");
        library.addBook("Artificial Inteligence");
        library.addBook("Clean code");

        while(true){
            System.out.println("Library Management System");
            System.out.println("1. Available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return book");
            System.out.println("4. Exit");
            System.out.println("5. Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //for newline..,

            switch (choice) {
                case 1:
                    library.displayBooks();
                break;
                case 2:
                    System.out.print("Enter the title of the book that you want to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                break;
                case 3:
                    System.out.println("Enter the title of the book that you want to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                break;
                case 4:
                    System.out.println("Exiting... Thank you");
                    scanner.close();
                    System.exit(choice);
                    break;

                default:
                    break;
            }
        }
        //scanner.close();
    }
}
