/**
 * Created by user on 28.02.2017.
 */


public class Game {
    static String path = "vzoroveTereny/rovny1metr.ter";

    public static void main(String[]args){
        TerrainFileHandler tfh = new TerrainFileHandler();
        tfh.loadTerFile(path);
        System.out.println(tfh.printData());
    }
}
