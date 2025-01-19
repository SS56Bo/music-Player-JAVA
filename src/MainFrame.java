import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {
        // Set Title
        this.setTitle("Music Player");

        // Set default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Prevent resizing
        this.setResizable(false);

        // Set frame size
        this.setSize(560, 420);

        // Add a panel
        JPanel panel = new JPanel(); // Use JPanel instead of Panel
        panel.setBackground(new Color(200, 200, 255)); // Optional: Set panel color

        // Add components to the panel
        JCheckBox checkBox = new JCheckBox("Enable Sound");
        panel.add(checkBox);

        // Add the panel to the frame
        this.add(panel);

        // Set logo icon
        ImageIcon image = new ImageIcon("./../lib/agent-47.png"); // Ensure the path is correct
        this.setIconImage(image.getImage());

        // Make the frame visible
        this.setVisible(true);
    }
}
