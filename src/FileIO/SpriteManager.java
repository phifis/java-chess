package FileIO;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SpriteManager {
    private final Map<String, Image> sprites = new HashMap<>();

    private int scaling = 64;

    public SpriteManager(int scaling) {
        this.scaling = scaling;
        loadSprites();
    }

    private void loadSprites() {
        //todo replace Sting arrays with enums?
        String[] colors = {"white", "black"};
        String[] pieces = {"bishop", "king", "knight", "pawn", "queen", "rook"};

        for (String color : colors) {
            for (String piece : pieces) {
                String name = color + "_" + piece;

//                System.out.println("name: " + "/assets/" + name + ".png");
//                System.out.println("getClass().getResource(\"/assets/\" + name + \".png\") = " + getClass().getResource("/assets/" + name + ".png"));

//                ImageIcon icon = new ImageIcon("res/assets/" + name + ".png");
                try {
                    BufferedImage image = ImageIO.read(new FileInputStream("res/assets/" + name + ".png"));

//                    Image scaled = image.getScaledInstance(scaling, scaling, Image.SCALE_AREA_AVERAGING);
                    sprites.put(name, image);

                } catch (IOException e) {
                    System.out.println("EROORORORORORO");
                }


            }
        }
    }

    public Image get(String name) {
        return sprites.get(name);
    }

    public int getScaling() {
        return scaling;
    }

    public void setScaling(int scaling) {
        this.scaling = scaling;
    }
}

