// it is responesible for 
// storing and retrieving book data from a text file .

import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class FileManager {

    // This methome saves all boods in the library to a text file .
    public static void  saveToFile(String fileName, Library library){
        // 1. Get the books from the library
    // 2. Open the file using FileWriter
    // 3. Use a loop to write each book to the file in the format "id,title,author,year"
    // 4. Handle errors using try-catch

    try(FileWriter writer = new FileWriter(fileName)){
        for(Book b : library.getBooks()){
            writer.write(b.getId() + ", " + b.getTitle() + ", " + b.getAuthor() + ", " + b.getYear() + "\n");
        }
    }
    catch(IOException e){
        e.printStackTrace();

    }

          
    }
        public static Library loadFromFile(String fileName){
        // 1. Create a new Library
    // 2. Read the file using Scanner
    // 3. Split each line using split(",")
    // 4. Create a new Book with id, title, author, and year
    // 5. Add the book to the Library
    // 6. Return the Library
        Library library = new Library();
        try(Scanner input = new Scanner(new File(fileName))){
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String title = parts[1].trim(); // title 
                String author = parts[2].trim();// Author
                int year = Integer.parseInt(parts[3].trim()); // Yeras 

                library.addBook(new Book(title, author, year));// Creat a new book and add it to the library .
                
             

            }

        }catch(IOException e){
            System.out.println("Error loading data: " + e.getMessage());
        }
        return library;
        
    }
    
   
    }
    


