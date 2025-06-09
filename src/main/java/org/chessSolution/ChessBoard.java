package org.chessSolution;

import java.util.ArrayList;

public class ChessBoard {
    public static void drawAllChessItems(){
        ArrayList<ChessItem> list = new ArrayList<>();
        list.add(new King());
        list.add(new Queen());
        list.add(new Bishop());

        for (ChessItem items : list){
            items.draw();
        }
    }


    public static void main(String[] args){
        drawAllChessItems();
    }

}
