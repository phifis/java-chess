package Chess;

import javax.swing.*;
import java.awt.*;

import FileIO.SpriteManager;
import Pieces.*;
import Constants.Constants;

public class ChessBoard extends JPanel {
    Dimension boardSize;

    Piece[][] boardLayout = new Piece[8][8];

    SpriteManager spriteManager;

    public ChessBoard(Dimension windowDimension) {

        Constants.squareLength = windowDimension.height / 8;
        spriteManager = new SpriteManager((int)(0.8 * Constants.squareLength));
        boardSize = new Dimension(windowDimension.height, windowDimension.height);

        setPreferredSize(boardSize);
        initBoard();
    }

    private void initBoard() {
        boardLayout[0][0] = new Rook(PieceColor.BLACK, spriteManager.get("black_rook"), 0, 0);
        boardLayout[0][1] = new Knight(PieceColor.BLACK, spriteManager.get("black_knight"), 0, 1);
        boardLayout[0][2] = new Bishop(PieceColor.BLACK, spriteManager.get("black_bishop"), 0, 2);
        boardLayout[0][3] = new Queen(PieceColor.BLACK, spriteManager.get("black_queen"), 0, 3);
        boardLayout[0][4] = new King(PieceColor.BLACK, spriteManager.get("black_king"), 0, 4);
        boardLayout[0][5] = new Bishop(PieceColor.BLACK, spriteManager.get("black_knight"), 0, 5);
        boardLayout[0][6] = new Knight(PieceColor.BLACK, spriteManager.get("black_bishop"), 0, 6);
        boardLayout[0][7] = new Rook(PieceColor.BLACK, spriteManager.get("black_rook"), 0, 7);

        for (int i = 0; i < 8; i++) {
            boardLayout[1][i] = new Pawn(PieceColor.BLACK, spriteManager.get("black_pawn"), 1, i);
            boardLayout[6][i] = new Pawn(PieceColor.WHITE, spriteManager.get("white_pawn"), 6, i);
        }

        boardLayout[7][0] = new Rook(PieceColor.WHITE, spriteManager.get("white_rook"), 7, 0);
        boardLayout[7][1] = new Knight(PieceColor.WHITE, spriteManager.get("white_knight"), 7, 1);
        boardLayout[7][2] = new Bishop(PieceColor.WHITE, spriteManager.get("white_bishop"), 7, 2);
        boardLayout[7][3] = new Queen(PieceColor.WHITE, spriteManager.get("white_queen"), 7, 3);
        boardLayout[7][4] = new King(PieceColor.WHITE, spriteManager.get("white_king"), 7, 4);
        boardLayout[7][5] = new Bishop(PieceColor.WHITE, spriteManager.get("white_knight"), 7, 5);
        boardLayout[7][6] = new Knight(PieceColor.WHITE, spriteManager.get("white_bishop"), 7, 6);
        boardLayout[7][7] = new Rook(PieceColor.WHITE, spriteManager.get("white_rook"), 7, 7);

        // empty spaces
        for(int i = 2; i < 6; ++i)
        {
            for(int j = 0; j < 8; ++j)
            {
                boardLayout[i][j] = new Empty();
            }
        }
    }

    // ######### Methods for drawing ########

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawBoard(g);

        drawPieces(g);
    }

    private void drawBoard(Graphics g) {
        for (int file = 0; file < 8; ++file) {
            for (int row = 0; row < 8; ++row) {
                if ((file + row) % 2 == 0)
                    g.setColor(Constants.COLOR_LIGHT_SQUARE);
                else
                    g.setColor(Constants.COLOR_DARK_SQUARE);
                g.fillRect(Constants.squareLength * file, Constants.squareLength * row, Constants.squareLength, Constants.squareLength);
            }
        }
    }

    private void drawPieces(Graphics g)
    {
        for(int row = 0; row < 8; ++row){
            for(int col = 0; col < 8; ++col){
                boardLayout[row][col].draw(g);
            }
        }
    }


}
