package Pieces;

public class Empty extends Piece{
    public Empty() {
        super(true);
    }

    @Override
    public void getValidMoves() {
        // no valid moves
    }
}
