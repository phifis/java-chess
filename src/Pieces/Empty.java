package Pieces;

import java.awt.*;

public class Empty extends Piece{
    public Empty() {
        super(true);
    }

    @Override
    public void getValidMoves() {
        // no valid moves
    }

    @Override
    public void draw(Graphics g) {
        // nothing to draw here
    }
}
