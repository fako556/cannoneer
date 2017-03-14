import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 14.03.2017.
 */
public class GamePanel extends JPanel {
    static TerrainFileHandler tfh = new TerrainFileHandler();

    public void makeWindow(){
        JFrame frame = new JFrame();
        frame.add(new GamePanel());
        frame.setTitle("J.Kalivoda/A15B0055P");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        // smazani okna
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

    }
}

