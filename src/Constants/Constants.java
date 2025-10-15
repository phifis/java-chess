package Constants;

import java.awt.*;

public class Constants {
    public static final Color COLOR_DARK_SQUARE = new Color(181, 136, 99);
    public static final Color COLOR_LIGHT_SQUARE = new Color(240, 217, 181);
    public static final Color COLOR_BACKGROUND = new Color(40, 40, 40);

    public static int squareLength;
    public static Dimension windowDimension;

    /**
     *
     * @param p to point to be transformed to Grid coordinates
     * @return array with the row in the first and the column in the second position
     */
    public static int[] PointToGrid(Point p) {
        return new int[]{p.y / squareLength, p.x / squareLength};
    }
}
