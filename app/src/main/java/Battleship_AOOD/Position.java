//------------------------------------------------------------------------------
// Parker Strickland THANKS PARKER!!!!
// 8/13/23
// The Position Class
//------------------------------------------------------------------------------
package Battleship_AOOD;

class Position{
    private char rowChar;
    private int columnNum;
    private int rowIndexNum;
    private int colIndexNum;

    //------------------------------------------------------------------------------
    // Char parameter and int parameter constructor for Position class
    // @param char rowChar The character of the selected row
    // @param int columnNum The number of the selected column
    //------------------------------------------------------------------------------
    public Position(char rowChar, int columnNum){
        this.rowChar = rowChar;
        this.columnNum = columnNum;
        rowIndexNum = rowIndex();
        colIndexNum = columnIndex();
    }

    //------------------------------------------------------------------------------
    // Two int parameter constructor for Position class
    // @param int rowIndexNum The number of the index of the selected row
    // @param int columnIndexNum The number of the index of the selected column
    //------------------------------------------------------------------------------
    public Position(int rowIndexNum, int colIndexNum){
        this.rowIndexNum = rowIndexNum;
        this.colIndexNum = colIndexNum;
        columnNum = colIndexNum + 1;
        rowChar = (char)(rowIndexNum + 'A');
    }

    //------------------------------------------------------------------------------
    // @return A character (upper case letter) corresponding to the row represented
    // in the position.
    //------------------------------------------------------------------------------
    public char row(){
        return rowChar;
    }

    //------------------------------------------------------------------------------
    // @return An integer corresponding to the column represented in the
    // position.
    //------------------------------------------------------------------------------
    public int column(){
        return columnNum;
    }

    //------------------------------------------------------------------------------
    // @return Integers between 0 and 9 for the row. A corresponds to 0, B to 1, etc
    //------------------------------------------------------------------------------
    public int rowIndex(){
        char temp1 = row();
        return (char)(temp1 - 'A');
    }

    //------------------------------------------------------------------------------
    // @return An integer between 0 and 9 for the column. The index is be one less
    // than the number visible to the player
    //------------------------------------------------------------------------------
    public int columnIndex(){
        return columnNum - 1;
    }

    //------------------------------------------------------------------------------
    // @return a string containing the character for the row, followed by a
    // hyphen (“-“) followed by the number for the column. I.e. B-9.
    //------------------------------------------------------------------------------
    public String toString(){
        return row() + "-" + column();
    }

}