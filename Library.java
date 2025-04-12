import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    
    String getTitle(){
            return this.title;
    }
    
     String getAuthor(){
            return this.author;
    }
    
    String getIsbn(){
       return this.isbn;
    }
}


interface LibraryOperation {
    void addBook(Book book);
    void listBooks();
    Book searchBook(String title);
}



public class Library implements LibraryOperation {
    private String name;
    private String address;
    private Book[] books;
    private int cnt = 0;
    

    public Library(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.books = new Book[capacity];
        
    }

    public void addBook(Book book) {
        if (cnt < books.length) {
            books[cnt] = book;
            cnt++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void listBooks() {
        System.out.println("Books in " + name + " library:");
        for (int i = 0; i < cnt; i++) {
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("ISBN: " + books[i].getIsbn());
            System.out.println();
            .
        }
    }

    public Book searchBook(String title) {
        for (int i = 0; i < cnt; i++) {
            if (books[i].getTitle().toLowerCase() == title.toLowerCase()) {
                return books[i];
            }
        }
      System.out.println("Book not found");
      return null;
    }
    
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String libName = sc.nextLine();
        String libAddress = sc.nextLine();
        int capacity = sc.nextInt();
        sc.nextLine(); 
        
        Library library = new Library(libName, libAddress, capacity);
        
        while(true) {
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch(choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                    
                case 2:
                    library.listBooks();
                    break;
                    
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    Book foundBook = library.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayBook();
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}







