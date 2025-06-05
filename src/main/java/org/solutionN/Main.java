package org.solutionN;

public class Main {
    public static void main(String[] args) {
        ChessPiece[] chess = {
                new Bishop(),
                new King(),
                new Queen(),
                new Rook(),
                new Knight()
        };
        for(ChessPiece chessPiece : chess){
            chessPiece.move();
        }
    }
}
