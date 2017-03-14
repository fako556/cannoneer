import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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



    public void loadTerFile(String fileName){
        try {
            DataInputStream input = new DataInputStream(new FileInputStream(fileName));
            columns = input.readInt();
            rows = input.readInt();
            deltaX = input.readInt();
            deltaY = input.readInt();
            shooterX = input.readInt();
            shooterY = input.readInt();
            targetX = input.readInt();
            targetY = input.readInt();

            shooterX *=deltaX;
            shooterY *=deltaY;

            targetX *=deltaX;
            targetY *=deltaY;
          /*  for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    double h = input.readDouble();
                    //System.out.println(h);
                    terrain[i][j] = (int)h;
                    System.out.println(terrain[i][j]);
                }
            }*/


        }

        catch (FileNotFoundException e){

        }
        catch (IOException e) {
            e.printStackTrace();
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
