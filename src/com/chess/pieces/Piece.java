package com.chess.pieces;

public abstract class Piece {

    private boolean dead = false;
    private boolean white = false;

    public Piece(boolean white) {
        this.setWhite(white);
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    @Override
    public String toString() {
        if (white) {
            return "White " + this.getClass().getSimpleName();
        }
        else {
            return "Black " + this.getClass().getSimpleName();
        }
    }

    // TODO: Move method?
}
