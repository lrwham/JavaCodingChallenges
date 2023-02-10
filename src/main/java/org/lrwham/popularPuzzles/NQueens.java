package org.lrwham.popularPuzzles;
import java.util.Stack;
public class NQueens {


    private int n;
    private int validArrangements;

    public NQueens(int n) {
        this.n = n;
        validArrangements = 0;
    }

    public void check(){
        Stack<Piece> queens = new Stack<Piece>();

        int placed = 0;
        int rowsFilled = 0;

        while(placed < n){
            queens.add(new Piece(1,rowsFilled + 1));

        }

    }

//    private boolean isValid(Stack<Piece> board){
//        if(board.size() < 2) return true;
//
//
//    }
}
