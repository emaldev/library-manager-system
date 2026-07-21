public class Main {
    public static void main(String[] args){
        Library L = new Library();
        L.addBook(new Book("Java Programing", "Emal Hasanzada", 2025));
        L.addBook(new Book("C++ Programing", "Mr : Azimi", 2050));
        L.addBook(new Book("HTML D", "Ahmad", 2013));
        L.displayAllBooks();
        L.removeBook(2);
        L.displayAllBooks();
        L.searchByTitle("C++ Programing");
        
        
    }
    
}
