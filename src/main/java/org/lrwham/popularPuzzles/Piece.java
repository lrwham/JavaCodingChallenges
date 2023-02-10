package org.lrwham.popularPuzzles;

class Piece {
    private int column;
    private int row;

    public Piece(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public boolean underAttack(Piece p) {
        return p.getColumn() == this.column || p.getRow() == this.row || sameDiagonal(p);
    }

    private boolean sameDiagonal(Piece p) {
        if (Math.abs(p.row - this.row) == Math.abs(p.column - this.column)) {
            return true;
        } else {
            return false;
        }
    }

    public void incrementColumn() {
        column++;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
