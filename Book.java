public class Book {
    
    private String title;
    private String author;
    private int year; 
    private int id;
    private static int counter = 1; // To generate an automatic ID

    // Creating a counstractor 
    public  Book(String title , String author, int year, int id){
          this.title = title;
          this.author = author;
          this.year = year;
          this.id = counter++;
          
    }


}
