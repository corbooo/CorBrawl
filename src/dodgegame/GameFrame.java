package src.dodgegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    public GameFrame() {
        setTitle("Corbin's Little Dodge Game");
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
