import javax.swing.JFrame;

public class App extends JFrame {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Hello World");

        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); 

        jframe.setSize(650, 600);

        jframe.setVisible(true);
    }
}
