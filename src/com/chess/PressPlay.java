package com.chess;

public class PressPlay {

    public static void main(String[] args) {

        BoardManager boardManager = new BoardManager();

        boardManager.showBoard(boardManager.setup());

    }
}
