package Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Queen extends Piece{
    public Queen(PieceColor color, Image image, int row, int col) {
        super(color, PieceType.QUEEN, image, row, col);
    }

    @Override
    public void getValidMoves() {

    }
}
