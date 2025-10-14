package Pieces;

import constants.Constants;

import java.awt.*;

public abstract class Piece {
    protected PieceColor color;
    protected PieceType type;
    protected boolean isEmpty;

    Image image;
    boolean drawSprite; // to prevent drawing while the piece is picked up by drag and drop
    Point centerPos; // the center position to draw the sprite

    int row;
    int col;

    protected Piece(PieceColor color, PieceType type, Image image, int row, int col) {
        this.color = color;
        this.type = type;
        this.image = image;
        this.row = row;
        this.col = col;

        drawSprite = false;
        int sl = Constants.squareLength;
        centerPos = new Point(col * sl + sl/2, row * sl + sl/2);
    }

    protected Piece(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    protected void setSquare(Point pos) {
        if((pos.x < 0 || pos.x > Constants.windowDimension.height) ||
                (pos.y < 0 || pos.y > Constants.windowDimension.height))
        {
            return;
        }

        row = pos.y / Constants.squareLength;
        col = pos.x / Constants.squareLength;
    }

    public void draw(Graphics g) {
        int sl = Constants.squareLength;
//        g.drawImage(image, centerPos.x - image.getWidth(null), centerPos.y - image.getHeight(null), null);
        g.drawImage(image, centerPos.x - sl/2, centerPos.y - sl/2, sl, sl, null);
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