package RPG.com.GUI;


import javax.swing.*;
import java.awt.*;

public class GUIforRPG extends JFrame{

    public void runGUI() {

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("RPG");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setMinimumSize(new Dimension(700 ,500));

            GamePanel gamePanel = new GamePanel();
            frame.getContentPane().add(gamePanel, BorderLayout.CENTER);

            frame.pack();
            frame.setVisible(true);


         });
    }

}