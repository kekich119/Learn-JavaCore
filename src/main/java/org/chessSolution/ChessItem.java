package org.chessSolution;

public abstract class  ChessItem {
    int x;
    int y;
    private int value;


    public int getValue(){
        return value;
    }

    public abstract void draw();

}
