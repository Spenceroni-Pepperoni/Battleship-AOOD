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
        switch (row) {
            case 'A' -> rowIndex = 0;
            case 'B' -> rowIndex = 1;
            case 'C' -> rowIndex = 2;
            case 'D' -> rowIndex = 3;
            case 'E' -> rowIndex = 4;
            case 'F' -> rowIndex = 5;
            case 'G' -> rowIndex = 6;
            case 'H' -> rowIndex = 7;
            case 'I' -> rowIndex = 8;
            case 'J' -> rowIndex = 9;
            default -> System.out.println("Invalid row char");
        }
    }
    
    public Position(int colIndex, int rowIndex){
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;

        col = colIndex;
        switch (rowIndex + 1) {
            case 1 -> row = 'A';
            case 2 -> row = 'B';
            case 3 -> row = 'C';
            case 4 -> row = 'D';
            case 5 -> row = 'E';
            case 6 -> row = 'F';
            case 7 -> row = 'G';
            case 8 -> row = 'H';
            case 9 -> row = 'I';
            case 10 -> row = 'J';
            default -> System.out.println("Invalid row index");
        }
    }

    public char row(){
        return row;
    }

    public int column(){
        return col;
    }

    public int rowIndex(){
        return rowIndex;
    }

    public int columnIndex(){
        return colIndex;
    }

    public String toString(){
        return (row + "-" + col);
    }
}
