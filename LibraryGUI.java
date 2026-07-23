import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LibraryGUI {
    public static void main(String[] args){

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

        // Add buttom to panel
        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(removerButton);
        panel.add(searchButton);
        panel.add(displayButton);
        panel.add(saveButton);
        panel.add(loadButton);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);

    }
    
}
