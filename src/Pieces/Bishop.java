package Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Bishop extends Piece{
    public Bishop(PieceColor color, Image image, int row, int col) {
        super(color, PieceType.BISHOP, image, row, col);
    }

    @Override
    public void getValidMoves() {

    }
}
