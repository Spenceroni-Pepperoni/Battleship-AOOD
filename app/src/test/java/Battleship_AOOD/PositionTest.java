package Battleship_AOOD;

import src.main.java.Battleship_AOOD.Position;
import org.junit.Test;


public class PositionTest {
    Position pos1 = new Position(5, 'D');
    Position pos2 = new Position(0, 0);

    @Test
    public void testPosition(){
        System.out.println(pos1.toString());
        System.out.println(pos1.getColIndex() + " Col index");
        System.out.println(pos1.getRowIndex() + " Row index");

        System.out.println(pos2.toString());
        System.out.println(pos1.getCol() + " Col");
        System.out.println(pos1.getRow() + " Row");


    }
}
