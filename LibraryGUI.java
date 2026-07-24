import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;


public class LibraryGUI {
    
   
    public static void main(String[] args){
        Library library = new Library();

        JFrame frame = new JFrame("Library Management System");// Title the library bar
        frame.setSize(600, 400);// Panel size 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Perventing sudden page layout shifts.
        

        // Create buttons in lib
        JButton addButton = new JButton("Add Book");
        JButton removerButton = new JButton("Remove Book");
        JButton searchButton = new JButton("Search Book");
        JButton displayButton = new JButton("Display Books");
        JButton saveButton = new JButton("Save File");
        JButton loadButton = new JButton("Load File");
        JButton exiButton = new JButton("Exit");

     
      
        // Add buttom to panel
        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(removerButton);
        panel.add(searchButton);
        panel.add(displayButton);
        panel.add(saveButton);
        panel.add(loadButton);
        panel.add(exiButton);
        addButton.addActionListener(e -> {
       
       
        JLabel titLabel = new JLabel("Title");
        JTextField titleField = new JTextField(20);
       
       
        // for title 
        JFrame addframe = new JFrame("Add Book");
        JButton addBookButton = new JButton("Add");
        JPanel addPanel = new JPanel();
         // for Author 
        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField(20);
        // for Years 
        JLabel yearLabel = new JLabel("Year:");
        JTextField yearField = new JTextField(20);
        addBookButton.addActionListener(e2 ->{

        String title = titleField.getText();
        String authour = authorField.getText();
        int year = Integer.parseInt(yearField.getText());
        // add book 
        library.addBook(new Book(title, authour, year));
        System.out.println("Book added successfully!");
        library.displayAllBooks();

        });
    

  

       

        addPanel.add(titLabel);
        addPanel.add(titleField);
       
        addPanel.add(authorLabel);
        addPanel.add(authorField);
        addPanel.add(yearLabel);
        addPanel.add(yearField);
        addPanel.add(addBookButton);
       
        addframe.add(addPanel);
   
    

        addframe.setSize(600, 300);
        addframe.setVisible(true);
                
      
       });
               // display all books 
       
        displayButton.addActionListener(e3 ->{

            JFrame displayFrame = new JFrame("All Books");
            displayFrame .setSize(400, 500);

            JTextArea textArea = new JTextArea();

            for(Book b: library.getBooks()){
            textArea.append(b.toString() + "\n");
            }
            displayFrame.add(textArea);
            displayFrame.setVisible(true);
        });
        
        // search the book section.
        JButton searchBookButton = new JButton("Search");
        JTextField searchField = new JTextField(20);
        searchButton.addActionListener(e4 -> {
        JFrame searchFrame = new JFrame("Search Boook");
        
        searchFrame.setSize(300, 300);
        
        JLabel searchLabel = new JLabel("Enter Title:");

        
        

        JPanel searchPanel = new JPanel();
    
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchBookButton);
        searchFrame.add(searchPanel);
        searchFrame.setVisible(true);

 
        searchFrame.setVisible(true);

        });
        // search connect to the library.
        searchBookButton.addActionListener(e5 -> {
            String title = searchField.getText();
            boolean found = false;

            for(Book b: library.getBooks()){
                if(b.getTitle().equalsIgnoreCase(title) ){
                    // displaying the found book in the panel.
                    JOptionPane.showMessageDialog(null, b.toString());
                    found =  true;
                }
            }
                 // if not found book 
                if(!found){
                    JOptionPane.showMessageDialog(null, "Book not found!");
                }

            
            
        });

        panel.setBackground(Color.LIGHT_GRAY);
        
    
       


        // Add panel to frame
        frame.add(panel);
        
        frame.setVisible(true);

    }
    
}
