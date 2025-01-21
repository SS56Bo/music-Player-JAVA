import javax.swing.*;

public class MusicPlayerGUI extends JFrame{
    //constructor for GUI, set title header and size
    public MusicPlayerGUI(){
       super("Music Player");

       //set Size of the window
       setSize(400, 600);

       //end process when app is closed
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       //set the window center to the screen
       setLocationRelativeTo(null);

       //prevent window resizing
       setResizable(false);

       //
    }
}
