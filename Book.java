// in this class , information from books is maintained for the user.
public class Book {
    
    private String title;
    private String author;
    private int year; 
    private int id;
    private static int counter = 1; // To generate an automatic ID

    // Creating a counstractor 
    public  Book(String title , String author, int year){
          this.title = title;
          this.author = author;
          this.year = year;
          this.id = counter++;
          
    }
   // Creat to String 
   public String toString(){
    return "ID : " + id + ", Title: " + title + ", Author: " + author + ", Year: " + year ;
   }
  // Adding a method to return the id in library class .
   public int getId(){
    return id;
   }
   // Adding a method fo return title in library.
   public String getTitle(){
    return title;
   }


}
