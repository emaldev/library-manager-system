import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        int choice;
      
        do{
            System.out.println("\n ==== Library Mabager System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Save to File");
            System.out.println("6. Load from File");
            System.out.println("7 Exit");
            System.out.println("Enter your choice: ");
            
            choice  =input.nextInt();
            input.nextLine(); // enter buffoon

            switch (choice) {
                case 1:
                    System.out.println("Enter title :");
                    String title = input.nextLine();
                    System.out.println("Enter Author: ");
                    String author = input.nextLine();
                    System.out.println("Enter Year: ");
                    int year = input.nextInt();
                    input.nextLine();
                    library.addBook(new Book(title, author, year));
                    System.out.println("Book added succefully!");
                   
                    break;
                case 2:
                    System.out.println("Enter the book's ID for delete it: ");
                    int id = input.nextInt();
                    library.removeBook(id);
                    break;
                case 3:
                    System.out.println("Enter the title to search for a book: ");
                    title =input.nextLine();
                    library.searchByTitle(title);

                    break;
                case 4:
                    library.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Enter file name to save: ");
                    String fileName = input.nextLine();
                    FileManager.saveToFile(fileName, library);
                    break;
                case 6:
                    break;
                case 7:
                    break;


            
                default:
                    break;
            }
        }
        
    }
    
}
