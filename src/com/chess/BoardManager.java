package com.chess;

import com.chess.pieces.*;

public class BoardManager {

    Square[][] squareArray = new Square[8][8];

    public BoardManager(){
        emptyBoard();
    }

    public Square[][] setup(){
        // white pieces
        squareArray[0][0] = new Square(new Rook(true), 0,0);
        squareArray[0][1] = new Square(new Knight(true), 0,1);
        squareArray[0][2] = new Square(new Bishop(true), 0,2);
        squareArray[0][3] = new Square(new King(true), 0,3);
        squareArray[0][4] = new Square(new Queen(true), 0,4);
        squareArray[0][5] = new Square(new Bishop(true), 0,5);
        squareArray[0][6] = new Square(new Knight(true), 0,6);
        squareArray[0][7] = new Square(new Rook(true), 0,7);
        squareArray[1][0] = new Square(new Pawn(true), 1,0);
        squareArray[1][1] = new Square(new Pawn(true), 1,1);
        squareArray[1][2] = new Square(new Pawn(true), 1,2);
        squareArray[1][3] = new Square(new Pawn(true), 1,3);
        squareArray[1][4] = new Square(new Pawn(true), 1,4);
        squareArray[1][5] = new Square(new Pawn(true), 1,5);
        squareArray[1][6] = new Square(new Pawn(true), 1,6);
        squareArray[1][7] = new Square(new Pawn(true), 1,7);

        // black pieces
        squareArray[7][0] = new Square(new Rook(false), 7,0);
        squareArray[7][1] = new Square(new Knight(false), 7,1);
        squareArray[7][2] = new Square(new Bishop(false), 7,2);
        squareArray[7][3] = new Square(new King(false), 7,3);
        squareArray[7][4] = new Square(new Queen(false), 7,4);
        squareArray[7][5] = new Square(new Bishop(false), 7,5);
        squareArray[7][6] = new Square(new Knight(false), 7,6);
        squareArray[7][7] = new Square(new Rook(false), 7,7);
        squareArray[6][0] = new Square(new Pawn(false), 6,0);
        squareArray[6][1] = new Square(new Pawn(false), 6,1);
        squareArray[6][2] = new Square(new Pawn(false), 6,2);
        squareArray[6][3] = new Square(new Pawn(false), 6,3);
        squareArray[6][4] = new Square(new Pawn(false), 6,4);
        squareArray[6][5] = new Square(new Pawn(false), 6,5);
        squareArray[6][6] = new Square(new Pawn(false), 6,6);
        squareArray[6][7] = new Square(new Pawn(false), 6,7);

        // remaining squares are empty
        for (int i = 2; i < 6; i++){
            for (int j = 0; j < 8; j++){
                squareArray[i][j] = new Square(null, i, j);
            }
        }
        return squareArray;
    }

    public Square[][] emptyBoard(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                squareArray[i][j] = new Square(null, i, j);
            }
        }
        return squareArray;
    }

    public void showBoard(Square[][] board){
        for (int row = 0; row < board.length; row++){
            for (int column = 0; column < board[row].length; column++){
                System.out.print("[" + board[row][column].getPiece() + "] ");
            }
            System.out.print("\n");
        }
    }

}
