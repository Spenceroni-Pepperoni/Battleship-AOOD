package Battleship_AOOD;

class Position{
    private int col;
    private char row;

    public Position(int col, char row){
        this.col = col;
        this.row = row;
    }

    public char getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public String toString(){
        return (row + "-" + col);
    }
}
