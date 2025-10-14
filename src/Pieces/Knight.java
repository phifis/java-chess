package Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Knight extends Piece{
    public Knight(PieceColor color, Image image, int row, int col) {
        super(color, PieceType.KNIGHT, image, row, col);
    }

    @Override
    public void getValidMoves() {

    }
}
