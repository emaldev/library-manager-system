// the class is manages the book collection , 
// including adding deleting , searching for ,
//  and displaying books.

import java.util.ArrayList;

public class Library {

        ArrayList<Book > books  = new ArrayList<>();
    
   
    // Method for adding a book .
    public void addBook(Book book){
        books.add(book);

    }
 
    // Method for removed  a book 
    public void removeBook(int id){
         boolean found = false;
         for (int i = 0; i< books.size(); i++){
            if(id == books.get(i).getId()){
            
               
                books.remove(i);
                
                found = true;
                System.out.println("Book removed successfully!");
                 break;
                
            }
       

         }
       
         if(!found){
            System.out.println("Book not found!");
         }
    }
    // Method for Searched by title a book 
    public void searchByTitle(String title){
        boolean foundTitle = false;
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getTitle().equalsIgnoreCase(title)){

                foundTitle = true;
                System.out.println("This is your search: " + books.get(i) );
                
            }
        }
        if(!foundTitle){
            System.out.println("No book found with that title.");
        }
        
    }
    // Method for display all books .
    public void displayAllBooks(){

    }

}
    

