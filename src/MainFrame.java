import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Panel;

public class MainFrame extends JFrame{
    
    MainFrame() {
        //Set Title
        this.setTitle("Music Player");
        
        // Set default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Correct capitalization

        // Prevent resizing
        this.setResizable(false);

        // Set frame size
        this.setSize(560, 420);

        // Set background color
        this.getContentPane().setBackground(new Color(127, 12, 255)); // Use `java.awt.Color`
        
        //add a panel
        Panel panel = new Panel();

        //adding components to the panel
        JCheckBox checkBox = new JCheckBox();
        panel.add(checkBox);

        // Set logo icon
        ImageIcon image = new ImageIcon("./../lib/agent-47.png"); // Ensure the path to the image is correct
        this.setIconImage(image.getImage()); // `setIconImage` applies to `JFrame`

        // Make the frame visible
        this.setVisible(true);
    }
}
