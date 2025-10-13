package Pieces;

public abstract class Piece {
    protected PieceColor color;
    protected PieceType type;
    protected boolean isEmpty;

    protected Piece(PieceColor color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    protected Piece(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    // ######### Getter and Setter #########
    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    // ######### Member Functions #########
    public abstract void getValidMoves();
}