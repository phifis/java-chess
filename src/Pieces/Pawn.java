package Pieces;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Pawn extends Piece{
    public Pawn(PieceColor color, Image image, int row, int col) {
        super(color, PieceType.PAWN, image, row, col);
    }

    @Override
    public void getValidMoves() {

    }
}
