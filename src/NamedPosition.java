import java.awt.*;

/**
 * Created by user on 14.03.2017.
 */
public class NamedPosition {
    double x,y;
    String positionType;
    Color color;
    int size;

    public NamedPosition(double x, double y, String positionType, Color color, int size) {
        this.x = x;
        this.y = y;
        this.positionType = positionType;
        this.color = color;
        this.size = size;
    }
     public double getDistance(NamedPosition position){
         return Math.sqrt(
                 Math.pow(x - position.x, 2) +
                 Math.pow(y - position.y, 2));
     }

    @Override
    public String toString() {
        return positionType + "{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
