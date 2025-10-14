package Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;

public class King extends Piece{
    public King(PieceColor color, Image image, int row, int col) {
        super(color, PieceType.KING, image, row, col);
    }

    @Override
    public void getValidMoves() {

    }
}
