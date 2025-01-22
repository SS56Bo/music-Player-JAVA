import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class MusicPlayerGUI extends JFrame{
    //constructor for GUI, set title header and size
    public MusicPlayerGUI(){
        //setting frame color
       Color FRAME_COLOR = new Color(0, 0, 100);

       super("Music Player");

       //set Size of the window
       setSize(450, 600);

       //end process when app is closed
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       //set the window center to the screen
       setLocationRelativeTo(null);

       //prevent window resizing
       setResizable(false);

       //
       setLayout(null);

       //frame colour
       getContentPane().setBackground(FRAME_COLOR);

       addComponents();
    }

    private void addComponents(){
        ToolbarGUI();

        //load record image
        JLabel songImage = new JLabel(loadImage("./lib/recordVinyl.png"));
        songImage.setBounds(0, 50, getWidth()-20, 255);
        add(songImage);
    }

    private void ToolbarGUI(){
        JToolBar toolbar = new JToolBar();
        toolbar.setBounds(0, 0, getWidth(), 20);
        add(toolbar);

        //prevents toolbar from being moved
        toolbar.setFloatable(false); //prevents toolbar from being moved

        //Drop-Down menu
        JMenuBar menuBar = new JMenuBar();
        toolbar.add(menuBar);

        JMenu songMenu = new JMenu("Songs");
        menuBar.add(songMenu);

        JMenuItem loadSong = new JMenuItem("Load Song");
        songMenu.add(loadSong);

        JMenuItem newSong = new JMenuItem("New Song");
        songMenu.add(newSong);

        //for playlist
        JMenu playlist = new JMenu("Playlists");
        menuBar.add(playlist);

        JMenuItem loadPlaylist = new JMenuItem("Load Playlist");
        playlist.add(loadPlaylist);

        JMenuItem createPlaylist = new JMenuItem("Create Playlist");
        playlist.add(createPlaylist);

        //for edit menu component
        JMenu Edit = new JMenu("Edit");
        menuBar.add(Edit);

        JMenuItem editPlayer = new JMenuItem("Edit IG");
        Edit.add(editPlayer);
    }

    private ImageIcon loadImage(String path){
        try {
            BufferedImage img = ImageIO.read(new File(path));
            return new ImageIcon(img);
        } catch (Exception e){
            e.printStackTrace();
            
        }

        //could not find resources
        return null;
    }
}
