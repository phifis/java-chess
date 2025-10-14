package Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Rook extends Piece{
    public Rook(PieceColor color, Image image, int row, int col) {
        super(color, PieceType.ROOK, image, row, col);
    }

    @Override
    public void getValidMoves() {

    }
}
