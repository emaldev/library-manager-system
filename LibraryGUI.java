import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;


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

        String title = titleField.getText();
        String authour = authorField.getText();
        String year = yearField.getText();

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
        

        panel.setBackground(Color.LIGHT_GRAY);
       


        // Add panel to frame
        frame.add(panel);
        
        frame.setVisible(true);

    }
    
}
