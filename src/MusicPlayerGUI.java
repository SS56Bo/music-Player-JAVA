import javax.swing.*;

public class MusicPlayerGUI extends JFrame{
    //constructor for GUI, set title header and size
    public MusicPlayerGUI(){
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

       addComponents();
    }

    private void addComponents(){
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

        //for playlist
        JMenu playlist = new JMenu("Playlists");
        menuBar.add(playlist);

        JMenuItem loadPlaylist = new JMenuItem("Load Playlist");
        playlist.add(loadPlaylist);

        //for edit menu component
        JMenu Edit = new JMenu("Edit");
        menuBar.add(Edit);

        JMenuItem editPlayer = new JMenuItem("Edit IG");
        Edit.add(editPlayer);
    }
}
