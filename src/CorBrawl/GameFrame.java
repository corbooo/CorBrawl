package src.CorBrawl;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    public GameFrame() {
        setTitle("CorBrawl");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        GamePanel panel = new GamePanel();
        add(panel);
        pack();
        setVisible(true);
        panel.requestFocusInWindow();
    }
}
