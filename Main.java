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
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            
            choice  =input.nextInt();
            input.nextLine(); // enter buffoon

            switch (choice) {
                case 1: //get book deteils 
                    System.out.println("Enter title :");
                    String title = input.nextLine();
                    System.out.println("Enter Author: ");
                    String author = input.nextLine();
                    System.out.println("Enter Year: ");
                    int year = input.nextInt();
                    input.nextLine();// clear the newline chrcater after the number 
                    library.addBook(new Book(title, author, year)); // add a book in the library 
                    System.out.println("Book added succefully!");
                   
                    break;
                case 2:
                    System.out.println("Enter the book's ID for delete it: ");
                    int id = input.nextInt();// get book id for deletion 
                    library.removeBook(id); // remove the book 
                    break;
                case 3:
                    System.out.println("Enter the title to search for a book: ");
                    title =input.nextLine();// Search for a book by title in library .
                    library.searchByTitle(title);

                    break;
                case 4:
                    library.displayAllBooks(); // display all book 
                    break;
                case 5:
                    System.out.println("Enter file name to save: ");
                    String fileName = input.nextLine(); // save the library to file 
                    FileManager.saveToFile(fileName, library);
                    break;
                case 6:
                    System.out.println("Enter file name to load : ");
                      fileName = input.nextLine(); // load the library from a file 
                      // Replace the current library with the loaded library 
                     Library loadedLibrary = FileManager.loadFromFile(fileName);
                     library = loadedLibrary;
                    break;
                case 7:
                    // Exit the programe the section .
                    System.out.println("You hava exited the app We would be happy to see you again.");
                    break;
                    // if the number is not between 1 and 7


            
                default:
                    break;
            }
        }while(choice != 7);

        input.close(); // To pervet memory leaks .
        
    }
    
}
