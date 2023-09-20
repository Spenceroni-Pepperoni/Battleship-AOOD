package Battleship_AOOD;

import org.junit.Test;


public class OceanTest {
    Ocean ocean = new Ocean();
    
    @Test
    public void testOcean(){
        try{
        ocean.placeBoat("Battleship", "vertical", new Position('J', 5));
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
