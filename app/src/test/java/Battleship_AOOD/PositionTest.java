package Battleship_AOOD;

import org.junit.Test;


public class PositionTest {
    Position pos1 = new Position(5, 'D');
    Position pos2 = new Position(0, 0);

    @Test
    public void testPosition(){
        System.out.println(pos1.toString());
        System.out.println(pos1.columnIndex() + " Col index");
        System.out.println(pos1.rowIndex() + " Row index");

        System.out.println(pos2.toString());
        System.out.println(pos1.column() + " Col");
        System.out.println(pos1.row() + " Row");


    }
}
