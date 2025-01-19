import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class App extends JFrame {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame jframe = new JFrame("Music Player");

        // Set default close operation
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Correct capitalization

        // Prevent resizing
        jframe.setResizable(false);

        // Set frame size
        jframe.setSize(420, 420);

        // Set background color
        jframe.getContentPane().setBackground(new Color(127, 12, 255)); // Use `java.awt.Color` directly instead of nesting `ColorUIResource`

        // Set logo icon
        ImageIcon image = new ImageIcon("./../lib/agent-47.png"); // Ensure the path to the image is correct
        jframe.setIconImage(image.getImage()); // `setIconImage` applies to `JFrame`

        // Make the frame visible
        jframe.setVisible(true);
    }
}
