import java.io.*;
import java.util.Arrays;

/**
 * Created by user on 28.02.2017.
 */
public class TerrainFileHandler {
    int[][] terrain = null;
    int columns, rows;
    int deltaX, deltaY;
    int shooterX, shooterY;
    int targetX, targetY;
    String name;

    String url = "vzoroveTereny/terrain257x257.ter";

    public void loadTerFile(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(new File(url)))));


        }

        catch (FileNotFoundException e){

        }
    }

    public String printData() {
        return "TerrainFileHandler{" +
                "terrain=" + Arrays.toString(terrain) +
                ", columns=" + columns +
                ", rows=" + rows +
                ", deltaX=" + deltaX +
                ", deltaY=" + deltaY +
                ", shooterX=" + shooterX +
                ", shooterY=" + shooterY +
                ", targetX=" + targetX +
                ", targetY=" + targetY +
                ", name =" + name +
                '}';
    }
}
