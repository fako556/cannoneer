import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 28.02.2017.
 */


public class Game extends JPanel {
    static String path = "vzoroveTereny/rovny1metr.ter";
    static TerrainFileHandler tfh = new TerrainFileHandler();


    public static void main(String[]args){
        tfh.loadTerFile(path);
        System.out.println(tfh.printData());

        JFrame frame = new JFrame();
        frame.add(new Game());
        frame.setTitle("J.Kalivoda/A15B0055P");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        // smazani okna
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.draw(new Rectangle(10,10, tfh.terrain.length,tfh.terrain[0].length));
    }
}
