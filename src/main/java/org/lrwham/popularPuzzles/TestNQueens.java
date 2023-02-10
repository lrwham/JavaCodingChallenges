package org.lrwham.popularPuzzles;

public class TestNQueens {
    public static void main(String args[]){
        Piece a = new Piece(1,1);
        Piece b = new Piece(1, 3);

        System.out.println(a.underAttack(b));
        System.out.println(b.underAttack(a));

    }
}
