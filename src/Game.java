import java.awt.*;

/**
 * Created by user on 28.02.2017.
 */


public class  Game{
    static String path = "vzoroveTereny/rovny1metr.ter";
    static TerrainFileHandler tfh = new TerrainFileHandler();
    static GamePanel panel = new GamePanel();

    public static void main(String[]args){
        tfh.loadTerFile(path);
        System.out.println(tfh.printData());

        NamedPosition shooter = new NamedPosition(tfh.shooterX,tfh.shooterY,"Shooter", Color.GREEN,10);
        NamedPosition target = new NamedPosition(tfh.targetX,tfh.targetY,"Target", Color.RED,10);

        System.out.println(shooter.toString());
        System.out.println(target.toString());

        double shooterTargetDistance = shooter.getDistance(target);
        System.out.println(shooterTargetDistance);

        panel.makeWindow();


    }


}
