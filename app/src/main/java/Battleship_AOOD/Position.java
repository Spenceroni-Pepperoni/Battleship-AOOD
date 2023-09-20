package Battleship_AOOD;

public class Position{
    private int col;
    private char row;
    private int rowIndex;
    private int colIndex;


    public Position(int col, char row){
        this.col = col;
        this.row = row;

        colIndex = col-1;
        switch(row){
            case 'A': rowIndex = 0;break;
            case 'B': rowIndex = 1;break;
            case 'C': rowIndex = 2;break;
            case 'D': rowIndex = 3;break;
            case 'E': rowIndex = 4;break;
            case 'F': rowIndex = 5;break;
            case 'G': rowIndex = 6;break;
            case 'H': rowIndex = 7;break;
            case 'I': rowIndex = 8;break;
            case 'J': rowIndex = 9;break;
            default: System.out.println("Invalid row char");
        }
    }
    
    public Position(int colIndex, int rowIndex){
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;

        col = colIndex;
        switch(rowIndex+1){
            case 1: row = 'A';break;
            case 2: row = 'B';break;
            case 3: row = 'C';break;
            case 4: row = 'D';break;
            case 5: row = 'E';break;
            case 6: row = 'F';break;
            case 7: row = 'G';break;
            case 8: row = 'H';break;
            case 9: row = 'I';break;
            case 10: row = 'J';break;
            default: System.out.println("Invalid row index");
        }
    }

    public char getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public int getRowIndex(){
        return rowIndex;
    }

    public int getColIndex(){
        return colIndex;
    }

    public String toString(){
        return (row + "-" + col);
    }
}
