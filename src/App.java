import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
    /* sets up a Java Swing application with SwingUtilities.invokeLater to ensure that the GUI creation 
        happens on the Event Dispatch Thread (EDT) */
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MusicPlayerGUI().setVisible(true);
            }
       });
    }
}
