import javax.swing.JButton;
import javax.swing.JFrame;

public class App extends JFrame {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Hello World");

        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); // close the java program upon pressing the exit button

        jframe.setSize(650, 600); // setSize (width, height) (What a weird way to frame, lol)

        //for button
        JButton button = new JButton("Press me");

        //add the button
        jframe.getContentPane().add(button);

        jframe.setVisible(true); // for perpetual keeping it 
    }
}
